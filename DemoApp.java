import java.util.Scanner;
class InvalidUserNameException extends Exception{
   public InvalidUserNameException(String message){
       super(message);
   }
}
class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super(message);
    }
}
public class DemoApp {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    try{
        System.out.println("Enter a user name:");
        String userName = scanner.nextLine();

        if(userName.length()< 6 ){
            throw new InvalidUserNameException("Username must be at least 6 characters long.");

        }

        System.out.println("Enter a user password:");
        String password = scanner.nextLine();

        if(password.length() < 8){
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }
     }catch (InvalidUserNameException e){
        System.out.println("Error:" + e.getMessage());

     }catch (InvalidPasswordException e){
        System.out.println("Error:" + e.getMessage());
      }
    }
}
