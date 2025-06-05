import java.util.ArrayList;

class Address{
    String street;
    String city;
    String zipcode;

    public Address(String street,String city,String zipcode){
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }
    public String getFullAddress(){
      return   "Street: " + street + "City: " + city + "Zipcode: " + zipcode;
    }
}
class Person{
    String name;
    int age;
    String id;
    Address address;

    public Person(String name,int age,String id, Address address){
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id );
        System.out.println("Address: " + address.getFullAddress());
    }
}
class Student extends  Person{
    String gradeLevel;
    public Student(String name,int age,String id, Address address,String gradeLevel){
        super(name,age,id,address);
        this.gradeLevel = gradeLevel;
    }
    @Override
     public void display(){
        super.display();
        System.out.println("Grade Level: " + gradeLevel);
    }
}
class Teacher extends  Person{
    String subject;
    ArrayList<Student> students = new ArrayList<>();

    public Teacher(String name,int age,String id, Address address,String subject){
        super(name,age,id,address);
        this.subject = subject;
    }
    public void addStudent(Student s){
        students.add(s);
    }
    @Override
     public void display(){
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Students:");
        for (Student s: students){
            System.out.println();
            s.display();
        }
    }
}
class Club {
    private String name;
    private ArrayList<Student> members = new ArrayList<>();

    public Club(String name) {
        this.name = name;
    }

    public void addMember(Student s) {
        members.add(s);
    }

    public void displayMembers() {
        System.out.println("Club: " + name);
        for (Student s : members) {
            s.display();
        }
    }
}
class School {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public void displaySchoolInfo() {
        System.out.println("--- School Information ---");
        System.out.println("Students:");
        for (Student s : students) {
            s.display();
            System.out.println();
        }

        System.out.println("Teachers:");
        for (Teacher t : teachers) {
            t.display();
            System.out.println();
        }
    }
}
public class SchoolManagemant {
    public static void main(String[] args) {
        Address addr1 = new Address("12 Main St", "CityOne", "12345");
        Address addr2 = new Address("34 Park Ave", "CityTwo", "67890");

        Student student1 = new Student("Alice", 16, "S1001", addr1, "10th Grade");
        Student student2 = new Student("Bob", 17, "S1002", addr2, "11th Grade");

        Teacher teacher = new Teacher("Mr. Smith", 40, "T5001", addr1, "Mathematics");
        teacher.addStudent(student1);
        teacher.addStudent(student2);

        Club scienceClub = new Club("Science Club");
        scienceClub.addMember(student1);
        scienceClub.addMember(student2);

        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);
        school.addTeacher(teacher);

        school.displaySchoolInfo();

        System.out.println("\n--- Club Info ---");
        scienceClub.displayMembers();
    }
}
