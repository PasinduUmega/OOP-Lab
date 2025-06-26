import java.util.Scanner;
class InvalidEmailExcpation extends Exception{
    public InvalidEmailExcpation(String message){
        super(message);
    }
}
class InvalidPasswordExcpation extends Exception{
    public InvalidPasswordExcpation(String message){
        super(message);
    }
}

abstract class User1{
    String userID;
    String userName;
    String email;
    String password;

    public User1(String userID,String userName,String email,String password){
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
    abstract double calculateEngagementScore();

    public void displayUserDetails(){
        System.out.println("User ID: " + userID);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Calculate Engagement Score: " + calculateEngagementScore());
    }
}
interface Learnable {
    void enrollnCourse(String courseName);
    void submitAssignment(String assignmentID);
}
interface Teachable {
    void createCourse(String courseName);
    void gradeAssignment(String assignmentID , int score);
}
interface Manageable{
    void generateReport();
    void manageUser();
}
class StudentUser extends User1 implements Learnable{
    int courseEnrolled;
    int assignmentEnrolled;

    public StudentUser(String userID,String userName,String email,String password){
        super(userID, userName,email,password);
        this.courseEnrolled = 0;
        this.assignmentEnrolled = 0;
    }
    @Override
    public  void enrollnCourse(String courseName){
        System.out.println(userName + "is enrolled" + courseName);
        courseEnrolled++;
    }
    @Override
    public void  submitAssignment(String assignmentID){
        System.out.println(userName + "is assigned" + assignmentID);
        assignmentEnrolled++;
    }

@Override
    public double calculateEngagementScore(){
        return (courseEnrolled * 10) + (assignmentEnrolled * 5);
  }
}
class InstructorUser extends User1 implements Learnable, Teachable{
    int  courseCreated;
    int courseEnrolled;
    public InstructorUser(String userID,String userName,String email,String password){
        super(userID,userName,email,password);
        this.courseEnrolled = 0;
        this.courseCreated = 0;
    }
    @Override
    public  void enrollnCourse(String courseName){
        System.out.println(userName + "is enrolled" + courseName);
        courseEnrolled++;
    }
    @Override
    public void submitAssignment(String assignmentID){
        System.out.println(userName + "is assigned" + assignmentID);
    }
    @Override
    public void createCourse(String courseName){
        System.out.println(userName + "is created" + courseName);
    }
    @Override
    public void gradeAssignment(String assignmentID, int score){
        System.out.println(userName + "is assigned" + assignmentID + "Score" + score);
    }
    @Override
    public double calculateEngagementScore(){
        return (courseCreated * 20) + (courseEnrolled * 10);
    }
}
class AdminUser extends User1 implements Manageable{
    int reportsGenerated;
    int userManaged;
    public AdminUser(String userID,String userName,String email,String password){
        super(userID,userName,email,password);
        this.reportsGenerated = 0;
        this.userManaged = 0;
    }
    @Override
    public void generateReport(){
        System.out.println(userName + "is enrolled" + reportsGenerated);
        reportsGenerated++;
    }
    @Override
    public void manageUser(){
        System.out.println(userName + "is assigned" + userManaged);
    }
    @Override
    public double calculateEngagementScore(){
        return (reportsGenerated * 15) + (userManaged * 5);
    }
}

public class OnlinePlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Platfrom");
        System.out.print("Enter the User ID:");
        String userID = scanner.nextLine();

        System.out.print("Enter the User Name:");
        String userName = scanner.nextLine();

        System.out.print("Enter the Email:");
        String email = scanner.nextLine();

        System.out.print("Enter the password:");
        String password = scanner.nextLine();


        User1 user1= new StudentUser(userID,userName,email,password);
        User1 user2 = new InstructorUser(userID,userName,email,password);
        User1 user3 = new AdminUser(userID,userName,email,password);

        StudentUser studentUser = new StudentUser(user1.userID,user1.userName,user1.email,user1.password);
        InstructorUser instructorUser = new InstructorUser(user2.userID,user2.userName,user2.email,user2.password);
        AdminUser adminUser = new AdminUser(user3.userID,user3.userName,user3.email,user3.password);

        studentUser.enrollnCourse("java");
        studentUser.submitAssignment("Basic");
        studentUser.calculateEngagementScore();
        studentUser.displayUserDetails();
        System.out.println();

        instructorUser.enrollnCourse("Phython");
        instructorUser.submitAssignment("simple");
        instructorUser.calculateEngagementScore();
        instructorUser.displayUserDetails();
        System.out.println();

        adminUser.manageUser();
        adminUser.generateReport();
        adminUser.calculateEngagementScore();
        adminUser.displayUserDetails();

    }
}