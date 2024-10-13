package command;

public class CancelOrderCommand implements Command {
    private TaxiReceiver taxiReceiver;

    public CancelOrderCommand(TaxiReceiver taxiReceiver) {
        this.taxiReceiver = taxiReceiver;
    }

    @Override
    public void execute() {
        taxiReceiver.cancelOrder();
    }
}