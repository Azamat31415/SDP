package mediator;

public class DispatcherMediator implements Mediator {
    private Client client;
    private Driver driver;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void notify(Object sender, String event) {
        if (sender instanceof Client && event.equals("requestCar")) {
            System.out.println("Dispatcher is notifying the driver.");
            driver.receiveRequest();
        } else if (sender instanceof Driver && event.equals("arrive")) {
            System.out.println("Dispatcher is notifying the client.");
            client.notifyArrival();
        }
    }
}