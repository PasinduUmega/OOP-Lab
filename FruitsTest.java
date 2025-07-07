 package Fruits;


class Fruits {
    private String color;
    private String quality;

    // Constructor to initialize color and quality
    public Fruits(String color, String quality) {
        this.color = color;
        this.quality = quality;
    }
 // Method to change the color
    public void changeColor(String changeColor) {
        this.color = changeColor;  
        System.out.println("Changed color to: " + color); 
    }

    // Method to display the fruit's info
    public void displayFruitsInfo() {
        System.out.println("Fruit color: " + color);
        System.out.println("Fruit quality: " + quality);
    }
}

// Banana class (child class of Fruits)
class Banana extends Fruits {

  // Constructor to initialize color and quality
    public Banana(String quality) {
        super("Yellow", quality);  
    }
}

// Orange class (child class of Fruits)
class Orange extends Fruits {

    // Constructor to initialize color and quality
    public Orange(String quality) {
        super("Orange", quality);  
    }
}

public class FruitsTest {
    public static void main(String[] args) {
        // Create objects for Banana and Orange
        Banana banana = new Banana("Good");
        Orange orange = new Orange("Fresh");

        // Display details for Banana and Orange
        System.out.println("--Banana Details--");
        banana.displayFruitsInfo();
        banana.changeColor("Red");  
        System.out.println();

        System.out.println("--Orange Details--");
        orange.displayFruitsInfo();
        orange.changeColor("Green");  
    }
}