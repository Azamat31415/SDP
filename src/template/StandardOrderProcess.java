package template;

public class StandardOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Checking taxi availability...");
    }

    @Override
    protected double calculateCost() {
        System.out.println("Calculating cost...");
        return 30.0; // example cost
    }

    @Override
    protected void confirmOrder(double cost) {
        System.out.println("Order confirmed. Total cost: " + cost);
    }
}
