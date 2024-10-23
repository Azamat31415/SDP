package strategy;

public class FixedPriceStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double value) {
        return 50.0;
    }
}
