package FoodItem;

public class Recipes {
	//method that takes food category name and returns a simple recipe for that category
	public String getRecipeForCategory(String category) {
		switch (category.toLowerCase()) {
		case "fruits":
			return "Fruit Salad Recipe: Ingredients:\n- (Assorted Fruits e.g., strawberries, blueberries, grapes, kiwi, pineapple) : \n- Instructions: \n-1. Wash and chop fruits. \n2. Combine Fruits in bowl. \n3. Toss gently to mix. \n4. Serve chilled.";
		case "vegetables":
			return "Vegetable Stir-Fry Recipe: Ingredients: \n-(Assorted Vegetables e.g., bell peppers, broccoli, carrots, snap peas, mushrooms \n-Garlic, minced\n- Ginger, grated\n- Soy sauce\n Sesame oil\\n- Rice or noodles\\nInstructions:\\n1. Heat sesame oil in a large skillet or wok over medium-high heat.\\n2. Add minced garlic and grated ginger, sauté until fragrant.\\n3. Add chopped vegetables and stir-fry until tender-crisp.\\n4. Drizzle with soy sauce and toss to coat.\\n5. Serve over cooked rice or noodles";
		case "grains":
			return "Quinoa Salad Recipe:\nIngredients:\n- Cooked quinoa\n- Assorted vegetables (e.g., cherry tomatoes, cucumbers, red onion, bell peppers)\n- Feta cheese, crumbled\n- Fresh herbs (e.g., parsley, mint)\n- Lemon vinaigrette\nInstructions:\n1. In a large bowl, combine cooked quinoa and chopped vegetables.\n2. Add crumbled feta cheese and fresh herbs.\n3. Drizzle with lemon vinaigrette and toss to coat.\n4. Season with salt and pepper to taste.\n5. Serve chilled or at room temperature.";
			
		case "protein foods":
			return "return \"Grilled Chicken Recipe:\\nIngredients:\\n- Boneless, skinless chicken breasts\\n- Olive oil\\n- Lemon juice\\n- Garlic, minced\\n- Herbs (e.g., rosemary, thyme, oregano)\\n- Salt and pepper\\nInstructions:\\n1. In a bowl, mix olive oil, lemon juice, minced garlic, and herbs to make a marinade.\\n2. Season chicken breasts with salt and pepper, then add to the marinade. Coat evenly.\\n3. Cover and refrigerate for at least 30 minutes, or up to 4 hours.\\n4. Preheat grill to medium-high heat.\\n5. Grill chicken for 6-8 minutes per side, or until cooked through.\\n6. Let chicken rest for a few minutes before serving.";
		case "dairy":
            return "Greek Yogurt Parfait Recipe:\nIngredients:\n- Greek yogurt\n- Granola\n- Fresh berries (e.g., strawberries, blueberries, raspberries)\n- Honey\nInstructions:\n1. In a glass or bowl, layer Greek yogurt, granola, and fresh berries.\n2. Drizzle honey over the top.\n3. Repeat layers if desired.\n4. Serve immediately as a nutritious breakfast or snack.";
        default:
            return "Recipe for this category is not available.";	
		}
	}

}
