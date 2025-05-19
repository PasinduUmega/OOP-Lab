class ProductP{
     int productID;
     String productName;
     double price;

  public ProductP(int productID,String productName,double price){
      this.productID = productID;
      this.productName =productName;
      this.price = price;
  }
  public int getProductID(){
      return productID;
  }

  public void setProductID(int productID){
      this.productID = productID;
  }

  public void displayDetails(){
      System.out.println("Product ID:" + productID);
      System.out.println("Product Name:" + productName);
      System.out.println("Price:"+ price);
  }
}
class Electronics extends ProductP{
    private String brand;
    private  String model;
    public Electronics(int productID, String productName,double price, String brand,String model){
    super(productID,productName,price);
    this.brand = brand;
    this.model = model;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" Brand:" + brand);
        System.out.println("Model:" + model);
    }
}
class Clothing extends ProductP{
    private String size;
    private  String color;
    public Clothing(int productID,String productName,double price,String size,String color){
        super(productID,productName,price);
        this.size = size;
        this.color = color;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size:" + size);
        System.out.println("Color:" + color);
    }
}
public class OOPTest4 {
    public static void main(String[] args){

        Electronics electronics = new Electronics(120,"LapTop",120000,"Dell","I7");
        Clothing clothing = new Clothing(111,"T Shirt",1200,"Medium","Red");

        System.out.println("\n Electronics Details");
        electronics.displayDetails();
        System.out.println();

        System.out.println("\n Clothing Details");
        clothing.displayDetails();

    }
}
