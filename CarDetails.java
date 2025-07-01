package Car;
class Car {
    private String brand;
    private String color;
    private String numberPlate;
    private int manufactureYear;

    // Constructor
    public Car(String brand, String color, String numberPlate, int manufactureYear) {
        this.brand = brand;
        this.color = color;
        this.numberPlate = numberPlate;
        this.manufactureYear = manufactureYear;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Number Plate: " + numberPlate);
        System.out.println("Manufacture Year: " + manufactureYear);
    }

    // Method to honk (Overridden by subclasses)
    public void honk() {
        System.out.println(brand + " makes a generic honk sound!");
    }
}

// BMW Class (Child Class)
class BMW extends Car {
    public BMW(String color, String numberPlate, int manufactureYear) {
        super("BMW", color, numberPlate, manufactureYear);
    }

    @Override
    public void honk() {
        System.out.println("BMW: Beep Beep!");
    }
}

// Nissan Class (Child Class)
class Nissan extends Car {
    public Nissan(String color, String numberPlate, int manufactureYear) {
        super("Nissan", color, numberPlate, manufactureYear);
    }

    @Override
    public void honk() {
        System.out.println("Nissan: Honk Honk!");
    }
}

// Box Car Class (Child Class)
class BoxCar extends Car {
    public BoxCar(String color, String numberPlate, int manufactureYear) {
        super("Box Car", color, numberPlate, manufactureYear);
    }

    @Override
    public void honk() {
        System.out.println("Box Car: Toot Toot!");
    }
}

public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Create the Car object
		 Car bmw = new BMW("Black", "CAM-1234", 2020);
	     Car nissan = new Nissan("Red", "CAR-5678", 2021);
	     Car box = new BoxCar("White", "KU-9101", 2019);
	     
// Display the Car Details and Honk sounds
	     System.out.println("--Car Details and honk Sounds--");
	     System.out.println("-----------------------------");
	     
	     bmw.displayCarDetails();
	     bmw.honk();
	     System.out.println("-----------------------------");
	     
	     nissan.displayCarDetails();
	     nissan.honk();
	     System.out.println("-----------------------------");
	     
	     box.displayCarDetails();
	     box.honk();
	     System.out.println("-----------------------------");
	     
	}

}
