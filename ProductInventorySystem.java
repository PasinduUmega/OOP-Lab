class Product{
    int productID;
    String productName;
    String categoryType;
    static int totalProductCount;
    static String warehouseLocation;

    public Product(int productID,String productName,String categoryType){
        totalProductCount++;
        this.productID = totalProductCount;
        this.productName = productName;
        this.categoryType = categoryType;

    }
    static {
        totalProductCount = 500;
        warehouseLocation = "Main Warehouse";
    }
public void displayInventory(){
    System.out.println("Product ID: " + productID);
    System.out.println("Product Name: " + productName);
    System.out.println("Category Type: " + categoryType);
    System.out.println("Total Product Count: " + totalProductCount);
    System.out.println("Warehouse Location: " + warehouseLocation);
    System.out.println();
  }
  public static void updateWarehouseLocation(String newLocation){
     warehouseLocation = newLocation;
  }
}
public class ProductInventorySystem {
    public static void main(String[] args) {

        // Product 1
        Product p1 = new Product(1010,"Laptop","Electricity");
        p1.displayInventory();



        // Product 2
        Product p2 = new Product(1011,"Office Chair", "Furniture");
        p2.displayInventory();


        // Change warehouse location
        Product.updateWarehouseLocation("Secondary Warehouse");

        // Product 3
        Product p3 = new Product(1012,"Whiteboard", "Stationery");
        p3.displayInventory();

        // Product 4
        Product p4 = new Product(1013,"Projector", "Electronics");
        p4.displayInventory();
    }
}

