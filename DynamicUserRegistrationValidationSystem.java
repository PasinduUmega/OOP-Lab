import java.util.Scanner;

class UserNameException extends Exception{
    public UserNameException(String message){
        super(message);
    }
}
class EmailException extends Exception{
    public EmailException(String message){
        super(message);
    }
}
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}
public class DynamicUserRegistrationValidationSystem {

    public static void  validateUsername(String userName) throws UserNameException{
      if(!userName.matches("[a-zA-Z0-9_]+")){
          throw new UserNameException("Invalid userName");
      }
    }
    public static void validateEmail(String email) throws EmailException{
        if(!email.contains("@")){
            throw  new EmailException("Invalid email");
        }
    }
    public static void validateAge(int age) throws AgeException{
        if(age<18 || age>100){
            throw new AgeException("Age must be between 18 and 100.");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter user name:");
            String userName = scanner.nextLine();
            validateUsername(userName);

            System.out.println("Enter email:");
            String email = scanner.nextLine();
            validateEmail(email);

            System.out.println("Enter age:");
            int age = scanner.nextInt();
            validateAge(age);

            System.out.println("Username: " + userName);
            System.out.println("Email: " + email);
            System.out.println("Age: " + age);

        }catch (UserNameException e){
            System.out.println("Error:" + e.getMessage());
        }catch (EmailException e){
            System.out.println("Error:" + e.getMessage());
        }catch (AgeException e){
            System.out.println("Error:" + e.getMessage()) ;
        }catch (Exception e){
            System.out.println("Unexpected Error: " + e.getMessage());
        }finally {

        }
    }
}
