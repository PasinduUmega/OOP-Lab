class Meal{
    private String orderID;
    private String customerName;
    private int quantity;

 // constructor to initialization for the meal class
    public Meal(String orderID,String customerName,int quantity){
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }
// create the methods for the getter of quantity
  public int getQuantity(){
        return quantity;
  }
// create the methods for the display order details
   public void displayOrderDetails(){
       System.out.println("Order ID:" + orderID);
       System.out.println("Customer Name:" + customerName);
       System.out.println("Quantity:" + quantity);
   }
// create the methods for the calculate bill
 public double calculateBill(){
        double totalFee = 12 * quantity;
        return calculateBill();
  }
}
class RegularMeal extends Meal{
    private boolean vegerarian;
    public RegularMeal(String orderID,String customerName,int quantity,boolean vegerarian){
        super(orderID,customerName,quantity);
        this.vegerarian = vegerarian;
    }
@Override
  public double calculateBill(){
   double totalFee = getQuantity() * 10;
   return totalFee;
  }
  public double discount(){
        double discount = calculateBill() * 0.02;
        discount = calculateBill() - discount;
        return discount;
  }
@Override
  public void displayOrderDetails(){
   super.displayOrderDetails();
    System.out.println("Meal Type:" + (vegerarian?"Veg":"No-Veg"));
    System.out.println("Total Bill:" + calculateBill());
    System.out.println("Bill with(2%) coupon:" + discount());
  }
}
class ComboMeal extends Meal{
    private boolean includesDrinkAndDessert;
    public ComboMeal(String orderID, String customerName,int quantity,boolean includesDrinkAndDessert){
        super(orderID,customerName,quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }
@Override
public double calculateBill(){
       double totalFee = getQuantity() * 15;
       double choice = includesDrinkAndDessert? 5:0;
       return totalFee + choice;
  }
  public double discount(){
        double discount = calculateBill() * 0.03;
        discount = calculateBill() - discount;
        return discount;
  }
@Override
  public void displayOrderDetails(){
      super.displayOrderDetails();
    System.out.println("Includes Drink & Dessert:"+ (includesDrinkAndDessert?"yes":"no"));
    System.out.println("Total Fee:" + calculateBill());
    System.out.println("Bill withs (3%):" + discount());
  }
}
public class IT24102906Lab7Q2 {
    public static void main(String[] args){
        System.out.println("---Regular Meal---");
        RegularMeal regularMeal = new RegularMeal("000","Guest",0,true);
        regularMeal.displayOrderDetails();
        System.out.println();

        System.out.println("---Combo Meal---");
        ComboMeal comboMeal = new ComboMeal("C102","Alice Green",2,true);
        comboMeal.displayOrderDetails();
    }
}