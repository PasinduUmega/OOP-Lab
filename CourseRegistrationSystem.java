import java.util.ArrayList;

interface Registerble{
    void Registerble(String courseNamee);
}
abstract class User{
    String userName;
    String userPassword;
    static String platfrom = "eLearnX";

    public User(String userName,String userPassword){
        this.userName =userName;
        this.userPassword = userPassword;
    }
    abstract void displayUserDetails();
}
class Admin extends  User implements Registerble{
    ArrayList<String> registerCourses = new ArrayList<>();

    public Admin(String userName,String usrPassword){
        super(userName,usrPassword);
    }
    public void  registerCourses(String courseName){
        registerCourses.add(courseName);
        System.out.println("Student registered for course: " + courseName);
    }
    @Override
     public void displayUserDetails(){
        System.out.println("User Name: " + userName);
        System.out.println("User Password: " + userPassword);
        System.out.println("Used the Platfrom: " + platfrom);
        System.out.println("Courses: " + registerCourses );
    }

    @Override
    public void Registerble(String courseNamee) {

    }
}
class Teacher extends User implements Registerble{
    ArrayList<String> techingCourse = new ArrayList<>();

    public Teacher(String userName,String userPassword){
        super(userName,userPassword);
    }
    public void techingCourse(String techingLearning){
        techingCourse.add(techingLearning);
        System.out.println("Teacher registered for course: " + techingCourse);
    }
    @Override
     public void displayUserDetails(){
        System.out.println("User Name: " + userName);
        System.out.println("User Password: " + userPassword);
        System.out.println("Used the Platfrom: " + platfrom);
        System.out.println("Courses: " + techingCourse );
    }

    @Override
    public void Registerble(String courseNamee) {

    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args){

    Admin admin = new Admin("Jon Smith","Joh@13");
    Teacher teacher = new Teacher("Mathew wade","Mathew@34");

    admin.registerCourses("Java Programming");
    teacher.techingCourse("Data Science");

    admin.displayUserDetails();
    System.out.println();
    teacher.displayUserDetails();
    System.out.println();

    System.out.println("After the change the platfrom:");
    User.platfrom = "Smart Leran";
    admin.displayUserDetails();
    System.out.println();
    teacher.displayUserDetails();

    }
}