import java.util.Scanner;
class Circle{
    private double radius;

   public Circle(double radius){
       this.radius = radius;
   }
 public double calculateArea(){
       double area = 22/7 * radius * radius;
       return  area;
  }
 public double calculateDiameter(){
       double diameter = 2*radius;
       return diameter;
  }
  public void displayCircleDetails(){
      System.out.println("Area :" + calculateArea());
      System.out.println("Diameter :"+ calculateDiameter());
  }
}

public class IT24102906TutorialsQ2 {
    public static void  main(String[] args){

    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius = scanner.nextDouble();

   Circle circle = new Circle(radius);
   circle.displayCircleDetails();
    }
}
