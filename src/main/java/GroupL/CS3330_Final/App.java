package GroupL.CS3330_Final;

import FoodItem.FoodManager;


/**
 * The App class is the entry point for running the food management program.
 * It initializes the FoodManager to read food data from a file and starts the menu.
 */
public class App {
	
    /**
     * The main method of the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        try {
            FoodManager foodManager = new FoodManager();
            boolean fileReadStatus = foodManager.initializeFood();
            if (fileReadStatus) {
                menu.start(args);
            }
        } catch (Exception e) {
            System.err.println("Error running the program: "+ e.getMessage());
        }
    }
}
