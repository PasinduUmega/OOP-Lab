import java.util.ArrayList;

class Employee{
    String name;
    String employeeID;
    double salary;
    int performanceScore;

   public Employee(String name,String employeeID,double salary,int performanceScore){
       this.name = name;
       this.employeeID = employeeID;
       this.salary = salary;
       this.performanceScore = performanceScore;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        if(performanceScore >=1 && performanceScore <=10){
            this.performanceScore = performanceScore;
        }else{
            System.out.println("Invalid Performance Score");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <0){
            this.salary = salary;
        }else {
            System.out.println("Salary must be no negative");
        }
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public double calculateBonus(){
       if(performanceScore>=8){
           return salary * 0.1;
       } else if (performanceScore>5 && performanceScore<7) {
           return salary* 0.05;
       }else {
           return salary * 0;
       }
    }
    public void displayDetails() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Calculated Bonus: " + calculateBonus());
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

       employees.add (new Employee("Jon Smith", "Em12", 50000, 4));
        employees.add (new Employee   ("Michell Clerk", "Em13", 60000, 7));
        employees.add (new Employee("Adam Zampa", "Em15", 85000, 9));

        System.out.println("Employee Details:");
        for (Employee emp: employees){
            emp.displayDetails();
        }
    }
}

