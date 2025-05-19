import java.util.Scanner;
public class IT24102906TUQ1 {
    public static void main(String[] args){

// to initialized for the array elements
  int[] myArray = new int[5];
  int[] evenArray = new int[5];
  int evenCount = 0;

// Create the scanner object to the read
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the 5 Number:");

// To declare the array
   for(int i = 0; i<5; i++){
       myArray[i] = scanner.nextInt();

   }
        System.out.println();

// reverse order into the my array
for(int i = 4; i>=0; i--){
    System.out.println(myArray[i]);

}

// create the another array called by the even array
  for(int i = 0; i<5; i++){
      if(myArray[i] %2 == 0){
        evenArray[evenCount] = myArray[i];
        evenCount++;
      }
  }

// print the even number
   System.out.print("Even Numbers:");
    for(int i = 0; i<evenCount; i++){
        System.out.println(evenArray[i]);
    }



    }
}
