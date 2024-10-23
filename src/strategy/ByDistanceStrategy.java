package strategy;

public class ByDistanceStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double distance) {
        return distance * 2.0;
    }
}
