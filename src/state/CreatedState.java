package state;

public class CreatedState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Order is created.");
        order.setState(new ConfirmedState());
    }
}
