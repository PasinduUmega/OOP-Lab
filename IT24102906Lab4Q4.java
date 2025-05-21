class Driver{
    private String driverID;
    private String driverName;
    private double basicSalary;
    private int performanceScore;


// Constructor to initialized for the driver class
   public Driver(String driverID,String driverName,double basicSalary,int performanceScore){
       this.driverID = driverID;
       this.driverName = driverName;
       this.basicSalary = basicSalary;
       this.performanceScore = performanceScore;
   }

// Create the methods of the calculate the bonus
    public double calculateBonus(){
       double bonusPercentage = 0.0;
       switch (performanceScore){
           case 5:
               bonusPercentage = 0.25; // 25% of base salary
               break;
           case 4:
               bonusPercentage = 0.20; // 20% of base salary
               break;
           case 3:
               bonusPercentage = 0.15; // 15% of base salary
               break;
           case 2:
               bonusPercentage = 0.1; // 10% of base salary
               break;
           case 1:
               bonusPercentage = 0.0; // No bonus
       }
       return basicSalary  * bonusPercentage;
    }

 // Create the methods of the total salary
     public double totalSalary(){
       double calculateBonus;
     return basicSalary + calculateBonus();
     }

 // Display the driver details
    public void displayDriverDetails(){
       System.out.println("Driver ID:" + driverID);
        System.out.println("Driver Name:" + driverName);
        System.out.println("Basic Salary:" + basicSalary);
        System.out.println("Performance Score:" + performanceScore);
        System.out.println("Bonus:" + calculateBonus());
        System.out.println("Total Salary:" + totalSalary());

        System.out.println();

    }
}
public class IT24102906Lab4Q4{
    public static void main(String[] args){

// Create the driver class
   Driver driver1 = new Driver("D1001","John Smith",4000.0,5);
   Driver driver2 = new Driver("D1002","Emily Davis", 3500.0,3);
   Driver driver3 =  new Driver("D1003","Michael Johnson",5000.0,1);

 // Display the driver details
   driver1.displayDriverDetails();
   driver2.displayDriverDetails();
   driver3.displayDriverDetails();

 // Calculate the bonus
   driver1.calculateBonus();
   driver2.calculateBonus();
   driver3.calculateBonus();

 // Calculate the total salary
 driver1.totalSalary();
 driver2.totalSalary();
 driver3.totalSalary();


    }
}