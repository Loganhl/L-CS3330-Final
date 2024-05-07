package FoodItem;

/**
 * The Dairy class represents dairy food items.
 * It extends the Food class and provides specific functionality
 * and information related to dairy products.
 */
public class Dairy extends Food {
	
    /**
     * Constructs a new Dairy object with the given parameters.
     *
     * @param foodName       The name of the dairy food item.
     * @param servingSize    The serving size of the dairy food item.
     * @param calories       The number of calories in the dairy food item.
     * @param fats           The amount of fats in the dairy food item.
     * @param cholesterol    The amount of cholesterol in the dairy food item.
     * @param sodium         The amount of sodium in the dairy food item.
     * @param carbohydrates  The amount of carbohydrates in the dairy food item.
     * @param protein        The amount of protein in the dairy food item.
     */
	public Dairy(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
		super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
	}
	
    /**
     * Prints a recommended dairy recipe.
     */
	public static void printDairyRecipes() {
		System.out.println("Greek Yogurt Parfait Recipe:\nIngredients:\n- Greek yogurt\n- Granola\n- Fresh berries (e.g., strawberries, blueberries, raspberries)\n- Honey\nInstructions:\n1. In a glass or bowl, layer Greek yogurt, granola, and fresh berries.\n2. Drizzle honey over the top.\n3. Repeat layers if desired.\n4. Serve immediately as a nutritious breakfast or snack.");
		
	}


    /**
     * Prints nutritional recommendations for dairy consumption.
     */
	public static void printDairyNutritionalRecomendations () {
		System.out.println("Move to low-fat or fat-free dairy milk or yogurt.  The amount of dairy foods you need to eat depends on age, height, weight, and physical activity.");
	}	
}

