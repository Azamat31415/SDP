package Assignment2;

public class Client {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        Driver driver = new Driver("Ilon Mask");
        Car car = new Car("Tesla Monster Track");

        CarSharing carSharing = new CarSharing(car);
        TaxiService taxiService = new CarSharingAdapter(carSharing, driver);

        taxiService.requestTaxi(passenger);
    }
}
