class Calculate{
// Methods to create the function for the adding
  public int add(int a,int b){
      return  a +b;
  }

// Methods to create the multiple function
  public int multiple(int a, int b) {
   return a*b;
  }

// Methods to create the square function
   public int square(int a){
      return a * a;
   }
}

public class IT24102906Lab1Q5 {
    public static void main(String[] args){

// create the object called for the calculate
   Calculate calculate = new Calculate();

// Calculate the results1 for the (3*4+5*7)^2
// Methods to create the multiple , add and square
        int result1 = calculate.multiple(3, 4);    // 3 * 4
        int result2 = calculate.multiple(5, 7);    // 5 * 7
        int sum = calculate.add(result1, result2); // 3 * 4 + 5 *
        int finalResult1 = calculate.square(sum);  // (3 * 4 + 5 * 7) ^ 2

// Calculate the results2 for the (4+7)^2 +(8+3)^2
        int sum1 = calculate.add(4, 7);// 4 + 7
        int square1 = calculate.square(sum1); // (4+7)^2
        int sum2 = calculate.add(8,7);// (8+7)
        int square2 = calculate.square(sum2); // (8+3)^2
        int finalResult2 = calculate.add(square1, square2); // (4 + 7) ^ 2 + (8 + 3) ^ 2

// Display the results
     System.out.println("Results of(3*4+5*7)^2:" + finalResult1);
     System.out.println("Results Of(4+7)^2 +(8+3)^2:" + finalResult2);
    }
}
