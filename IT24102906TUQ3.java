import java.util.Scanner;
public class IT24102906TUQ3 {
    public static void main(String[] args) {

     // Create the scanner object class
      Scanner scanner = new Scanner(System.in);
      int [] array = new int[10];

        // Input the positive values
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a positive number" + " " +(i+1) + ":");
            int number = scanner.nextInt();

            // Validate that the input is a positive number
            while (number <= 0) {
                System.out.println("Error: Please enter a positive number.");
                System.out.print("Enter a positive number: ");
                number = scanner.nextInt();
            }

            // Store the valid positive number in the array
            array[i] = number;
        }

        // Find the largest value in the array
        int largestValue = array[0];  // Assume the first number is the largest

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestValue) {
                largestValue = array[i];  // Update the largest value
            }
        }

        // find the even number
        int evenNumber =0;
        int evenCount = 1;
        for (int i = 1; i< array.length; i++) {
            if (array[i] % 2 == 0){
                evenCount = array[i];
                evenCount++;

            }
        }

        // Display the largest value and even number
        System.out.println("The largest value is: " + largestValue);
        System.out.println("Even Number is:" + evenCount);
    }
}
