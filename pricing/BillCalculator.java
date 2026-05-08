package pricing;

public class BillCalculator {

    private PricingStrategy strategy;

    public BillCalculator(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public PricingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void printBill(double subTotal) {
        System.out.println("Your bill is " + subTotal);
    }

}
