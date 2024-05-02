package FoodCategories;

public class DairyCategory implements FoodCategoryInterface{
	public String getName() {
		return "Dairy";
	}

	@Override
	public String getKeyMessage() {
		return null;
	}

	@Override
	public String getIncludedFoods() {
		return null;
	}

	@Override
	public String getRecommendedAmount() {
		return null;
	}

}
