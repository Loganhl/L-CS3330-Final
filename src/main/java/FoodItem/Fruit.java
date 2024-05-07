package FoodItem;


public class Fruit extends Food {
public Fruit(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
	super(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
}



// Method that prints all of the Fruit Names



public static void printFruitRecipes() {
    

    System.out.println("1. Fruit Salad: Ingredients: \n-(Assorted Fruits e.g., strawberries, blueberries, grapes, kiwi, pineapple) : \n- Instructions: \n1. Wash and chop fruits. \n2. Combine Fruits in bowl. \n3. Toss gently to mix. \n4. Serve chilled.";
    System.out.println("2. Smoothie: Ingredients: \n- (Assorted Fruits e.g., strawberries, blueberries, mango), Greek yogurt, ice cubes : \n- Instructions: \n1. Wash and prepare the fruit. \n2. Place fruit in blender. \n3. Add Greek yogurt in blender. \n4. Add ice cubes to blender. \n5. Blend until smooth and creamy";
    System.out.println("3. Fruit Parfait: Ingredients: \n- (Greek yogurt, granola, assorted fruits e.g., strawberries, blueberries, kiwi, pineapple), honey : \n- Instructions: \n1. In a glass or bowl, layer Greek yogurt at the bottom. \n2. Add a layer of granola on top of the yogurt. \n3. Wash and prepare the fruits by slicing or chopping them into bite-sized pieces. \n4. Add a layer of assorted fruits on top of the granola. \n5. Drizzle honey over the fruits for added sweetness. \n6. Repeat the layers until the glass or bowl is filled. \n7. Serve immediately as a nutritious breakfast or snack, or refrigerate for later.";
    }

}

// Method that prints nutritional Values based off of .json values.


public static void printFruitNutritionalRecomendations () {
    

    System.out.println("Focus on whole fruits. The amount of fruit you need to eat depends on age, height, weight, and physical activity.");

}


//Method that prints common recipe's with fruits based off of .json values.

}
