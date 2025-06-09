public class Demo {
    public static void main(String[] args){

  // To Initialized for the array elements to declare
        int[] a = {4,2,3,2,4,1,5};

  // To access the elements
     for(int i = 0; i<a.length; i++){
         for(int j = i+1; j<a.length; j++){
             if(a[i] == a[j]){
                 System.out.println(a[i]);
             }
         }
     }

    }
}
