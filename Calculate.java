package Calculate;
import java.util.Scanner;
public class Calculate{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Create the Scanner Object to the read
		Scanner scanner = new Scanner(System.in);
		boolean contiuneCalculate = true;
	
	
			
		System.out.println("\n---Options---");
		System.out.println("1.Adding");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Devision");
		System.out.println("5. Reminds");
		System.out.println("6.Power");
		System.out.println("7.Square Root");
		System.out.println("8. Logarithm (base 10)");
		System.out.println("9.Sinec(sin)");
		System.out.println("10.Cosine (cos)");
		System.out.println("11.Tanget (tan)");
		System.out.println("12.Exits");
	
		do {
			
			
		// Display the Results
			System.out.println();
			System.out.println("\nEnter your Operations choice(1-12):");
			int choice = scanner.nextInt();
			
// Declare the value of the variable 
			double number1 = 0 , number2 = 0, results = 0;	

			
//If the take the Switch case for the System
			switch(choice) {
			case 1: // Adding the value of the number
				System.out.print("Enter the number1:");
				 number1 = scanner.nextDouble();
				 System.out.print("Enter the number2:");
				 number2 = scanner.nextDouble();
				 results = number1 + number2;
				System.out.print("Results(Adding):" + results);
				break;
				
			case 2:// Subtraction the value of the number
				System.out.print("Enter the number1:");
				number1 = scanner.nextDouble();
				System.out.print("Enter the number2:");
				number2 = scanner.nextDouble();
				results = number1 - number2;
				System.out.print("Results (Subtraction):" + results);
				break;
				
			case 3:// Multiplication the value of the number
				System.out.print("Enter the number1:");
				number1 = scanner.nextDouble();
				System.out.print("Enter the number2:");
				number2 = scanner.nextDouble();
				results = number1 * number2;
				System.out.print("Results(Multiplications):" + results);
				
			case 4:// Devision the value of the number
				System.out.print("Enter the number1:");
				number1 = scanner.nextDouble();
				System.out.print("Enter the number2:");
				number2 = scanner.nextDouble();
				if(number2 != 0) {
					results = number1 / number2;
					System.out.print("Results(Devision):" + results);
				}else {
					System.out.print("Errore: Devision by zerco not allowed");
	
				}
				break;
				
			case 5:// Reminds the value of the number
				System.out.print("Enter the number1:");
				number1 = scanner.nextDouble();
				System.out.print("Enter the number2:");
				number2 = scanner.nextDouble();
				results = number1 % number2;
				System.out.print("Results(Reminds):" + results);
				break;
				
			
			case 6:// Power the value of the number
				System.out.print("Enter the number1:");
				number1 = scanner.nextDouble();
				System.out.print("Enter the number2:");
				number2 = scanner.nextDouble();
				results = Math.pow(number1  ,number2);
				System.out.print("Results(Power):" + results);
				break;
				
			case 7:// Square Root the value of the number
				System.out.print("Enter the number1:");
				number1 = scanner.nextDouble();
				if(number1>= 0) {
					System.out.print("Results(Square Root):" + results);
					
				}else {
					System.out.println("Errore: Invaild value please enter the vaild value");
				}
				break;
				
			case 8:// Logarithm (base 10) the value of the number
				System.out.print("Enter the number1:");
				number1 = scanner.nextDouble();
				if(number1 > 0) {
					results = Math.log10(number1);
					System.out.print("Results(Longrithm):" + results);
				}else {
					System.out.print("Errore: Invaild value please enter the valid number");
		      
				}
				break;
				
				
			case 9:// Sine the value of the number
				System.out.print("Enter the angle degree:");
				double degree = scanner.nextDouble();
				results = Math.sin(Math.toRadians(number1));
				System.out.print("Results(Sine):" + results);
				break;
				
			case 10:// Cosine the value of the number
				System.out.print("Enter the angel degree:");
				 degree = scanner.nextDouble();
				 results = Math.cos(Math.toRadians(number1));
				 System.out.print("Results(Cos):" + results);
				 break;
				 
			case 11:// Cosine the value of the number
				System.out.print("Enter the angel degree:");
				 degree = scanner.nextDouble();
				 results = Math.tan(Math.toRadians(number1));
				 System.out.print("Results(Tan):" + results);
				 break;
				 
			case 12:// code block for the exits the functions
				System.out.print("Exits the Calculate");
				contiuneCalculate = false;
				break;
				
				default:
					System.out.println("Invaild Choice please enter the vaild choice ");
					
				    continue;
			
			}
				
								
	}while(contiuneCalculate) ;
			
		 }
	  
	}                