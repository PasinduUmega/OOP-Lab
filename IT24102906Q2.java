import java.util.Scanner;
public class IT24102906Q2 {
    public static void main(String[] args) {

        // Create the Scanner object to the read
        Scanner scanner = new Scanner(System.in);

        // to declare the 5 integer values from the array
        int[] numbers = new int[5];

        // to accept the 5 integer numbers
        System.out.println("Please Enter the largest Value:");
        int largestValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        //  Find the largest value in the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestValue) {
                largestValue = numbers[i];
            }
        }

        //  Find the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Display both the largest value and the sum of elements
        System.out.println("Largest value in the array: " + largestValue);
        System.out.println("Sum of all elements in the array: " + sum);

    }
}