package FoodItem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FoodManager {

	private String foodFilePath = "src/main/java/foodList.csv";
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

	//method to find food with the highest calories 
	public void printFoodWithHighestCalories() {

	    Food foodWithHighestCalories = foodList.get(0);
	    double highestCalories = foodWithHighestCalories.getCalories();

	    for (Food food : foodList) {
	        if (food.getCalories() > highestCalories) {
	            highestCalories = food.getCalories();
	            foodWithHighestCalories = food;
	        }
	    }

	    System.out.println("Food with the highest calories:");
	    System.out.println(foodWithHighestCalories.toString());
	}
	
	//Method to add Food.
	public void addFood(String userInput) {
	    // Splits the user Input.
	    String[] parts = userInput.split(",");
	    if (parts.length != 9) {
	        System.out.println("Invalid input format. Please enter all fields: foodgroup,foodname,servingsize,calories,fats,cholesterol,sodium,carbohydrates,protein");
	        return;
	    }

	    String foodGroup = parts[0].trim();
	    String foodName = parts[1].trim();
	    String servingSize = parts[2].trim();
	    double calories = Double.parseDouble(parts[3].trim());
	    double fats = Double.parseDouble(parts[4].trim());
	    double cholesterol = Double.parseDouble(parts[5].trim());
	    double sodium = Double.parseDouble(parts[6].trim());
	    double carbohydrates = Double.parseDouble(parts[7].trim());
	    double protein = Double.parseDouble(parts[8].trim());

	    Food food;

	    switch (foodGroup.toLowerCase()) {
	        case "fruit":
	            food = new Fruit(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
	            break;
	        case "vegetables":
	            food = new Vegetables(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
	            break;
	        case "grains":
	            food = new Grains(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
	            break;
	        case "protein":
	            food = new Protein(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
	            break;
	        case "dairy":
	            food = new Dairy(foodName, servingSize, calories, fats, cholesterol, sodium, carbohydrates, protein);
	            break;
	        default:
	            System.out.println("Invalid food group. Food group must be Protein, Fruit, Vegetables, Grains, or Dairy.");
	            return;
	    }

	    // Initialize foodList if it's null
	    if (foodList == null) {
	        foodList = new ArrayList<>();
	    }

	    foodList.add(food);
	    System.out.println("\nFood added to the inventory: " + food);

	    // Write the new food item to the CSV file
	    try (FileWriter writer = new FileWriter("src/main/java/foodList.csv", true)) {
	        writer.append(userInput + "\n");
	        writer.flush();
	        System.out.println("Food added to the CSV file.");
	    } catch (IOException e) {
	        System.out.println("Error writing to the CSV file: " + e.getMessage());
	    }
	}

	
	//Method to remove a food item
	public void removeFood(String userInput) {

	    Food foodToRemove = null;
	    for (Food food : foodList) {
	        if (food.getName().equalsIgnoreCase(userInput)) {
	            foodToRemove = food;
	            break;
	        }
	    }

	    if (foodToRemove == null) {
	        System.out.println("Food Item '" + userInput + "' not found.");
	        return;
	    }

	    foodList.remove(foodToRemove);
	    System.out.println("Food item '" + userInput + "' removed from inventory.");




	    // Update the file
	    try {
	        File file = new File(foodFilePath);
	        if (!file.exists()) {
	            System.out.println("File '" + foodFilePath + "' not found.");
	            return;
	        }

	        List<String> lines = Files.readAllLines(Paths.get(foodFilePath));

	        FileWriter writer = new FileWriter(foodFilePath);
	        for (String line : lines) {
	            String[] parts = line.split(",");
	            if (!parts[1].equalsIgnoreCase(userInput)) {
	                writer.write(line + System.lineSeparator());
	            }
	        }
	        writer.close();

	    } catch (IOException e) {
	        System.out.println("Error removing food item from the file: " + e.getMessage());
	    }
	}

}
