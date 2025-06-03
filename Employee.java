import java.util.Scanner;

class InvalidSalaryException extends  Exception{
    public InvalidSalaryException(String message){
        super(message);
    }
}


class Employees{
    String name;
    String employeeID;
    String department;
    double salary;

    public Employees(String name,String employeeID, String department,double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double calculationBonus(){
        double bonus = 0;
        switch (department){
            case "HR":
                bonus = salary *0.1;
                break;
            case "IT":
                bonus =salary *0.15;
                break;
            case "Other Department":
                    bonus = salary *0.5;
                    break;
            default:
                bonus = 0;
                break;
        }
        return bonus;
    }
}
public class Employee {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the salary:");
            double salary = scanner.nextDouble();
            if(salary<0||salary>1000000){
                throw new InvalidSalaryException("Inv5aild Salary entered");
            }
            Employees employees = new Employees("Jon","Em123","HR",salary);
            double totalSalary = employees.calculationBonus()+ employees.salary;
            System.out.println("Total Salary:" + totalSalary);
        }catch (InvalidSalaryException e){
            System.out.println("Error"+ e.getMessage());
        }
    }
}
