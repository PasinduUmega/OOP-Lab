class BrandCar{
    private String regNumber;
    private String modelName;
    private double price;

// create the constructor to initialized for the brand car class
   public BrandCar(String regNumber,String modelName,double price){
       this.regNumber = regNumber;
       this.modelName = modelName;
       this.price = price;
   }
// create the methods for the get the price
 public double getPrice(){
        return price;
   }
// create the methods for the display the car details
   public void displayCarDetails(){
       System.out.println("Registration Number:" + regNumber);
       System.out.println("Model Name:" + modelName);
       System.out.println("Price:" + price);
   }
// create the methods for the total price
   public double totalPrice(){
       double totalFee = price * 0.0;
       return totalFee;
   }
}
// inherits the subclass(BMW) of the brand car class
class BMW extends BrandCar{
    private boolean additionalParts;
    public BMW(String regNumber,String modelName,double price, boolean additionalParts){
        super(regNumber,modelName,price);
        this.additionalParts = additionalParts;
    }

// calculate the total price
@Override
   public double totalPrice(){
        double tax = getPrice() * 0.5;
        double totalFee = tax + getPrice();
        double choice = additionalParts? 80000:0;
        return  totalFee + choice;
   }

// create the methods for the display the car details
@Override
   public void displayCarDetails(){
       super.displayCarDetails();
       System.out.println("Add the Additional Parts:"+(additionalParts?"Yes":"No"));
       System.out.println("Total Price:" + totalPrice());
   }
}
// inherits subclass(Aquare) of the brand class
class Aquare extends BrandCar{
    private boolean freePetrol;
    public Aquare(String regNumber,String modelName,double price,boolean freePetrol){
        super(regNumber,modelName,price);
        this.freePetrol = freePetrol;
    }
// calculate total price
@Override
  public double totalPrice(){
        double tax = getPrice() * 0.3;
        double totalFee = getPrice() + tax;
        double choice = freePetrol? 20000:0;
        return totalFee + choice;
  }

// create the methods for the display car details
   public void displayCarDetails(){
        super.displayCarDetails();
       System.out.println("Add the Free Condition:" + (freePetrol?"Yes":"No"));
       System.out.println("Total Fee:"+ totalPrice());
   }
}
public class IT24102906TutorialsQ3 {
    public static void main(String[] args){

// create the bmw car object
        System.out.println("--BMW Car--");
   BMW bmw = new BMW("Bm1010","I7",1800000,true);
   bmw.displayCarDetails();

        System.out.println();

        System.out.println("--Aquare Car--");
   Aquare aquare = new Aquare("Aq 101","white",125000,false);
   aquare.displayCarDetails();
    }
}
