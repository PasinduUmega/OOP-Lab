abstract class Transport {
    protected String vehicleNumber;
    protected double distanceTravelled;

    public Transport(String vehicleNumber, double distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }
    public abstract double calculateFare();

    // (b) Concrete method
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance Travelled: " + distanceTravelled + " km");
    }
}
class Taxi extends Transport {

    public Taxi(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    // (d) Override fare calculation
    @Override
    public double calculateFare() {
        return 20 * distanceTravelled + 50;
    }

    // (d) Override displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fare (Taxi): " + calculateFare());
    }
}

class BusTr extends Transport {

    public BusTr(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    //  Override fare calculation
    @Override
    public double calculateFare() {
        return 10 * distanceTravelled;
    }

    // (d) Override displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fare (Bus): " + calculateFare());
    }
}
public class IT24102906Lab9Q1{
    public static void main(String[] args) {
        Transport bus = new BusTr("BUS123", 15);    // 15 km
        Transport taxi = new Taxi("TAXI456", 8);  // 8 km

        System.out.println("=== Bus Details ===");
        bus.displayDetails();

        System.out.println("\n=== Taxi Details ===");
        taxi.displayDetails();
    }
}

