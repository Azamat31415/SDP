package state;

public class FinishedState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Order is completed.");
    }
}
