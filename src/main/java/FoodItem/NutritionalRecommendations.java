package FoodItem;

public class NutritionalRecommendations {
	public String getReccomendationsForCategory(String category) {
		switch (category.toLowerCase()) {
		case "fruits":
			return "Focus on whole fruits. The amount of fruit you need to eat depends on age, height, weight, and physical activity.";
		case "vegetables":
			return "Vary your veggies. The amount of food from the Vegetable Group you need to eat depends on age, height, weight, and physical activity.";
		case "grains":
			return "Vary your grains. The amount of grain foods you need to eat depends on age, height, weight, and physical activity.";
		case "protein foods":
			return "Vary your proteins. The amount of protein food you need to eat depends on age, height, weight, and physical activity.";
		case "dairy":
			return "Move to low-fat or fat-free dairy milk or yogurt.  The amount of dairy foods you need to eat depends on age, height, weight, and physical activity.";
		default:
			return "Nutritional reccomendations for this category are not available.";
		}
	}

}
