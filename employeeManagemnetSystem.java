abstract class EmployeeSystem{
    String employeeID;
    String employeeName;
    static String companyName = "IFS";

    public EmployeeSystem(String employeeID,String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    public abstract double calculateSalary();

    public abstract double calculateBonus();

    public void displayEmployeeDetails(){
        System.out.println("Employee ID;" + employeeID);
        System.out.println("Employee Name:" + employeeName);
        System.out.println("Company Name:" + companyName);
    }
}
interface BonusEligible {
    double calculateBonus();
}
class PramenetEmployee extends EmployeeSystem{
    double baseSalary;
    public PramenetEmployee(String employeeID,String employeeName,double baseSalary){
        super(employeeID,employeeName);
        this.baseSalary = baseSalary;
    }
    @Override
     public double calculateBonus(){
        return  baseSalary * 0.1;
    }
    @Override
      public double calculateSalary(){
        return baseSalary + calculateBonus();
    }
    @Override
     public void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Calculate Bonus:" + calculateBonus());
        System.out.println("Calculate Salary:" + calculateSalary());
    }
}
 class ContractEmployee extends EmployeeSystem{
    double hourlyRate;
    int hoursWorked;

    public ContractEmployee(String employeeID, String employeeName, double hourlyRate, int hoursWorked) {
        super(employeeID,employeeName);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
      public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

     @Override
     public double calculateBonus() {
         return 0;
     }

     @Override
     public void displayEmployeeDetails(){
      super.displayEmployeeDetails();
        System.out.println("Calculate Salary:" + calculateSalary());
    }
}
public class employeeManagemnetSystem {
    public static void main(String[] args){

      PramenetEmployee pramenetEmployee = new PramenetEmployee("Em12","Joh Smith",50000);
      ContractEmployee contractEmployee = new ContractEmployee("E13","Michell Clerk",20,60);

      pramenetEmployee.displayEmployeeDetails();
        System.out.println();
        contractEmployee.displayEmployeeDetails();
        System.out.println();

        EmployeeSystem.companyName = "Global Traning";

        System.out.println("After the change the name:");
        pramenetEmployee.displayEmployeeDetails();
        System.out.println();
        contractEmployee.displayEmployeeDetails();

    }
}


