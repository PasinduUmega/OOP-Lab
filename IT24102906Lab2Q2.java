import java.util.Scanner;
public class IT24102906Lab2Q2 {
    public static void insertionSort(int[] arr) {
        //  all elements Store the array
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Element to be inserted into the sorted portion
            int j = i - 1;

            // the while loop create the position for the 0 elements to inserted the key value of greater than to compare the elements
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insert the key element into its correct position
            arr[j + 1] = key;

            // Display the current state of the array after this insertion
            displayArray(arr, i);
        }
    }

    // Method to display the current state of the array after each step
    public static void displayArray(int[] arr, int step) {
        System.out.print("Step " + step + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // New line for better readability
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nStep-by-step Insertion Sort Process:");
        // Call the insertion sort method to sort the array and display steps
        insertionSort(arr);

        // Display the final sorted array
        System.out.println("\nFinal Sorted Array:");
        displayArray(arr, n);
    }
}

