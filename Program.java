import decorators.ConsoleLogger;
import decorators.DateDecorator;
import decorators.Logger;
import decorators.LoggerDecorator;
import menu.MenuCategory;
import menu.MenuItem;
import pricing.BillCalculator;
import pricing.DiscountPricing;
import pricing.HappyHourPricing;
import pricing.RegularPricing;

public class Program {


    public static void main(String[] args) throws InterruptedException {

       /* MenuCategory rootMenu = RestaurantRegistry.getInstance().getRootMenu();
        BillCalculator calculator = new BillCalculator(new HappyHourPricing());

        MenuCategory category = new MenuCategory("Beverages");
        category.add(new MenuItem("Coffee", (float) 1.50));
        category.add(new MenuItem("Milk", (float) 9.50));
        category.add(new MenuItem("Tea", (float) 1.20));

        MenuCategory subCategory = new MenuCategory("Sodas");
        subCategory.add(new MenuItem("Orange", (float) 4.30));
        subCategory.add(new MenuItem("Lemon", (float) 4.30));
        subCategory.add(new MenuItem("Mango", (float) 4.30));

        category.add(subCategory);
        rootMenu.add(category);

        rootMenu.display("");
        calculator.printBill(rootMenu.getPrice());*/

        Logger logger = new ConsoleLogger();
        logger.log("Hello Universe");

        logger = new LoggerDecorator(logger);
        logger.log("Hello World");



    }


}