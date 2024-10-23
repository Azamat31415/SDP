package state;

public class ConfirmedState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Order is confirmed.");
        order.setState(new OnTheWayState());
    }
}
