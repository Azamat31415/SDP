package command;

public class CreateOrderCommand implements Command {
    private TaxiReceiver taxiReceiver;

    public CreateOrderCommand(TaxiReceiver taxiReceiver) {
        this.taxiReceiver = taxiReceiver;
    }

    @Override
    public void execute() {
        taxiReceiver.createOrder();
    }
}