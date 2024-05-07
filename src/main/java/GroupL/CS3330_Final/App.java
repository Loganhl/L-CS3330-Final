package GroupL.CS3330_Final;

import FoodItem.FoodManager;

public class App {
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
