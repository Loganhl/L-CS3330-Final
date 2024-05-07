package FoodItem;


public class Grains extends Food {
public Grains(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}
public static void printGrainsRecipes() {
    

    System.out.println("Quinoa Salad Recipe:\n Ingredients:\n- Cooked quinoa\n- Assorted vegetables (e.g., cherry tomatoes, cucumbers, red onion, bell peppers)\n- Feta cheese, crumbled\n- Fresh herbs (e.g., parsley, mint)\n- Lemon vinaigrette\nInstructions:\n1. In a large bowl, combine cooked quinoa and chopped vegetables.\n2. Add crumbled feta cheese and fresh herbs.\n3. Drizzle with lemon vinaigrette and toss to coat.\n4. Season with salt and pepper to taste.\n5. Serve chilled or at room temperature.");
			

}

// Method that prints nutritional Values based off of .json values.


public static void printFruitNutritionalRecomendations () {
    

    System.out.println("Vary your grains. The amount of grain foods you need to eat depends on age, height, weight, and physical activity.)");

  }
	
}
