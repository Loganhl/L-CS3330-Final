package FoodItem;

public class FoodData {
	private String name;
	private double calories;
	private double protein;
	private double carbohydrates; 
	private double fat; 
	
	//constructor that initializes food data
	public FoodData(String name, double calories, double protein, double carbohydrates, double fat) {
		this.name = name;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.fat = fat;
	}
	
	//getter methods for food data 
	public String getName() {
		return name;
	}
	
	public double getCalories() {
		return calories;
	}
	
	public double getProtein() {
		return protein;
	}
	
	public double getCarbohydrates() {
		return carbohydrates;
	}
	
	public double getFat() {
		return fat;
	}

}
