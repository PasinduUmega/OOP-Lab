import java.util.Scanner;

class Electricity {
    private String customerName;
    private int customerAccountNumber;
    private double use;
    private double payment;


    // Constructor for the initialized the electricity class
    public Electricity(String customerName, int customerAccountNumber, double use,double payment) {
        this.customerName = customerName;
        this.customerAccountNumber = customerAccountNumber;
        this.use = use;
        this.payment = payment;

    }

    // Method to calculate bill amount based on usage
    public double billAmount() {
        double billAmount;
        if (use <= 100) {
            billAmount = use * 1.5; // Rate for first 100 units
        } else if (use <= 300) {
            billAmount = 100 * 1.5 + (use - 100) * 2.0; // Next 200 units
        } else {
            billAmount = 100 * 1.5 + 200 * 2.0 + (use - 300) * 3.0; // Beyond 300 units
        }

        // Add fixed charge
        billAmount += 50; // Fixed charge

        return billAmount;
    }

    // Method to calculate balance based on payment
    public void balance() {
        double totalBill = billAmount();

        if (payment >= totalBill) {
            double change = payment - totalBill;
            System.out.println("\nPayment Successful!");
            System.out.printf("Change to return: Rs. %.2f\n", change);
        } else {
            double remaining = totalBill - payment;
            System.out.println("\nPayment Unsuccessful!");
            System.out.printf("Remaining amount to pay: Rs. %.2f\n", remaining);
        }
    }

    // Display the electricity details
    public void displayElectricityDetails() {
        System.out.println("Enter the Customer Name:" + customerName);
        System.out.println("Enter the Customer Account Number:" + customerAccountNumber);
        System.out.printf("Bill Amount: Rs. %.2f\n", billAmount());
        System.out.printf("Payment Made: Rs. %.2f\n", payment);

    }
}

public class ElectricitySystem {
    public static  void main(String[] args){

// Create the scanner object to the read
        Scanner scanner = new Scanner(System.in);

// Take user input
   System.out.print("Enter the Customer Name:");
   String customerName = scanner.nextLine();

   System.out.print("Enter the Customer Account Number:");
   int customerAccountNumber = scanner.nextInt();

   System.out.print("Enter the Customer Use the Units:");
   double use = scanner.nextDouble();

   System.out.print("Enter the Customer payment:");
   double payment = scanner.nextDouble();
   System.out.println();

// Create the Electricity object
   Electricity electricity = new Electricity(customerName,customerAccountNumber,use,payment);

// Display the Electricity Details
   electricity.displayElectricityDetails();
        electricity.balance();



    }

}
