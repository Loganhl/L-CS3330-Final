package GroupL.CS3330_Final;

public abstract class Food {
	
	private String name;
	private double calories;
	private double protein;
	private double carbohydrates;
	private double fat;
	
	//constructor
	public Food (String name, double calories, double protein, double carbohydrates, double fat) {
		this.name = name;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.fat = fat;
		
	}

	
	
	public Food(Food food) {
		// TODO Auto-generated constructor stub
	}



	//Getter and Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCalories() {
		return calories;
	}
	
	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	public double getProtein() {
		return protein;
	}
	
	public void setProtein(double protein) {
		this.protein = protein;
	}
	
	public double getCarbohydrates() {
		return carbohydrates;
	}
	
	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	public double getFat() {
		return fat;
	}
	
	public void setFat(double fat) {
		this.fat = fat;
	}
}

//subclasses 
 class Fruits extends Food{
	public Fruits (Food food) {
		super(food);
	}
}
 
 class Vegetables extends Food{
	 public Vegetables (Food food) {
		 super(food);
	 }
 }
 
 class Grains extends Food{
	 public Grains(Food food) {
		 super(food);	 
	}
 }
 
 class ProteinFoods extends Food{
	 public ProteinFoods(Food food) {
		 super(food);
	 }
 }
 
 class Dairy extends Food{
	 public Dairy(Food food) {
		 super(food);
	 }
 }





	

	
	



