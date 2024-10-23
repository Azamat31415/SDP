package strategy;

public class ByTimeStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double time) {
        return time * 1.5;
    }
}
