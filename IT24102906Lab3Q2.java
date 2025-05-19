import java.util.Scanner;
class ProductApp{
    private int productId;
    private String productName;
    private double price;
    private int quantity;

// Constructor to initialized for the product app class
   public ProductApp(int productId,String productName,double price,int quantity){
       this.productId = productId;
       this.productName = productName;
       this.price = price;
       this.quantity = quantity;
   }

// Implement a method called display Details
    public void displayProductDetails(){
       System.out.println("Enter the Product Id:" + productId);
       System.out.println("Enter the Product Name:" + productName);
       System.out.println("Enter the price:" + price);
       System.out.println("Enter the Quantity:" + quantity);
    }

// Implement a method called calculateTotalValue
      public void calculateTotalValue(){
          double totalValue ;
          totalValue = price * quantity;
          System.out.println("Total value:" + totalValue);
      }
}
public class IT24102906Lab3Q2 {
  public static void main(String[] args){

// Create the scanner object to the read
   Scanner scanner = new Scanner(System.in);

// Take the user input
     System.out.print("Enter the Product Id:");
     int productId = scanner.nextInt();

     System.out.print("Enter the Product Name:");
     String productName = scanner.next();

     System.out.print("Enter the Price of the Product:");
     double price = scanner.nextDouble();

     System.out.print("Enter the Requirements of the Quantity:");
     int quantity = scanner.nextInt();

 // Create the Product app object to the read
     ProductApp product =  new ProductApp(productId,productName,price,quantity);

// Display the Details of the product app
    System.out.println("\nProduct Details");
    product.displayProductDetails();
    product.calculateTotalValue();
  }
}
