package GroupL.CS3330_Final;

import java.util.Scanner;

import FoodItem.Food;
import FoodItem.FoodManager;
import FoodItem.Fruit;
import FoodItem.*;

public class menu {
    
    public static void start(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean displayMenu = true;
        
        while (displayMenu) {
            // Sends the menu options to the user.
            displayMainMenu();
            
            // Reads the users answer.
            String userInput = scanner.nextLine();
            
            // Take the user input and match it to an action.
            switch (userInput) {
            	case "0":
            		displayHighestCalorie();
            		break;
                case "1":
                    displayFruitsMenu();
                    break;
                case "2":
                    displayVegetablesMenu();
                    break;
                case "3":
                    displayDairyMenu();
                    break;
                case "4":
                    displayGrainsMenu();
                    break;
                case "5":
                    displayProteinsMenu();
                    break;
                case "6":
                    addFoodMenu();
                    break;
                case "7":
                    removeFoodMenu();
                    break;
                case "8":
                    displayMenu = false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
        
        // Exits the program
        System.out.println("Exiting program. Goodbye!");
        scanner.close();
    }
    
    private static void displayMainMenu() {
        System.out.println("===============================");
        System.out.println("Select one of the food groups below,");
        System.out.println("to show data regarding it. To choose");
        System.out.println("simply type the number before the,");
        System.out.println("group you wish to access.\n");
        System.out.println("[0] Show Highest Calorie Food");
        System.out.println("[1] Fruits");
        System.out.println("[2] Vegetables");
        System.out.println("[3] Dairy");
        System.out.println("[4] Grains");
        System.out.println("[5] Protein Foods");
        System.out.println("[6] Add Food");
        System.out.println("[7] Remove Food");
        System.out.println("[8] Exit Program");
        System.out.println("===============================");
    }
    
    private static void displayHighestCalorie() {
        // Create an instance of FoodManager
        FoodManager foodManager = new FoodManager();

        // Initialize foodList
        if (!foodManager.initializeFood()) {
            System.out.println("Failed to initialize food data. Exiting.");
            return;
        }
        
        foodManager.printFoodWithHighestCalories();
    }
    
    private static void displayFruitsMenu() {
        // Display information about Fruits.
        System.out.println("===============================");
        System.out.println("Fruit");
        Fruit.printFruitNutritionalRecomendations();

        // Create an instance of FoodManager
        FoodManager foodManager = new FoodManager();

        // Initialize foodList
        if (!foodManager.initializeFood()) {
            System.out.println("Failed to initialize food data. Exiting.");
            return;
        }
        System.out.println("\nFruit Rich Meal:");
        Fruit.printFruitRecipes();
        
        System.out.println("\nCommon Foods:");
        foodManager.displayAllFruitInformation();
        System.out.println("===============================");

        // Ask the user if they want to return to the main menu
        System.out.println("Type 'menu' to return to the main menu or 'exit' to exit the program.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        //Takes user input.
        if (userInput.equalsIgnoreCase("menu")) {
            return;
        } else if (userInput.equalsIgnoreCase("exit")) {
            System.exit(0);
        } else {
            System.out.println("Invalid input. Returning to main menu.");
        }
    }

    
    private static void displayVegetablesMenu() {
        // Display information about Vegetables.
        System.out.println("===============================");
        System.out.println("Vegetables");
        Vegetables.printVegetableNutritionalRecomendations();

        // Create an instance of FoodManager
        FoodManager foodManager = new FoodManager();

        // Initialize foodList
        if (!foodManager.initializeFood()) {
            System.out.println("Failed to initialize food data. Exiting.");
            return;
        }
        System.out.println("\nVegetables Rich Meal:");
        Vegetables.printVegetableRecipes();
        
        System.out.println("\nCommon Foods:");
        foodManager.displayAllVegetablesInformation();
        System.out.println("===============================");

        // Ask the user if they want to return to the main menu
        System.out.println("Type 'menu' to return to the main menu or 'exit' to exit the program.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        //Takes user input.
        if (userInput.equalsIgnoreCase("menu")) {
            return;
        } else if (userInput.equalsIgnoreCase("exit")) {
            System.exit(0);
        } else {
            System.out.println("Invalid input. Returning to main menu.");
        }
    }
    
    private static void displayDairyMenu() {
        // Display information about Fruits.
        System.out.println("===============================");
        System.out.println("Dairy");
        Dairy.printDairyNutritionalRecomendations();

        // Create an instance of FoodManager
        FoodManager foodManager = new FoodManager();

        // Initialize foodList
        if (!foodManager.initializeFood()) {
            System.out.println("Failed to initialize food data. Exiting.");
            return;
        }
        System.out.println("\nDairy Rich Meal:");
        Dairy.printDairyRecipes();
        
        System.out.println("\nCommon Foods:");
        foodManager.displayAllDairyInformation();
        System.out.println("===============================");

        // Ask the user if they want to return to the main menu
        System.out.println("Type 'menu' to return to the main menu or 'exit' to exit the program.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        //Takes user input.
        if (userInput.equalsIgnoreCase("menu")) {
            return;
        } else if (userInput.equalsIgnoreCase("exit")) {
            System.exit(0);
        } else {
            System.out.println("Invalid input. Returning to main menu.");
        }
    }
    
    private static void displayGrainsMenu() {
        // Display information about Grains.
        System.out.println("===============================");
        System.out.println("Grains");
        Grains.printGrainNutritionalRecomendations();

        // Create an instance of FoodManager
        FoodManager foodManager = new FoodManager();

        // Initialize foodList
        if (!foodManager.initializeFood()) {
            System.out.println("Failed to initialize food data. Exiting.");
            return;
        }
        System.out.println("\nGrains Rich Meal:");
        Grains.printGrainsRecipes();
        
        System.out.println("\nCommon Foods:");
        foodManager.displayAllGrainsInformation();
        System.out.println("===============================");

        // Ask the user if they want to return to the main menu
        System.out.println("Type 'menu' to return to the main menu or 'exit' to exit the program.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        //Takes user input.
        if (userInput.equalsIgnoreCase("menu")) {
            return;
        } else if (userInput.equalsIgnoreCase("exit")) {
            System.exit(0);
        } else {
            System.out.println("Invalid input. Returning to main menu.");
        }
    }
    
    private static void displayProteinsMenu() {
        // Display information about Proteins.
        System.out.println("===============================");
        System.out.println("Protein");
        Protein.printProteinNutritionalRecomendations();

        // Create an instance of FoodManager
        FoodManager foodManager = new FoodManager();

        // Initialize foodList
        if (!foodManager.initializeFood()) {
            System.out.println("Failed to initialize food data. Exiting.");
            return;
        }
        System.out.println("\nProtein Rich Meals:");
        Protein.printProteinRecipes();
        
        System.out.println("\nCommon Foods:");
        foodManager.displayAllProteinInformation();
        System.out.println("===============================");

        // Ask the user if they want to return to the main menu
        System.out.println("Type 'menu' to return to the main menu or 'exit' to exit the program.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        //Takes user input.
        if (userInput.equalsIgnoreCase("menu")) {
            return;
        } else if (userInput.equalsIgnoreCase("exit")) {
            System.exit(0);
        } else {
            System.out.println("Invalid input. Returning to main menu.");
        }
    }
    
    //Adds a new fruit to the foodList.json
    private static void addFoodMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Add Food\n");
        System.out.println("To add a food, enter the information as displayed below.");
        System.out.println("foodgroup,foodname,calories,fats,cholesterol,sodium,carbohydrates,protein");
        System.out.println("Fruit,Pear,1 medium,100,0.5,0,1,26,1");
        System.out.println("Food group name must be Protein, Fruit, Vegetables, Grains, or Dairy.");
        System.out.println("(( Case Sensitive, Do not Include any Spaces ))\n");
        System.out.println("===============================");

        // Read user input
        String userInput = scanner.nextLine();

        // Create an instance of FoodManager
        FoodManager foodManager = new FoodManager();

        // Pass the user input to the addFood method of the foodManager instance
        foodManager.addFood(userInput);
        scanner.close();
    }
    
    private static void removeFoodMenu() {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Remove Food\n");
        System.out.println("To remove a food, enter the name of the food.");
        System.out.println("===============================");

        // Read user input
        String userInput = scanner.nextLine();

        // Create an instance of FoodManager
        FoodManager foodManager = new FoodManager();
        
        if (!foodManager.initializeFood()) {
            System.out.println("Failed to initialize food data. Exiting.");
            scanner.close();
            return;
        }

        // Pass the user input to the removeFood method of the foodManager instance
        foodManager.removeFood(userInput);
        scanner.close();
    }
}
