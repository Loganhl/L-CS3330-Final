package FoodItem;

/**
 * The Vegetables class represents vegetable food items.
 * It extends the Food class and provides specific functionality
 * and information related to vegetable products.
 */
public class Vegetables extends Food {
	
    /**
     * Constructs a new Vegetables object with the given parameters.
     *
     * @param foodName       The name of the vegetable product.
     * @param servingSize    The serving size of the vegetable product.
     * @param calories       The number of calories in the vegetable product.
     * @param fats           The amount of fats in the vegetable product.
     * @param cholesterol    The amount of cholesterol in the vegetable product.
     * @param sodium         The amount of sodium in the vegetable product.
     * @param carbohydrates  The amount of carbohydrates in the vegetable product.
     * @param protein        The amount of protein in the vegetable product.
     */
public Vegetables(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}

/**
 * Prints a recommended vegetable-rich recipe.
 */
public static void printVegetableRecipes() {
    

    System.out.println("Vegetable Stir-Fry Recipe: Ingredients: \n-(Assorted Vegetables e.g., bell peppers, broccoli, carrots, snap peas, mushrooms \n-Garlic, minced\n- Ginger, grated\n- Soy sauce\n Sesame oil\\n- Rice or noodles\\nInstructions:\\n1. Heat sesame oil in a large skillet or wok over medium-high heat.\\n2. Add minced garlic and grated ginger, sauté until fragrant.\\n3. Add chopped vegetables and stir-fry until tender-crisp.\\n4. Drizzle with soy sauce and toss to coat.\\n5. Serve over cooked rice or noodles.)");
			

}

/**
 * Prints nutritional recommendations for vegetable consumption.
 */
public static void printVegetableNutritionalRecomendations () {
    

    System.out.println("Vary your veggies. The amount of food from the Vegetable Group you need to eat depends on age, height, weight, and physical activity.");
  }	
}
