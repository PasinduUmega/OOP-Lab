import java.util.Scanner;
public class IT24102906Lab7Q1A {
    public static void main(String[] args){

// Create the Scanner object to the read
      Scanner scanner =  new Scanner(System.in);

// Input the four subject
   System.out.println("Enter Marks For Four Subjects:");
   System.out.print("Enter Subject Mark 1:");
   int subj1 = scanner.nextInt();
   System.out.print("Enter Subject Mark 2:");
   int subj2 = scanner.nextInt();
   System.out.print("Enter Subject Mark 3:");
   int subj3 = scanner.nextInt();
   System.out.print("Enter Subject Mark 4:");
   int subj4 = scanner.nextInt();
   System.out.println();


 // Calculate the Average
    double sum = (subj1+ subj2+ subj3+ subj4);
    double average  =  sum / 4;

// Assign the grade for the results
String grade ;
if(average <= 75){
    grade = "Distinction";
} else if (average<=50) {
    grade = "Credit";

}else{
    grade = "Fail";
}

// Display the results for the average and grade
System.out.println("Average is:" + average);
System.out.println("Overall Grade is:" + grade);


    }
}
