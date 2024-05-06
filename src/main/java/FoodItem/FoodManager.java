package FoodItem;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodManager {

	private String foodFilePath = "src/foodList.csv";
	public ArrayList<Food> foodList;

	
	public boolean initializeFood() {

		try {
			//Sets the file and count variable.
            File file = new File(foodFilePath);
            Scanner scanner = new Scanner(file);
            int count = 0;
            
            // Error testing to ensure information is being passed.
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            } else {
                System.out.println("Inventory file is empty.");
                scanner.close();
                return false;
            }

            //Adds to the count integer to create an array the sized of the file being read.
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }

            scanner.close();
            
            scanner = new Scanner(file);
            
            //Skipping first line.
            if (scanner.hasNextLine()) {
                scanner.nextLine(); 
            }
            
            foodList = new ArrayList<Food>();
            
            //Adding values to the object.
            for (int i = 0; i < count; i++) {
                String[] parts = scanner.nextLine().split(",");
                
         
                
                String foodType = parts[0];
                String foodName = parts[1];
                String servingSize = parts[2];
                double calories = Double.parseDouble(parts[3]);
                double fats = Double.parseDouble(parts[4]);
                double cholesterol = Double.parseDouble(parts[5]);
                double sodium = Double.parseDouble(parts[6]);
                double carbs = Double.parseDouble(parts[7]);
                double protein = Double.parseDouble(parts[8]);


                switch (foodType) {
                    case "Fruit":
                        foodList.add(new Fruit(foodName, servingSize, calories, fats, cholesterol, sodium, carbs, protein));
                        break;
                    case "Vegetables":
                    	foodList.add(new Vegetables(foodName, servingSize, calories, fats, cholesterol, sodium, carbs, protein));
                        break;
                    case "Grains":
                    	foodList.add(new Grains(foodName, servingSize, calories, fats, cholesterol, sodium, carbs, protein));
                        break;
                    case "Protein":
                    	foodList.add(new Protein(foodName, servingSize, calories, fats, cholesterol, sodium, carbs, protein));
                        break;
                    case "Dairy":
                    	foodList.add(new Dairy(foodName, servingSize, calories, fats, cholesterol, sodium, carbs, protein));
                    	break;
                }

            }

            scanner.close();
            
            return true;
	        
		} catch (Exception e){
			System.out.println(e);
			return false;
		}
	}
	
	public void displayAllFruitInformation() {
		boolean fruitFound = false;
		
		System.out.println("Fruit information: ");
		for (Food food : foodList) {
			if(food instanceof Fruit) {
				Fruit fruit = (Fruit) food;
				System.out.println(fruit.toString());
                System.out.println("-----------------------------");
                fruitFound = true;
			}
		}
		
		if (!fruitFound) {
			System.out.println("No fruit found in inventory.");
		}
	}
	
	public void displayAllVegetablesInformation() {
		boolean vegetableFound = false;
		
		System.out.println("Vegetable information: ");
		for (Food food : foodList) {
			if(food instanceof Fruit) {
				Vegetables vegetable = (Vegetables) food;
				System.out.println(vegetable.toString());
                System.out.println("-----------------------------");
                vegetableFound = true;
			}
		}
		
		if (!vegetableFound) {
			System.out.println("No vegetables found in inventory.");
		}
	}
	
	public void displayAllGrainsInformation() {
		boolean grainsFound = false;
		
		System.out.println("Grain information: ");
		for (Food food : foodList) {
			if(food instanceof Grains) {
				Grains grain = (Grains) food;
				System.out.println(grain.toString());
                System.out.println("-----------------------------");
                grainsFound = true;
			}
		}
		
		if (!grainsFound) {
			System.out.println("No grains found in inventory.");
		}
	}
	
	public void displayAllProteinInformation() {
		boolean proteinFound = false;
		
		System.out.println("Protein Foods information: ");
		for (Food food : foodList) {
			if(food instanceof Protein) {
				Protein protein = (Protein) food;
				System.out.println(protein.toString());
                System.out.println("-----------------------------");
                proteinFound = true;
			}
		}
		
		if (!proteinFound) {
			System.out.println("No protein foods found in inventory.");
		}
	}
	
	public void displayAllDairyInformation() {
		boolean dairyFound = false;
		
		System.out.println("Fruit information: ");
		for (Food food : foodList) {
			if(food instanceof Dairy) {
				Dairy dairy = (Dairy) food;
				System.out.println(dairy.toString());
                System.out.println("-----------------------------");
                dairyFound = true;
			}
		}
		
		if (!dairyFound) {
			System.out.println("No fruit found in inventory.");
		}
	}
}
