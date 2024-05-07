package FoodItem;


public class Vegetables extends Food {
public Vegetables(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}
public static void printVegetableRecipes() {
    

    System.out.println("Vegetable Stir-Fry Recipe: Ingredients: \n-(Assorted Vegetables e.g., bell peppers, broccoli, carrots, snap peas, mushrooms \n-Garlic, minced\n- Ginger, grated\n- Soy sauce\n Sesame oil\\n- Rice or noodles\\nInstructions:\\n1. Heat sesame oil in a large skillet or wok over medium-high heat.\\n2. Add minced garlic and grated ginger, sauté until fragrant.\\n3. Add chopped vegetables and stir-fry until tender-crisp.\\n4. Drizzle with soy sauce and toss to coat.\\n5. Serve over cooked rice or noodles.)");
			

}

// Method that prints nutritional Values based off of .json values.


public static void printVegetableNutritionalRecomendations () {
    

    System.out.println("Vary your veggies. The amount of food from the Vegetable Group you need to eat depends on age, height, weight, and physical activity.");
  }	
}
