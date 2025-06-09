import java.util.Scanner;

class MinusAgeException extends  Exception{
    public MinusAgeException(String message){
        super(message);
    }
}
class HigherAgeException extends  Exception{
    public HigherAgeException(String message){
        super(message);
    }
}
class InvalidCharacterAgeException extends Exception{
    public InvalidCharacterAgeException(String message){
        super(message);
    }
}

public class DemoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine();

        try {
            // Check for special characters
            if (ageInput.contains("@") || ageInput.contains("#") || ageInput.contains("&")) {
                throw new InvalidCharacterAgeException("Age cannot have special characters");
            }

            // Try to parse the age
            int age = Integer.parseInt(ageInput);

            // Check for minus or zero age
            if (age <= 0) {
                throw new MinusAgeException("Age cannot be minus or zero");
            }

            // Check for age above 120
            if (age > 120) {
                throw new HigherAgeException("Age cannot be higher than 120");
            }

            // If all validations pass
            System.out.println("Valid age entered: " + age);

        } catch (InvalidCharacterAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MinusAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (HigherAgeException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
