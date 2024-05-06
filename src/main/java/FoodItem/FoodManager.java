package FoodItem;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import java.io.IOException;
import java.nio.file.Files;
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
                    return context.deserialize(json, Fruit.class);
                case "Vegetables":
                    return context.deserialize(json, Vegetables.class);
                case "Grains":
                    return context.deserialize(json, Grains.class);
                case "Protein Foods":
                    return context.deserialize(json, Protein.class);
                case "Dairy":
                    return context.deserialize(json, Dairy.class);
                
                // Handle other food types if necessary
                default:
                    throw new JsonParseException("Unknown food type: " + foodType);
            }
        }
    }
}