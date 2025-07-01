package Electricity;
class Electricity{
	private String customerName;
	private int custometAccountNumber;
	private double paymentsAmounts;
	private double billAmounts;
	
// Constructor the electricity system
	public Electricity(String customerName,int custometAccountNumber,double billAmounts,double paymentsAmounts) {
		this.customerName = customerName;
		this.custometAccountNumber = custometAccountNumber;
		this.billAmounts = billAmounts;
		this.paymentsAmounts = paymentsAmounts;
	}
	 
// methods to calculate units amounts
	    int units;
	   
	public double calculateBillAmount() {
		if (units <= 100) {
	            billAmounts = units * 1.5; 
	        } else if (units <= 300) {
	            billAmounts = 100 * 1.5 + (units - 100) * 2.0; 
	        } else {
	            billAmounts = 100 * 1.5 + 200 * 2.0 + (units - 300) * 3.0; 
	        }

	    // Add the fixed coast    
	        billAmounts += 50; 

	        return billAmounts;
	}
	
// Display the electricity details
	public void displayElectricityDetails() {
		System.out.println("Customer Name:" + customerName);
		System.out.println("Customer Account Number:" + custometAccountNumber);
		System.out.println("Bill Amounts:" + billAmounts);
		System.out.println("Payments Amounts:" + paymentsAmounts);
		
	}
}
public class ElectrictySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Create the electricity object
		Electricity electricity = new Electricity("jon",1010,5000.0,6000.0);
		
// Display the electricity details
		System.out.println("--Welcome Electricity Department-- ");
		electricity.displayElectricityDetails();
		electricity.calculateBillAmount();
		

	}

}
