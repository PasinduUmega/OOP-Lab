import java.util.Scanner;
public class IT24102906TUQ2 {
    public static void main(String[] args){
// To Initialized the elements for the array
  int[] A = {10,20,30,40,50};
  int[] B = {34,67,12,89,12};
  int[] C = new int[5];

// Calculate the A and B
    for(int i = 0; i<5; i++){
        C[i] = A[1] + B[i];
      }
// Display the value
   System.out.println("Sum of A and B stored in C:");
    for (int i = 0; i < 5; i++) {
            System.out.println(C[i] + "\t\t");
        }
    }
}
