import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String empID;
    String name;
    String address;

    public Employee() {
    }

    public Employee(String empID, String name, String address) {
        this.empID = empID;
        this.name = name;
        this.address = address;
    }

    void Read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        this.empID = scanner.nextLine();

        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
    }

    void Print() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
    }
}

class Manager extends Employee {
    String department;
    int productNumber1;
    int productNumber2;
    int productNumber3;

    public Manager() {
    }

    public Manager(String empID, String name, String address, String department,
                   int productNumber1, int productNumber2, int productNumber3) {
        super(empID, name, address);
        this.department = department;
        this.productNumber1 = productNumber1;
        this.productNumber2 = productNumber2;
        this.productNumber3 = productNumber3;
    }

    @Override
    void Read() {
        super.Read();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Department Name: ");
        this.department = scanner.nextLine();

        try {
            System.out.print("Enter product number 1: ");
            this.productNumber1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter product number 2: ");
            this.productNumber2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter product number 3: ");
            this.productNumber3 = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input! Setting product numbers to 0.");

        }
    }

    @Override
    void Print() {
        super.Print();
        System.out.println("Department Name: " + department);
        System.out.println("Product Number 1: " + productNumber1);
        System.out.println("Product Number 2: " + productNumber2);
        System.out.println("Product Number 3: " + productNumber3);
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Employee Details " + (i + 1));
            Employee employee = new Employee();
            employee.Read();
            employees.add(employee);
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Manager Details " + (i + 1));
            Manager manager = new Manager();
            manager.Read();
            employees.add(manager);
            System.out.println();
        }

        System.out.println("\n--- All Employee and Manager Details ---");
        for (Employee e : employees) {
            System.out.println();
            e.Print();
        }
    }
}
