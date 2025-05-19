import java.util.Scanner;
class Bank{
    private String accountHolderName;
    private int accountNumber;
    private double balance;

// Constructor to initialized for the bank class
   public Bank(String accountHolderName,int accountNumber, double balance){
       this.accountHolderName = accountHolderName;
       this.accountNumber = accountNumber;
       this.balance = balance < 0 ? 0 : balance; // Ensuring the balance for the not negative value
   }

// Create the deposit methods
    public void depositAmounts(double amount){
       if(amount> 0){
           balance += amount;
           System.out.println("New Balance:" + balance);
       }else{

       }
    }

// Create the withdraw methods
   public void withdrawAmounts(double amount){
       if(amount>0 && amount<= balance){
           balance -= amount;
           System.out.println("New Balance"+balance);
       } else if (amount> balance) {
           System.out.println("Insufficient for your account balance");
       }else {
           System.out.println("Withdraw amount not positive");
       }
   }

// Display the bank details
   public void displayBankDetails(){
       System.out.println("\n Account Details");
       System.out.println("Account Number:" + accountNumber);
       System.out.println("Account Holder Name:" + accountHolderName);
       System.out.println("Current Balance for the account:" + balance);
   }
}
public class BankSystem {
    public static void main(String[] args){

// Create the scanner object to the read
   Scanner scanner = new Scanner(System.in);

// Take the user input for adding the system
   System.out.print("Enter the Account Number:");
   int accountNumber = scanner.nextInt();
   scanner.nextLine();

   System.out.print("Enter the Account Holder Name:");
   String accountHolderName = scanner.nextLine();


   System.out.print("Enter the current Balance:");
   double balance = scanner.nextDouble();

// Create the bank object
    Bank bank = new Bank(accountHolderName,accountNumber,balance);

// Allowing the deposit amount for the account
   System.out.print("Enter the Deposit Amount:");
   double depositAmount = scanner.nextDouble();
// Display the deposit methods
   bank.depositAmounts(depositAmount);

// Allowing the withdraw amount for the account
    System.out.print("Enter the Withdraw Amount:");
    double withdrawAmount = scanner.nextDouble();
// Display the withdraw methods
    bank.withdrawAmounts(withdrawAmount);

// Display the bank details
   bank.displayBankDetails();

    }
}
