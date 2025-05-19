class Vehicle {
    private String brand;
    private double speed;

    // Constructor
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Display Vehicle Details
    public void displayVehicleDetails() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

//Bus Class (Subclass of Vehicle)
class Bus extends Vehicle {
    private String engineType;

    // Constructor for Bus
    public Bus(String brand, double speed, String engineType) {
        super(brand, speed);
        this.engineType = engineType;
    }
// create the methods called in overloading
    public void start() {
        System.out.println("Bus is starting... Passengers are boarding.");
    }

    @Override
    public void displayVehicleDetails() {
        start(); // Call the overridden start() method
        System.out.println();
        super.displayVehicleDetails();
        System.out.println("Engine Type: " + engineType);
    }
}

//Truck Class (Subclass of Vehicle)
class Truck extends Vehicle {
    private String engineType;

    // Constructor for Truck
    public Truck(String brand, double speed, String engineType) {
        super(brand, speed);
        this.engineType = engineType;
    }

    public void start() {
        System.out.println("Truck is starting... Loading goods.");
    }

    @Override
    public void displayVehicleDetails() {
        start(); // Call the overridden start() method
        System.out.println();
        super.displayVehicleDetails(); // Call the parent method
        System.out.println("Engine Type: " + engineType);
    }
}

//Driver Class (Independent of Vehicle - Aggregation)
class DriverSystem {
    private String driverName;
    private String licenseNumber;

    // Constructor for Driver
    public DriverSystem(String driverName, String licenseNumber) {
        this.driverName = driverName;
        this.licenseNumber = licenseNumber;
    }

    // Display Driver Details
    public void displayDriverDetails() {
        System.out.println("Driver Name: " + driverName + ", License Number: " + licenseNumber);
    }
}

//Main Application Class
public class TransportApp {
    public static void main(String[] args) {

        // Bus Details
        System.out.println("---Bus Details---");
        Bus bus = new Bus("Volvo", 80.0, "Diesel");
        bus.displayVehicleDetails(); // Display Bus Information
        DriverSystem driver1 = new DriverSystem("John Doe", "DL12345");
        driver1.displayDriverDetails(); // Display Driver Information
        System.out.println();

        // Truck Details
        System.out.println("---Truck Details---");
        Truck truck = new Truck("Mercedes", 60.0, "Turbo Diesel");
        truck.displayVehicleDetails(); // Display Truck Information
       DriverSystem driver2 = new DriverSystem("Alice Smith", "DL67890");
        driver2.displayDriverDetails(); // Display Driver Information
    }
}


