import java.util.ArrayList;
import java.util.Scanner;

class CreditLimitExceededException extends Exception {
    public CreditLimitExceededException(String message) {
        super(message);
    }
}
interface Registrable {
    void registerCourse(String courseName, int credits) throws CreditLimitExceededException;
}
abstract class Person{
    String name;
    String id;

    public Person(String name,String id){
        this.name = name;
        this.id = id;
    }
    public abstract void displayDetails();
    }

    class Student extends Person implements Registrable{
      ArrayList<String> courses = new ArrayList<>();
      int totalCredits = 0;
      final int maxCredits = 18;

      public Student(String name,String id){
          super(name,id);
      }
      public void registerCourse(String courseName,int credits) throws CreditLimitExceededException{
        if(totalCredits + credits > maxCredits){
            throw new CreditLimitExceededException("Cannot register. Credit limit of " + maxCredits + " exceeded.");
        }
        courses.add(courseName);
        totalCredits+= credits;
          System.out.println("Register for:" + courseName);
      }
      public void displayDetails(){
          System.out.println("\nStudent Name: " + name);
          System.out.println("Student ID: " + id);
          System.out.println("Registered Courses:");
          for (String course : courses) {
              System.out.println("- " + course);
          }
          System.out.println("Total Credits: " + totalCredits);
      }
    }


public class UniversitySystem {

    // Static block runs once
    static {
        System.out.println(" Welcome to University Course Registration System");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Alice", "STU123");

        try {
            while (true) {
                System.out.print("\nEnter course name (or 'exit' to finish): ");
                String course = scanner.nextLine();
                if (course.equalsIgnoreCase("exit")) break;

                System.out.print("Enter course credits: ");
                int credits = Integer.parseInt(scanner.nextLine());

                student.registerCourse(course, credits);
            }
        } catch (CreditLimitExceededException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        } finally {
            student.displayDetails();
            System.out.println("\n Registration complete. Thank you!");
        }
    }
}

