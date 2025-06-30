package Array;
public class Array {

    public static void main(String[] args) {

        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Print the array elements
        System.out.println("Array Elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 3. Find the sum of all elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of Array Elements: " + sum);

        // 4. Find the largest element in the array
        int max = numbers[0]; 
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Largest Element: " + max);
        
        // 5. Find the lowest elements in the array
        int low = numbers[0];
        for(int number : numbers) {
        	if(number < low) {
        		low = number;
        	}
        }
        System.out.println("Lowest Elements:" + low);

        // 6. Reverse the array
        System.out.println("Reversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
