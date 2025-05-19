// (a) Abstract class
abstract class EmployeePa {
    protected String empId;
    protected String name;

    public EmployeePa(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public abstract double calculateSalary();
}

// (b) Interface
interface Payable {
    void generatePayslip();
}

// (cA) Permanent Employee
class PermanentEmployee extends EmployeePa implements Payable {
    private double monthlySalary;

    public PermanentEmployee(String empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void generatePayslip() {
        System.out.println("=== Permanent Employee Payslip ===");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}

// (cB) Contract Employee
class ContractEmployee extends EmployeePa implements Payable {
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String empId, String name, int hoursWorked, double hourlyRate) {
        super(empId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void generatePayslip() {
        System.out.println("=== Contract Employee Payslip ===");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}

public class IT24102906Lab9Q5 {
    public static void main(String[] args) {
        Payable p1 = new PermanentEmployee("E001", "John", 4000);
        Payable p2 = new ContractEmployee("E002", "Sara", 160, 25);

        p1.generatePayslip();
        p2.generatePayslip();
    }
}
