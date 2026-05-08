package menu;

public abstract class MenuComponent {

    private String name;

    public MenuComponent(String name) {
        this.name = name;
    }

    public abstract void display(String prepend);

    public abstract float getPrice();

    public void setPrice(float newPrice) throws Exception {
        throw new Exception("Cannot set the price of this item");
    }

    public void add(MenuComponent newComponent) throws Exception {
        throw new Exception("You cannot add to this component");
    }

    public void remove(String name) throws Exception {
        throw new Exception("You cannot to this component");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

}
