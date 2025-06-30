package Calculate;
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Create the Scanner Object to the read
		Scanner scanner = new Scanner(System.in);
		
// Enter the first number 
		System.out.print("Enter the first number:");
		double number1 = scanner.nextDouble();
		
// Enter the seconds number
		System.out.print("Enter the seconds number:");
		double number2 = scanner.nextDouble();
		
		System.out.println();
		
// Choice of the Operations
		System.out.println(" Enter Your Operations Options ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplications");
		System.out.println("4.Devisions");
		System.out.println("5.Reminds");
		System.out.println("6.Power");
		System.out.println("7.Exits");
		System.out.print("Enter your choice (1-7):");
		int choice = scanner.nextInt();
		
// Decleare the results 
		double results = 0;
				
// If the take the switch statments 
		switch(choice) {
		case 1: // Adding the Operations
			results = number1 + number2;
			System.out.println("Results(Adding):" + results);
			break;
			
		case 2:// Subtractions the Operations
			results = number1 + number2;
			System.out.println("Results(Subtractions):" + results);
			break;
			
		case 3:// Multiplications the Operations
			results = number1 * number2;
			System.out.println("Results(Multiplications):" + results);
			break;
			
		case 4:// Devisions the Operations 
			if(number2 !=0) {
				results = number1 / number2;
				System.out.println("Results(Devisions):" + results);
				
			} else {
				System.out.println("Errore: Division by Zero not Allowed");
			}
	        break;
	        
		case 5:
			results = number1 % number2;
			System.out.println("Results(Reminds):" + results);
			break;
			
		case 6:
			results = Math.pow(number1 , number2);
			System.out.println("Results(power)" + results);
			break;
		   default:
			System.out.println("Errore :Invaild choice please enter the vaild choice ");
			
		}
		
		
		

	}

}
