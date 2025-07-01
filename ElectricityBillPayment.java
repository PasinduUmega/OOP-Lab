package Electricity;
import java.util.Scanner;
public class ElectricityBillPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Create the Scanner object to read		
		Scanner scanner = new Scanner(System.in);

        // Step 1: Input customer details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter number of units consumed: ");
        int units = scanner.nextInt();

        // Step 2: Calculate the electricity bill
        double billAmount = calculateBill(units);
        System.out.println("\nElectricity Bill:");
        System.out.println("-------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill Amount: Rs. " + String.format("%.2f", billAmount));

        // Step 3: Simulate payment process
        System.out.println("\nProceed to payment...");
        System.out.print("Enter the amount to pay: Rs. ");
        double payment = scanner.nextDouble();

        // Step 4: Validate payment
        if (payment >= billAmount) {
            double change = payment - billAmount;
            System.out.println("\nPayment Successful!");
            System.out.println("Change to return: Rs. " + String.format("%.2f", change));
        } else {
            double remaining = billAmount - payment;
            System.out.println("\nPayment Failed!");
            System.out.println("Insufficient amount. You still owe: Rs. " + String.format("%.2f", remaining));
        }

        System.out.println("\nThank you for using the Electricity Bill Payment System!");
    }

    // Method to calculate the electricity bill based on units consumed
    public static double calculateBill(int units) {
        double billAmount = 0;

        // Slab rates
        if (units <= 100) {
            billAmount = units * 1.5; // Rate for first 100 units
        } else if (units <= 300) {
            billAmount = 100 * 1.5 + (units - 100) * 2.0; // Next 200 units
        } else {
            billAmount = 100 * 1.5 + 200 * 2.0 + (units - 300) * 3.0; // Beyond 300 units
        }

        // Add fixed charge
        billAmount += 50; // Fixed charge

        return billAmount;
    }


		
	}


