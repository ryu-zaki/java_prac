import menu.MenuCategory;
import menu.MenuComponent;

public class RestaurantRegistry {

    private static volatile RestaurantRegistry instance;
    private final MenuCategory rootMenu;

    private RestaurantRegistry() {
        this.rootMenu = new MenuCategory("Main Menu");
    }

    public static RestaurantRegistry getInstance() {
        if (instance == null) {

            synchronized (RestaurantRegistry.class) {
                if (instance == null) {
                    instance = new RestaurantRegistry();
                }
            }
        }

        return instance;
    }

    public MenuCategory getRootMenu() {
        return rootMenu;
    }



}
