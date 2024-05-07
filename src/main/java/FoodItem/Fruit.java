package FoodItem;

/**
 * The Fruit class represents fruit food items.
 * It extends the Food class and provides specific functionality
 * and information related to fruit products.
 */
public class Fruit extends Food {
	

    /**
     * Constructs a new Fruit object with the given parameters.
     *
     * @param foodName       The name of the fruit.
     * @param servingSize    The serving size of the fruit.
     * @param calories       The number of calories in the fruit.
     * @param fats           The amount of fats in the fruit.
     * @param cholesterol    The amount of cholesterol in the fruit.
     * @param sodium         The amount of sodium in the fruit.
     * @param carbohydrates  The amount of carbohydrates in the fruit.
     * @param protein        The amount of protein in the fruit.
     */
	public Fruit(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
		super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
	}



    /**
     * Prints a recommended fruit recipe.
     */
public static void printFruitRecipes() {
    

    System.out.println("1. Fruit Salad: Ingredients: \n-(Assorted Fruits e.g., strawberries, blue \n2. Add a layer of granola on top of the yogurt. \n3. Wash and prepare the fruits by slicing or chopping them into bite-sized pieces. \n4. Add a layer of assorted fruits on top of the granola. \n5. Drizzle honey over the fruits for added sweetness. \n6. Repeat the layers until the glass or bowl is filled. \n7. Serve immediately as a nutritious breakfast or snack, or refrigerate for later.");
    

}

/**
 * Prints nutritional recommendations for fruit consumption.
 */
public static void printFruitNutritionalRecomendations () {
    

    System.out.println("Focus on whole fruits. The amount of fruit you need to eat depends on age, height, weight, and physical activity.");

}




}
