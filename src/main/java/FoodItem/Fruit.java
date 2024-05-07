package FoodItem;


public class Fruit extends Food {
public Fruit(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}



// Method that prints all of the Fruit Names



public static void printFruitRecipes() {
    

    System.out.println("1. Fruit Salad");
    System.out.println("2. Smoothie");
    System.out.println("3. Fruit Parfait");

}

// Method that prints nutritional Values based off of .json values.


public static void printFruitNutritionalRecomendations () {
    

    System.out.println("Recommendation abcd.");

}


//Method that prints common recipe's with fruits based off of .json values.

}
