import menu.MenuCategory;
import menu.MenuItem;

public class Program {


    public static void main(String[] args) throws InterruptedException {

        MenuCategory category = new MenuCategory("Beverages");
        category.add(new MenuItem("Coffee", (float) 1.50));
        category.add(new MenuItem("Milk", (float) 9.50));
        category.add(new MenuItem("Tea", (float) 1.20));

        MenuCategory subCategory = new MenuCategory("Sodas");
        subCategory.add(new MenuItem("Orange", (float) 4.30));
        subCategory.add(new MenuItem("Lemon", (float) 4.30));
        subCategory.add(new MenuItem("Mango", (float) 4.30));

        category.add(subCategory);
        category.display("");

    }


}