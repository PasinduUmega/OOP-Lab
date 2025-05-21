import java.util.Scanner;

import java.util.Scanner;

class Shopping {

    private int productId;
    private String productName;
    private double basePrice;
    private String membershipType;

    // Constructor to initialize the product class
    public Shopping(int productId, String productName, double basePrice, String membershipType) {
        this.productId = productId;
        this.productName = productName;
        this.basePrice = basePrice;
        this.membershipType = membershipType;
    }

    // Method to calculate and display the final price
    public void calculateFinalPrice() {
        double discountPercentage = 0.0;

        switch (membershipType) { // membershipType is already a String
            case "PremiumMember":
                discountPercentage = 0.20; // 20% off
                break;
            case "RegularMember":
                discountPercentage = 0.10; // 10% off
                break;
            case "Non Member":
                discountPercentage = 0.00; // No discount
                break;
            default:
                System.out.println("Invalid membership type.");

        }

        double finalPrice = basePrice - (basePrice * discountPercentage);
        System.out.println("Final Price after discount: " + finalPrice);
    }

    // Method to display shopping details
    public void displayShoppingDetails() {
        System.out.println("\nShopping Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Membership Type: " + membershipType);
    }
}

// Main class (Moved outside Product class)
public class IT24102906Lab4Q2 {
    public static void main(String[] args) {

        // Create the scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the Base Price: ");
        double basePrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the Membership Type (PremiumMember / RegularMember / Non Member): ");
        String membershipType = scanner.nextLine();

        // Create the product object
        Shopping shopping = new Shopping(productID, productName, basePrice, membershipType);

        // Display shopping details and calculate final price
        shopping.displayShoppingDetails();
        shopping.calculateFinalPrice();


    }
}
