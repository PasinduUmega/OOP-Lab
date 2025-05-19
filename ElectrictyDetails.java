import java.util.Scanner;
class Electricty{
    private String customerName;
    private int customerAccountNumber;



 // Constructor to initialized for the electricity class
     public Electricty(String customerName,int customerAccountNumber){
         this.customerName = customerName;
         this.customerAccountNumber = customerAccountNumber;
     }

 // Create the methods of the payments
     public  double calculateMonthlyBillAmounts(){
         double units =0;
         double payments;
         if(units<=100){
             payments = 100 * 50;
         } else if (units>=50) {
             payments = 50 * 25;
         }else
             payments = 100 * 200;
         return payments;
     }

     public double calculateBillAmount() {
         double balance;
         double paymentAmounts = 0, billAmounts = 0;
         if (paymentAmounts >= billAmounts) {
             double change = paymentAmounts - billAmounts;
             System.out.println("\nPayment Successful!");
             System.out.println("Change to return: Rs. " + String.format("%.2f", change));
         } else {
             double renaming = billAmounts - paymentAmounts;
             System.out.println("Renaming:" + String.format("%.2f", renaming));
         }
         return balance = calculateMonthlyBillAmounts();
     }

  // Methods to display the electricty  details
     public void displayElectrictyDetails(){
         System.out.println("Enter the Customer Name;" + customerName);
         System.out.println("Enter the Customer Account Number:" + customerAccountNumber);
         System.out.println("Monthly bill amounts:" + calculateMonthlyBillAmounts());
         System.out.println("Enter the Renaming Balance Amounts:" + calculateBillAmount());
     }
}
public class ElectrictyDetails {
    public static void main(String[] args){

 // Create the electricty object
   Electricty obj = new Electricty("jon",1010) ;

 // Display the electricty details
 System.out.println("--Welcome to our Electricty System--");
 obj.displayElectrictyDetails();

    }
}
