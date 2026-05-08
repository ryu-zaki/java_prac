package pricing;

public class HappyHourPricing implements  PricingStrategy {


    @Override
    public double calculate(double subTotal) {
        int hour = java.time.LocalTime.now().getHour();

        if (hour >= 14 && hour < 17) {
           return subTotal * 0.5;
        }

        return subTotal;
    }

}
