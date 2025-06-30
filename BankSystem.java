package Bank;
class Bank{
	private String accountHolderName;
	private double depositeAmounts;
	private double withdrowAmounts;
	private double accountBalance;
	
// Constructor to initialized for the bank class	
	public Bank(String accountHolderName, double depositeAmounts,double withdrowAmounts, double accountBalance) {
		this.accountHolderName = accountHolderName;
		this.depositeAmounts = depositeAmounts;
		this.withdrowAmounts = withdrowAmounts;
		this.accountBalance = accountBalance;
	}
	
// Display the bank Details 
	public void displayBankDetails() {

		System.out.println("Account Holder Name:" + accountHolderName);
		System.out.println("Deposite Amounts:" +  depositeAmounts);
		System.out.println("Withdrow Amounts:" + withdrowAmounts);
		System.out.println("Account Balance:" + accountBalance);
	}

	
// 	Account Holder Name class (child class of Bank)
	class accountHolderName extends Bank{
	public accountHolderName( double depositeAmounts, double withdrowAmounts,
			double accountBalance) {
		super("accountHolderName", depositeAmounts, withdrowAmounts, accountBalance);
		
	}
  }

// @Override
	public void accountNumber() {
		System.out.println("Account Number: 101010");
	}
}

public class BankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  Create the bank object
		Bank bank =  new Bank("Jon", 50000.0,20000.0,30000.0);
		
// Display the bank details
		System.out.println("--Welcome our Bank System--");
		bank.displayBankDetails();
		bank.accountNumber();
	
		

	}

}
