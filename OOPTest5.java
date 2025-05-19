class EmployeeP{
    String name;
    double salary;

   public EmployeeP(String name,double salary){
       this.name = name;
       this.salary = salary;
   }
   public void displayInfo(){
       System.out.println("Name:" + name);
       System.out.println("Salary:" + salary);
   }
}
class PartTimeEmployee extends EmployeeP{
    private int OTHours;
    public PartTimeEmployee(String name,double salary, int OTHours){
        super(name,salary);
        this.OTHours = OTHours;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("OT Hours:" + OTHours);
    }
}
public class OOPTest5 {
    public static void main(String[] args){

        PartTimeEmployee emp1 = new PartTimeEmployee("Alice",20000,7);
        PartTimeEmployee emp2 = new PartTimeEmployee("Pasindu",45000,5);

        System.out.println(" Part Time Employee 1:");
        emp1.displayInfo();
        System.out.println();

        System.out.println("Part Time Employee 2:");
        emp2.displayInfo();
    }
}
