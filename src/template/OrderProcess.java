package template;

public abstract class OrderProcess {
    public final void processOrder() {
        checkAvailability();
        double cost = calculateCost();
        confirmOrder(cost);
    }

    protected abstract void checkAvailability();
    protected abstract double calculateCost();
    protected abstract void confirmOrder(double cost);
}
