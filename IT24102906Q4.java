import java.util.Scanner;
public class IT24102906Q4 {
    public static void main(String[] args){

 // Create the object to the read scanner
  Scanner scanner = new Scanner(System.in);

// Enter the integer number of the seconds
  System.out.print("Enter the Seconds:");
  int totalSeconds = scanner.nextInt();

// then convert the seconds for the hours
        int hours = totalSeconds / 3600; // in one hours to convert the seconds
//  then renaming the seconds for the minutes
        int remainingSeconds = totalSeconds % 3600;    //  renaming of the hours convert the seconds

// then convert the seconds for the minutes
        int minutes = totalSeconds / 60; // in one minutes convert the seconds
// then renaming the seconds for the minutes
         remainingSeconds = totalSeconds % 60;  // renaming of the minutes convert the seconds

// Display the results
        System.out.println(totalSeconds + " seconds is equivalent to:");
        System.out.println(hours + " hours, " + minutes + " minutes, and " + remainingSeconds + " seconds.");









    }
}
