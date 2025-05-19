import java.util.Scanner;
public class iT24102906Lab2Q5 {
    public static void main(String[] args){

     // Create the scanner object to the read
      Scanner scanner = new Scanner(System.in);

      // Declare an array to store 5 words
        String[] words = new String[5];

        // Accept 5 words from the user and store them in the array
        System.out.print("Please enter 5 words:");

        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
        }

        // Find and display the longest word from the array
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is: " + longestWord);

        // Calculate and display the total number of characters in all the words combined
        int totalCharacters = 0;
        for (int i = 0; i < words.length; i++) {
            totalCharacters += words[i].length();
        }
           System.out.println("The total number of characters in all words is: " + totalCharacters);

        // Identify and display the words with an even number of characters
        System.out.println("Words with an even number of characters:");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }
}
