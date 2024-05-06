package FoodItem;

public abstract class Food {
	
    protected String foodType;
    protected String foodName;
    protected String servingSize;
    protected double calories;
    protected double fats;
    protected double cholesterol;
    protected double sodium;
    protected double carbohydrates;
    protected double protein;

	//constructor
    public Food(String foodType, String foodName, String servingSize, double calories, double fats, double cholesterol, double sodium, double carbohydrates, double protein) {
        this.foodType = foodType;
        this.foodName = foodName;
        this.servingSize = servingSize;
        this.calories = calories;
        this.fats = fats;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.protein = protein;

    }

   

	//toString method for printing the food details
    @Override
    public String toString() {
        return "Food:" + foodName +
        		"\nServing Size:" + servingSize +
        		"\nCalories:" + calories +
        		"\nFate:" + fats +
        		"\nCholesterol:" + cholesterol +
        		"\nsodium:" + sodium +
        		"\nCarbohydrates:" + carbohydrates +
        		"\nProtein:" + protein;
    }

	//Getter and Setter
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





	

	
	
