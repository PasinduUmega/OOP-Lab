public class TwoDArray2 {
    public static void main(String[] args){
       int[][] numbers = {{2,4,6},{8,10,12},{14,16,18},
                          {28,22,24},{26,28,30},{32,34,36}};

   // To Access the initialized for the elements
   for(int rows=0; rows<numbers.length;rows++){
       for(int column = 0; column < 3; column++){

           System.out.println(numbers[rows][column]+"");
       }
       System.out.println();
     }
    }
}
