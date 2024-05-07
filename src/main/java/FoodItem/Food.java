package FoodItem;

/**
 * The abstract class representing a food item.
 */
public abstract class Food {
	
    protected String foodName;
    protected String servingSize;
    protected double calories;
    protected double fats;
    protected double cholesterol;
    protected double sodium;
    protected double carbohydrates;
    protected double protein;

    /**
     * Constructor to create a new Food object with specified attributes.
     *
     * @param foodName      The name of the food.
     * @param servingSize   The serving size of the food.
     * @param calories      The number of calories in the food.
     * @param fats          The amount of fats in the food.
     * @param cholesterol   The amount of cholesterol in the food.
     * @param sodium        The amount of sodium in the food.
     * @param carbohydrates The amount of carbohydrates in the food.
     * @param protein       The amount of protein in the food.
     */
    public Food(String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
        this.foodName = foodName;
        this.servingSize = servingSize;
        this.calories = calories;
        this.fats = fats;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.protein = protein;

    }

   

    /**
     * Returns a string representation of the food item.
     *
     * @return A string containing the food name, serving size, and nutritional information.
     */
    @Override
    public String toString() {
        return foodName + " - " + servingSize +
        		"\nCalories: " + calories +", Fats: " + fats + ", Cholesterol: " + cholesterol + ", Sodium: " + sodium + ", Carbohydrates: " + carbohydrates + ", Protein: " + protein;
    }

	//Getter and Setter methods
	public String getName() {
		return foodName;
	}
	
	public void setName(String name) {
		this.foodName = name;
	}
	
	public String getServing() {
		return foodName;
	}
	
	public void setServing(String name) {
		this.foodName = name;
	}
	
	public double getCalories() {
		return calories;
	}
	
	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	public double getFat() {
		return fats;
	}
	
	public void setFat(double fat) {
		this.fats = fat;
	}
	
	public double getCholesterol() {
		return cholesterol;
	}
	
	public void setCholesterol(double cholesterol) {
		this.cholesterol = cholesterol;
	}
	
	public double getSodium() {
		return sodium;
	}
	
	public void setSodium(double sodium) {
		this.sodium = sodium;
	}
	
	public double getCarbs() {
		return carbohydrates;
	}
	
	public void setCarbs(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	public double getProtein() {
		return protein;
	}
	
	public void setProtein(double protein) {
		this.protein = protein;
	}
}





	

	
	
