package FoodItem;

/**
 * The Grains class represents grain food items.
 * It extends the Food class and provides specific functionality
 * and information related to grain products.
 */
public class Grains extends Food {
	
    /**
     * Constructs a new Grains object with the given parameters.
     *
     * @param foodName       The name of the grain product.
     * @param servingSize    The serving size of the grain product.
     * @param calories       The number of calories in the grain product.
     * @param fats           The amount of fats in the grain product.
     * @param cholesterol    The amount of cholesterol in the grain product.
     * @param sodium         The amount of sodium in the grain product.
     * @param carbohydrates  The amount of carbohydrates in the grain product.
     * @param protein        The amount of protein in the grain product.
     */
public Grains(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}

/**
 * Prints a recommended grains recipe.
 */
public static void printGrainsRecipes() {
    

    System.out.println("Quinoa Salad Recipe:\n Ingredients:\n- Cooked quinoa\n- Assorted vegetables (e.g., cherry tomatoes, cucumbers, red onion, bell peppers)\n- Feta cheese, crumbled\n- Fresh herbs (e.g., parsley, mint)\n- Lemon vinaigrette\nInstructions:\n1. In a large bowl, combine cooked quinoa and chopped vegetables.\n2. Add crumbled feta cheese and fresh herbs.\n3. Drizzle with lemon vinaigrette and toss to coat.\n4. Season with salt and pepper to taste.\n5. Serve chilled or at room temperature.");
			

}

/**
 * Prints nutritional recommendations for grain consumption.
 */
public static void printGrainNutritionalRecomendations () {
    

    System.out.println("Vary your grains. The amount of grain foods you need to eat depends on age, height, weight, and physical activity.)");

  }
	
}
