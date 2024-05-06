package FoodItem;


public class Fruit extends Food {
public Fruit(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein, String recipe, String nutritionalRecommendation) {
	super(foodName, foodName, nutritionalRecommendation, calories, fats, calories, calories, calories, fats, foodName, foodName);
}



// Method that prints all of the Fruits

public static void printFruitRecipes() {
    // Here you can define and print common recipes using fruits based on the JSON values
    System.out.println("===============================");
    System.out.println("Common Fruit Recipes:");
    System.out.println("1. Fruit Salad");
    System.out.println("2. Smoothie");
    System.out.println("3. Fruit Parfait");
    System.out.println("===============================");
}

// Method that prints nutritional Values based off of .json values.

//Method that prints common recipe's with fruits based off of .json values.

}