package FoodItem;

public class Dairy extends Food {
public Dairy(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}
	public static void printDairyRecipes() {
    

    System.out.println("Vegetable Stir-Fry Recipe: Ingredients: \n-(Assorted Vegetables e.g., bell peppers, broccoli, carrots, snap peas, mushrooms \n-Garlic, minced\n- Ginger, grated\n- Soy sauce\n Sesame oil\\n- Rice or noodles\\nInstructions:\\n1. Heat sesame oil in a large skillet or wok over medium-high heat.\\n2. Add minced garlic and grated ginger, sauté until fragrant.\\n3. Add chopped vegetables and stir-fry until tender-crisp.\\n4. Drizzle with soy sauce and toss to coat.\\n5. Serve over cooked rice or noodles.)");
			

}

// Method that prints nutritional Values based off of .json values.


public static void printDairyNutritionalRecomendations () {
    

    System.out.println("Move to low-fat or fat-free dairy milk or yogurt.  The amount of dairy foods you need to eat depends on age, height, weight, and physical activity.");
  }	
}

