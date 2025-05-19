public class TwoDArray3 {
    public static void main(String[] args){

 // To initialized for the Array elements
 int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

 // To Access for the elements
        for(int row = 0; row< arr.length; row++){
            for(int column = 0; column<arr[0].length;column++){
                if (arr[row][column]%2==0) {
                    System.out.print(arr[row][column] + " ");

                }else{
                    System.out.print("\t ");
                }

            }

        }

    }
}
