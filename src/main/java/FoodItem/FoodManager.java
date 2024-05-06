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
    
public static void addFood(String userInput) {
    	
        // Splits the user's input into individual values.
        String[] foodData = userInput.split(",");
        
        // Check if the user's input contains all needed values.
        if (foodData.length == 8) {
        	
            // Extract food information from the array
            String foodGroup = foodData[0].trim();
            String foodName = foodData[1].trim();
            int calories = Integer.parseInt(foodData[2].trim());
            double fats = Double.parseDouble(foodData[3].trim());
            int cholesterol = Integer.parseInt(foodData[4].trim());
            int sodium = Integer.parseInt(foodData[5].trim());
            int carbohydrates = Integer.parseInt(foodData[6].trim());
            double protein = Double.parseDouble(foodData[7].trim());

            // Create a Food object.
            Food food = new Food(foodGroup, foodName, calories, fats, cholesterol, sodium, carbohydrates, protein);
            
            // Code to add the food to the json file.
            
            // Prints the added food.
            System.out.println("Food added:");
            System.out.println(food);
        } else {
            System.out.println("Invalid input. Please make sure to enter all food information correctly..");
        }
    }
}