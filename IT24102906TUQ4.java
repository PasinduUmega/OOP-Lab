import java.util.Scanner;
public class IT24102906TUQ4 {
    public static void main(String[] args){
// Declare the Student Id Assume the array
      int [] students =  new int[12];

 // Create the scanner object to the read
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Enter the 12 Students Registration Id");

// Assume the students id
   for(int i = 0; i< students.length;i++){
       System.out.print("Students" + (i+1) + ":");
       students[i] = scanner.nextInt();
   }

//  Search for the students
        System.out.println("Search for the students Id :");
        int searchId = scanner.nextInt();
        boolean found =  false;

        for (int id : students) {
            if (id == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is available");
        } else {
            System.out.println("Student is not available");
        }


    }
}
