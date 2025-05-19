class StudentP{
    String name;
    int age;

    public StudentP(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}
class CourseP extends StudentP{
    private String courseName;

    public CourseP(String name,int age,String courseName){
        super(name,age);
        this.courseName = courseName;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Course Name:" + courseName);
    }
}
public class OOPTest6 {
    public static void main(String[] args){
        CourseP courseP1 = new CourseP("Alice",20,"Java Programming");
        CourseP courseP2 = new CourseP("Bob", 23,"CSS");

        System.out.println("Course Details 1:");
        courseP1.displayInfo();
        System.out.println();

        System.out.println("Course Details 2:");
        courseP2.displayInfo();
    }

}
