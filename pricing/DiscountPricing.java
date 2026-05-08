package pricing;

public class DiscountPricing implements  PricingStrategy {

    private final double discountPercentage;

    public DiscountPricing(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculate(double subTotal) {
        return subTotal * (1 - discountPercentage / 100);
    }

}
