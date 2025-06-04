class StudentU{
    String studentID;
    String studentName;
    static String universityName;

    public StudentU(String studentID,String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public  void displayStudentInfo(){
        System.out.println("Student ID:" + studentID);
        System.out.println("Student Name:" + studentName);
        System.out.println("University Name:" + universityName);
    }
}
public class UniversitySystemStatic {
 public static void main(String[] args){
     StudentU.universityName = "Moratuwa";

     StudentU studentU1 = new StudentU("IT2410","Jon Smith");
     StudentU studentU2 = new StudentU("IT2319","Michell star");
     StudentU studentU3 = new StudentU("IT2510","Rohith Sharma");

     System.out.println("Before the change name:");
     studentU1.displayStudentInfo();
     studentU2.displayStudentInfo();
     studentU3.displayStudentInfo();
     System.out.println();

     StudentU.universityName = "Sri Jayawardhanapura";

     System.out.println("After the change name:");
     studentU1.displayStudentInfo();
     studentU2.displayStudentInfo();
     studentU3.displayStudentInfo();

 }
}
