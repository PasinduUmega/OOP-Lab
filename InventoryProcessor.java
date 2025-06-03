import java.util.Scanner;

class NegativePriceException extends Exception{
    public NegativePriceException(String message){
        super(message);
    }
}
class PriceOutOfRangeException extends Exception{
    public PriceOutOfRangeException(String message){
        super(message);
    }
}
class PriceNotNumericException extends Exception{
    public  PriceNotNumericException(String message){
        super(message);
    }
}

public class InventoryProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        String input = scanner.nextLine();

        try {
            double price;

            // Check if input is numeric
            try {
                price = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                throw new PriceNotNumericException("Invalid input. Please enter a numeric value for the price.");
            }

            // Check for negative price
            if (price < 0) {
                throw new NegativePriceException("Price cannot be negative. Please enter a valid amount.");
            }

            // Check for valid price range
            if (price < 1 || price > 10000) {
                throw new PriceOutOfRangeException("Price out of range. Please enter a value between $1 and $10,000.");
            }

            // If valid
            System.out.println("Price accepted: " + price);

        } catch (PriceNotNumericException | NegativePriceException | PriceOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

