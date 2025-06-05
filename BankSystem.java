interface InterApplicable{
    double calculateInterest();
}
abstract class Account{
    int accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "National Savings Bank";

   public Account(int accountNumber,String accountHolderName,double balance){
       this.accountNumber = accountNumber;
       this.accountHolderName = accountHolderName;
       this.balance = balance;
   }
  abstract void displayAccountInfo();
   }

   class SavingsAccount extends Account implements InterApplicable{
    double interestRate = 0.05;

    public SavingsAccount(int accountNumber,String accountHolderName,double balance){
        super(accountNumber,accountHolderName,balance);
    }
    @Override
       public double calculateInterest(){
        return balance * interestRate;
    }
    @Override
       public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
   }
 class FixedDepositeAccount extends  Account implements InterApplicable{
    double fixedDepositInterestRate =  0.1;
    public FixedDepositeAccount (int accountNumber,String accountHolderName,double balance){
        super(accountNumber,accountHolderName,balance);
    }
     @Override
     public double calculateInterest(){
         return balance * fixedDepositInterestRate;
     }
    @Override
     public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
        System.out.println("Fixed Deposit Rate : " + fixedDepositInterestRate);
    }
 }

public class BankSystem{
    public static void main(String[] args){

     SavingsAccount savingsAccount = new SavingsAccount(1019,"Jon Smith",50000);
     FixedDepositeAccount fixedDepositeAccount = new FixedDepositeAccount(1089,"Michell Clerk",60000);

     savingsAccount.displayAccountInfo();
     System.out.println();
     fixedDepositeAccount.displayAccountInfo();
     System.out.println();

     Account.bankName = "Bank Of Ceylon";

        System.out.println("After changing the name:");
        savingsAccount.displayAccountInfo();
        System.out.println();
        fixedDepositeAccount.displayAccountInfo();

    }
}
