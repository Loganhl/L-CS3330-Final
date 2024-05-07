package FoodItem;


public class Vegetables extends Food {
public Vegetables(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}
public static void printVegetableRecipes() {
    

    System.out.println"Quinoa Salad Recipe:\n Ingredients:\n- Cooked quinoa\n- Assorted vegetables (e.g., cherry tomatoes, cucumbers, red onion, bell peppers)\n- Feta cheese, crumbled\n- Fresh herbs (e.g., parsley, mint)\n- Lemon vinaigrette\nInstructions:\n1. In a large bowl, combine cooked quinoa and chopped vegetables.\n2. Add crumbled feta cheese and fresh herbs.\n3. Drizzle with lemon vinaigrette and toss to coat.\n4. Season with salt and pepper to taste.\n5. Serve chilled or at room temperature.";
			

}

// Method that prints nutritional Values based off of .json values.


public static void printFruitNutritionalRecomendations () {
    

    System.out.println("Vegetable Stir-Fry Recipe: Ingredients: \n-(Assorted Vegetables e.g., bell peppers, broccoli, carrots, snap peas, mushrooms \n-Garlic, minced\n- Ginger, grated\n- Soy sauce\n Sesame oil\\n- Rice or noodles\\nInstructions:\\n1. Heat sesame oil in a large skillet or wok over medium-high heat.\\n2. Add minced garlic and grated ginger, sauté until fragrant.\\n3. Add chopped vegetables and stir-fry until tender-crisp.\\n4. Drizzle with soy sauce and toss to coat.\\n5. Serve over cooked rice or noodles.)";

  }	
}
