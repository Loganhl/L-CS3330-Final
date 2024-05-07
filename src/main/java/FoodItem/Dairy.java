package FoodItem;

public class Dairy extends Food {
public Dairy(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}
	public static void printDairyRecipes() {
    

    System.out.println("Greek Yogurt Parfait Recipe:\nIngredients:\n- Greek yogurt\n- Granola\n- Fresh berries (e.g., strawberries, blueberries, raspberries)\n- Honey\nInstructions:\n1. In a glass or bowl, layer Greek yogurt, granola, and fresh berries.\n2. Drizzle honey over the top.\n3. Repeat layers if desired.\n4. Serve immediately as a nutritious breakfast or snack.");
			

}

// Method that prints nutritional Values based off of .json values.


public static void printDairyNutritionalRecomendations () {
    

    System.out.println("Move to low-fat or fat-free dairy milk or yogurt.  The amount of dairy foods you need to eat depends on age, height, weight, and physical activity.");
  }	
}

