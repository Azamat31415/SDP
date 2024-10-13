import chain_of_responsibility.*;
import command.*;
import iterator.*;
import mediator.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Chain of Responsibility setup
        Handler carAvailability = new CarAvailabilityHandler();
        Handler balanceCheck = new ClientBalanceHandler();
        Handler dispatchCheck = new DispatchHandler();
        carAvailability.setNextHandler(balanceCheck);
        balanceCheck.setNextHandler(dispatchCheck);
        ClientRequest request = new ClientRequest("Downtown", 50.0);
        carAvailability.handleRequest(request);

        // Command pattern setup
        TaxiReceiver receiver = new TaxiReceiver();
        Command createOrder = new CreateOrderCommand(receiver);
        Command changeDestination = new ChangeDestinationCommand(receiver, "Airport");
        createOrder.execute();
        changeDestination.execute();

        // Iterator pattern setup
        List<iterator.Driver> drivers = new ArrayList<>();
        drivers.add(new iterator.Driver("John", 5.2));
        drivers.add(new iterator.Driver("Alex", 3.5));
        DriverIterator iterator = new DriverIterator(drivers);
        while (iterator.hasNext()) {
            iterator.Driver driver = iterator.next();
            System.out.println(driver.getName() + " is " + driver.getDistance() + " km away.");
        }

        // Mediator pattern setup
        DispatcherMediator mediator = new DispatcherMediator();
        mediator.Client client = new Client(mediator);
        mediator.Driver driver = new mediator.Driver(mediator);
        mediator.setClient(client);
        mediator.setDriver(driver);
        client.requestCar();
    }
}