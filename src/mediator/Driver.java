package mediator;

public class Driver {
    private Mediator mediator;

    public Driver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void receiveRequest() {
        System.out.println("Driver received a request and is heading to the client.");
        mediator.notify(this, "arrive");
    }
}