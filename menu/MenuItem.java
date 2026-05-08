package menu;

public class MenuItem extends MenuComponent {

    private float price;

    public MenuItem(String name, float price) {
        super(name);
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    @Override
    public void display(String prepend) {
       System.out.println(prepend + "|-- " + getName() + " -- " + getPrice());

    }

}
