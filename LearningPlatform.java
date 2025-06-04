interface Enrollable{
   void Enrollable (String courseName);
}
interface Teachable{
    void Teachable (String courseName);
}
class StudentI implements  Enrollable{
    String name;

    public StudentI (String name){
        this.name = name;
    }
    @Override
    public void Enrollable(String courseName){
        System.out.println("Enter name:" + name +"," + "Course name:" + courseName);
    }
}
class Instrucor  implements  Enrollable ,Teachable{
    String name;
    public Instrucor(String name){
        this.name = name;
    }
    @Override
    public void Enrollable(String courseName){
        System.out.println("Instructor:" + name+"," + "Course name:" + courseName);
    }
    @Override
    public void Teachable(String courseName){
        System.out.println("Instructor:" + name + "," + "Course name:" + courseName);
    }
}
public class LearningPlatform {
    public static void main(String[] args){

        StudentI studentI = new StudentI("jon");
        Instrucor instrucor = new Instrucor("Dr.Bob");

        studentI.Enrollable("java ");
        instrucor.Enrollable("Machnic Engineer");
        instrucor.Teachable("Qulity Assurance Engineer ");
    }
}
