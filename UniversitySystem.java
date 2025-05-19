class Student {
    private String studentId;
    private String studentName;
    static String universityName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("University: " + universityName);
        System.out.println();
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        // Set static variable
        Student.universityName = "Global Tech University";

        // Create students
        Student s1 = new Student("S001", "Alice");
        Student s2 = new Student("S002", "Bob");
        Student s3 = new Student("S003", "Carol");

        System.out.println("=== Initial University Name ===");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();

        // Change university name
        Student.universityName = "NextGen University";

        System.out.println("=== After Changing University Name ===");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}
