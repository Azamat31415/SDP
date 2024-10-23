package main;

import observer.*;
import observer.Order;
import state.*;
import strategy.*;
import strategy.TaxiOrder;
import template.*;

public class Main {
    public static void main(String[] args) {
        // Task 1: Observer Pattern
        System.out.println("Observer Pattern Example:");
        Order order = new Order();
        Client client1 = new Client("Slim");

        order.addObserver(client1);

        order.setStatus("Taxi is arriving.");
        order.setStatus("Taxi is at your location.");

        order.removeObserver(client1);
        order.setStatus("Taxi ride completed.");

        System.out.println("\n");

        // Task 2: State Pattern
        System.out.println("State Pattern Example:");
        state.Order taxiOrder = new state.Order();
        taxiOrder.processOrder();
        taxiOrder.processOrder();
        taxiOrder.processOrder();

        System.out.println("\n");

        // Task 3: Strategy Pattern
        System.out.println("Strategy Pattern Example:");
        TaxiOrder strategyOrder = new TaxiOrder();

        strategyOrder.setPricingStrategy(new ByDistanceStrategy());
        System.out.println("Cost by distance: " + strategyOrder.calculateCost(10));

        strategyOrder.setPricingStrategy(new ByTimeStrategy());
        System.out.println("Cost by time: " + strategyOrder.calculateCost(15));

        strategyOrder.setPricingStrategy(new FixedPriceStrategy());
        System.out.println("Fixed price: " + strategyOrder.calculateCost(0));

        System.out.println("\n");

        // Task 4: Template Method Pattern
        System.out.println("Template Method Pattern Example:");
        OrderProcess templateOrderProcess = new StandardOrderProcess();
        templateOrderProcess.processOrder();
    }
}
