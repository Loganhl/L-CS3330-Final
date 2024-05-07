package FoodItem;


public class Protein extends Food {
public Protein(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}
	public static void printProteinRecipes() {
    

    System.out.println("Grilled Chicken Recipe:\\nIngredients:\\n- Boneless, skinless chicken breasts\\n- Olive oil\\n- Lemon juice\\n- Garlic, minced\\n- Herbs (e.g., rosemary, thyme, oregano)\\n- Salt and pepper\\nInstructions:\\n1. In a bowl, mix olive oil, lemon juice, minced garlic, and herbs to make a marinade.\\n2. Season chicken breasts with salt and pepper, then add to the marinade. Coat evenly.\\n3. Cover and refrigerate for at least 30 minutes, or up to 4 hours.\\n4. Preheat grill to medium-high heat.\\n5. Grill chicken for 6-8 minutes per side, or until cooked through.\\n6. Let chicken rest for a few minutes before serving.");
			

}

// Method that prints nutritional Values based off of .json values.


public static void printProteinNutritionalRecomendations () {
    

    System.out.println("Vary your proteins. The amount of protein food you need to eat depends on age, height, weight, and physical activity.");
  }	
}
