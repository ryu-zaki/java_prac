package menu;

import java.util.ArrayList;
import java.util.List;

public class  MenuCategory extends  MenuComponent {

    private List<MenuComponent> items;

    public MenuCategory(String name) {
        super(name);
        this.items = new ArrayList<>();
    }

    @Override
    public void display(String prepend) {

        System.out.println(prepend + "*-- " + getName());

        for (MenuComponent item: items) {
            item.display("  " + prepend);
        }

    }

    @Override
    public void add(MenuComponent newItem) {
        items.add(newItem);
    }

    @Override
    public void remove(String name) {
        this.items =
        items.stream()
                .filter(item -> !item.getName().equals(name))
                .toList();
    }

    @Override
    public float getPrice() {
        float sum = 0;

        for (MenuComponent item: items) {
            sum += item.getPrice();
        }

        return sum;
    }

}
