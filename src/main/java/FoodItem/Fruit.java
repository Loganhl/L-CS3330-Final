package FoodItem;


public class Fruit extends Food {
public Fruit(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}



// Method that prints all of the Fruit Names



public static void printFruitRecipes() {
    

    System.out.println("1. Fruit Salad: Ingredients: \n-(Assorted Fruits e.g., strawberries, blue \n2. Add a layer of granola on top of the yogurt. \n3. Wash and prepare the fruits by slicing or chopping them into bite-sized pieces. \n4. Add a layer of assorted fruits on top of the granola. \n5. Drizzle honey over the fruits for added sweetness. \n6. Repeat the layers until the glass or bowl is filled. \n7. Serve immediately as a nutritious breakfast or snack, or refrigerate for later.");
    

}

// Method that prints nutritional Values based off of .json values.


public static void printFruitNutritionalRecomendations () {
    

    System.out.println("Focus on whole fruits. The amount of fruit you need to eat depends on age, height, weight, and physical activity.");

}


//Method that prints common recipe's with fruits based off of .json values.

}
