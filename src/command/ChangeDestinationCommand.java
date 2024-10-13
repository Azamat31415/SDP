package command;

public class ChangeDestinationCommand implements Command {
    private TaxiReceiver taxiReceiver;
    private String newDestination;

    public ChangeDestinationCommand(TaxiReceiver taxiReceiver, String newDestination) {
        this.taxiReceiver = taxiReceiver;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        taxiReceiver.changeDestination(newDestination);
    }
}