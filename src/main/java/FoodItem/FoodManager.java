package FoodItem;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;


public class FoodManager {
    private Gson gson;

    public FoodManager() {
        // Create Gson instance with custom deserializer
        gson = new GsonBuilder().registerTypeAdapter(Food.class, new FoodDeserializer()).create();
    }

    public Food parseFoodFromFile(String fileName) throws IOException {
        // Read JSON string from file
        String jsonString = new String(Files.readAllBytes(Paths.get(fileName)));

        // Parse JSON string to Food object
        return gson.fromJson(jsonString, Food.class);
    }

    // Custom deserializer to handle parsing of subclasses
    private static class FoodDeserializer implements JsonDeserializer<Food> {
        @Override
        public Food deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject = json.getAsJsonObject();
            String foodType = jsonObject.get("foodType").getAsString();

            switch (foodType) {
                case "Fruit":
                    return context.deserialize(jsonObject, Fruit.class);
                case "Vegetables":
                    return context.deserialize(jsonObject, Vegetables.class);
                case "Grains":
                    return context.deserialize(jsonObject, Grains.class);
                case "Protein Foods":
                    return context.deserialize(jsonObject, Protein.class);
                case "Dairy":
                    return context.deserialize(jsonObject, Dairy.class);

                // Handle other food types if necessary
                default:
                    throw new JsonParseException("Unknown food type: " + foodType);
            }
        }
    }
}
