class Shape {
    private String shapeName;

    // constructor to initialized for the shape class
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // display the shape details
    public void displayShapeDetails() {
        System.out.println("Shape Name:" + shapeName);
    }

   // Create the methods override calculate area
     public double calculateArea(){
        return 0.0;
     }

   // overloaded methods calculate area
     public double calculateArea(double factor){
        return calculateArea() * factor;
     }
}

// create the a subclass called rectangle
   class Rectangle extends Shape{
    double length, width;
    public Rectangle(String shapeName, double length,double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

   public double calculateArea(){
        return length * width;
 }

 @Override
    public void displayShapeDetails(){
        System.out.println("Calculate the Rectangle:" + calculateArea());
    }
}


class Triangle extends Shape{
 double base, height;
    public Triangle(String shapeName, double base , double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }

  public double calculateArea(){
        return (base * height) / 2;
  }

    public void displayTriangleDetails(){
        System.out.println("Calculate the Triangle:" + calculateArea());
  }
}

public class IT24102906Lab6Q3 {
    public static void main(String[] args){

  //  Create the object
     Rectangle rectangle =  new Rectangle("Rectangle",10,20);
     Triangle triangle = new Triangle("Triangle",10,20);

  // display the results
    System.out.println("Rectangle :");
    rectangle.displayShapeDetails();
    rectangle.calculateArea();
    System.out.println();

    System.out.println("Triangle :");
    triangle.displayTriangleDetails();
    triangle.calculateArea();
    }
}
