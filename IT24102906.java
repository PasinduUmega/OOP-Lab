import java.util.Scanner;
class Students{
    private int studentID;
    private String name;
    private double gpa;

  public Students(int studentID,String name,double gpa){
      this.studentID = studentID;
      this.name = name;
      this.gpa = gpa;
  }
  public String validations(){
      if(gpa>0.0&& gpa<= 4.0){
          return "Valid GPA";
      }else{
         return "Invalid GPA ";
      }
   }
   public void displayStudentDetails(){
       System.out.println("Student ID:" + studentID);
       System.out.println("Student Name:" + name);
       System.out.println("GPA:" + validations());
   }
}
public class IT24102906 {
    public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Student ID:");
        int studentID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the Student Name:");
        String studentName = scanner.nextLine();

        System.out.print("Enter the GPA:");
        double gpa = scanner.nextDouble();

        System.out.println();

        System.out.println("--Students Details--");
        Students students = new Students(studentID,studentName,gpa);
        students.displayStudentDetails();
    }
}
