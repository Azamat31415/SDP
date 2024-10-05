public class Client {
    public static void main(String[] args) {

        DriverManager driverManager = DriverManager.getInstance();
        String driver = driverManager.findNearestDriver("Location A");


        Driver originalDriver = new Driver("John Doe", "Toyota Prius");
        System.out.println("Original Driver: " + originalDriver.getName());
        System.out.println("Original Driver’s car: " + originalDriver.getCarModel());

        Driver clonedDriver = originalDriver.clone();
        clonedDriver.setName("Jane Doe");
        System.out.println("Cloned Driver: " + clonedDriver.getName());
        System.out.println("Cloned Driver’s car: " + clonedDriver.getCarModel());


        Driver2 builderDriver = new Driver2.DriverBuilder()
                .withName("Johny Silverhand")
                .withCarModel("Porshe 911")
                .withLicenseNumber("XYZ12345")
                .withExperienceYears(5)
                .isAvailable(true)
                .build();

        System.out.println(builderDriver);


        Factory factory = new StandardTaxiFactory();
        Taxi taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Marshall Mathers");

        factory = new PremiumTaxiFactory();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Dua Lipa");
    }
}

