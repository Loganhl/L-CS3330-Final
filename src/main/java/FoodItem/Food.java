package FoodItem;

public abstract class Food {
	
    protected String foodType;
    protected String foodName;
    protected String servingSize;
    protected int calories;
    protected double fats;
    protected int cholesterol;
    protected int sodium;
    protected int carbohydrates;
    protected double protein;
    protected String recipe;
    protected String nutritionalRecommendation;
	
	//constructor
    public Food(String foodType, String foodName, String servingSize, int calories, double fats, int cholesterol, int sodium, int carbohydrates, double protein, String recipe, String nutritionalRecommendation) {
        this.foodType = foodType;
        this.foodName = foodName;
        this.servingSize = servingSize;
        this.calories = calories;
        this.fats = fats;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.recipe = recipe;
        this.nutritionalRecommendation = nutritionalRecommendation;
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
        		"\nProtein:" + protein +
        		"\nRecipe:" + recipe +
        		"\nNutritional Recommendation:" + nutritionalRecommendation;
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
	
	public void setCalories(int calories) {
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
	
	public void setCholesterol(int cholesterol) {
		this.cholesterol = cholesterol;
	}
	
	public double getSodium() {
		return sodium;
	}
	
	public void setSodium(int sodium) {
		this.sodium = sodium;
	}
	
	public double getCarbs() {
		return carbohydrates;
	}
	
	public void setCarbs(int carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	public double getProtein() {
		return protein;
	}
	
	public void setProtein(double protein) {
		this.protein = protein;
	}
}





	

	
	
