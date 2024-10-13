package mediator;

public class Client {
    private Mediator mediator;

    public Client(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestCar() {
        System.out.println("Client is requesting a car.");
        mediator.notify(this, "requestCar");
    }

    public void notifyArrival() {
        System.out.println("Client has been notified of driver's arrival.");
    }
}