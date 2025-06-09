import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            System.out.print("Enter number: ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            numbers.add(input);
        }

        // Remove odd numbers without using iterator
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }

        // Display even numbers
        System.out.println("\nEven numbers in the list:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

