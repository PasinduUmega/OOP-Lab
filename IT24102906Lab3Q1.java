import java.util.Scanner;

class SavingsAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the savings account
    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance < 0 ? 0 : balance; // Ensuring no negative balance
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful: " + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount should be positive.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class IT24102906Lab3Q1 {
    public static void main(String[] args) {
        // Create the scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Creating the savings account object
        SavingsAccount account = new SavingsAccount(accountNumber, accountHolderName, initialBalance);

        // Display initial account details
        account.displayAccountDetails();

        // Allowing the user to deposit money
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Display updated account details
        account.displayAccountDetails();

        // Allowing the user to withdraw money
        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final account details
        account.displayAccountDetails();


    }
}
