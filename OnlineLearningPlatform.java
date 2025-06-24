abstract class User{
    String userID;
    String userName;
    String email;

    public User(String userID, String userName,String email){
        this.userID = userID;
        this.userName = userName;
        this.email = email;
    }

    abstract double calculateEngagementScore();

    public void displayUserInfo(){
        System.out.println("User ID: " + userID);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("calculate Engagement Score:" + calculateEngagementScore());
    }
}
interface Learnable{
    void enrollInCourse(String courseName);

    void   submitAssignment(String assignmentId);
}
interface Teachable{
    void createCourse(String courseName);

    void  gradeAssignment(String assignmentId, int score);
}
interface Manageable {
    void  generateReport();

    void manageUsers();
}
class StudentUser extends User implements Learnable{
    int courseEnrolled;
    int assignmentSubmitted;

    public StudentUser(String userID, String userName, String email){
        super(userID,userName,email);
        this.courseEnrolled = 0;
        this.assignmentSubmitted = 0;

    }
    @Override
    public void enrollInCourse(String courseName) {
        System.out.println(userName + " enrolled in course: " + courseName);
        courseEnrolled++;
    }

    @Override
    public void submitAssignment(String assignmentId) {
        System.out.println(userName + " submitted assignment: " + assignmentId);
        assignmentSubmitted++;
    }

    @Override
    public double calculateEngagementScore() {
        return (courseEnrolled * 10) + (assignmentSubmitted * 5);
    }
}
 class InstructorUser extends User implements Learnable, Teachable {
    private int coursesCreated;
    private int coursesEnrolled;
    private int assignmentsGraded;

    public InstructorUser(String userID, String userName, String email) {
        super(userID, userName, email);
    }

    @Override
    public void createCourse(String courseName) {
        System.out.println(userName + " created course: " + courseName);
        coursesCreated++;
    }

    @Override
    public void gradeAssignment(String assignmentId, int score) {
        System.out.println(userName + " graded assignment " + assignmentId + " with score " + score);
        assignmentsGraded++;
    }

    @Override
    public void enrollInCourse(String courseName) {
        System.out.println(userName + " enrolled in course: " + courseName);
        coursesEnrolled++;
    }

    @Override
    public void submitAssignment(String assignmentId) {
        // Not needed for instructors, but can be left empty or throw exception
    }

    @Override
    public double calculateEngagementScore() {
        return (coursesCreated * 20) + (coursesEnrolled * 10) + (assignmentsGraded * 3);
    }
}
 class AdminUser extends User implements Manageable {
    private int reportsGenerated;
    private int usersManaged;

    public AdminUser(String userID, String userName, String email) {
        super(userID, userName, email);
    }

    @Override
    public void generateReport() {
        System.out.println(userName + " generated a report.");
        reportsGenerated++;
    }

    @Override
    public void manageUsers() {
        System.out.println(userName + " managed a group of users.");
        usersManaged++;
    }

    @Override
    public double calculateEngagementScore() {
        return (reportsGenerated * 15) + (usersManaged * 2);
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        // Create users
        StudentUser student = new StudentUser("D1", "Alice", "alice@example.com");
        InstructorUser instructor = new InstructorUser("D2", "Bob", "bob@example.com");
        AdminUser admin = new AdminUser("D3", "Carol", "carol@example.com");

        // Perform activities
        student.enrollInCourse("Java Basics");
        student.enrollInCourse("Data Structures");
        student.submitAssignment("A101");

        instructor.createCourse("Java Advanced");
        instructor.enrollInCourse("Teaching Skills");
        instructor.gradeAssignment("A101", 90);

        admin.generateReport();
        admin.manageUsers();
        admin.manageUsers();

        // Store in a User[] and use polymorphism
        User[] users = new User[] { student, instructor, admin };

        System.out.println("\n=== User Details and Engagement Scores ===");
        for (User user : users) {
            user.displayUserInfo();  // Polymorphism in action
        }
    }
}
