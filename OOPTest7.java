import java.util.Scanner;
class MathOperations{

    public void drawMultiplicationTable(int number, int range){
        System.out.println("Multiplication Table For" + number + "Up To" + range+ ":");
        for(int x= 1; x<=range;x++){
            System.out.println(number + "x" + x + "=" +(number * x));
        }
    }
    public int factorial(){
        System.out.println("Enter the Positive Integer:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int results = 1;
        for (int x =1; x<=n; x++){
            results *=x;
        }
        return results;
    }
}
public class OOPTest7 {
    public static void main(String[] args){

        MathOperations mop = new MathOperations();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = scanner.nextInt();

        System.out.print("Enter the Range of the number:");
        int range = scanner.nextInt();

        mop.drawMultiplicationTable(num,range);
        int factorials = mop.factorial();
        System.out.println("The Factorial is:" + factorials);
    }
}
