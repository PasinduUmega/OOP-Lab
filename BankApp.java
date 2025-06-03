import java.util.Scanner;

class WithdrawAmountException extends Exception{
    public WithdrawAmountException(String message){
        super(message);
    }
}
class AccountBalanceException extends Exception{
    public AccountBalanceException(String message){
        super(message);
    }
}
class BankAccount{
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
   // create the methods called of the withdraw
   public void withdrawAmount(double amount) throws WithdrawAmountException, AccountBalanceException {
       if(amount < 0){
           throw new WithdrawAmountException("Amount cannot be negative ");
       } else if (amount > balance) {
           throw new  AccountBalanceException("Insufficient balance");
           
       }
  balance -= amount;
       System.out.println("Withdraw Successfully." + balance);
   }
}


public class BankApp {

    // Static block to run once when program starts
    static {
        System.out.println(" Welcome to Secure Bank System");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("AC123456", 5000.00); // Sample account

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            // Try withdrawal
            account.withdrawAmount(amount);

        } catch (WithdrawAmountException e) {
            System.out.println("Error: " + e.getMessage());

        }catch (AccountBalanceException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        } finally {
            System.out.println(" Thank you for banking with us.");
        }
    }
}

