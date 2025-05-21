import java.util.Scanner;
class PizzaOrder {
    String orderID;
    String customerName;
    String size;
    int toppingCount;
    boolean delivery;

    private static final double Small_Price = 8.0;
    private static final double Medium_Price = 10.0;
    private static final double Large_Price = 12.0;
    private static final double Topping_Price = 1.50;
    private static final double Delivery_Price = 5.0;

    public PizzaOrder() {
        this.orderID = "N/A";
        this.customerName = "Unknown";
        this.size = "Small";
        this.toppingCount = 0;
        this.delivery = false;
    }

    public PizzaOrder(String orderID, String customerName) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.size = "Small";
        this.toppingCount = 0;
        this.delivery = false;
    }

    public PizzaOrder(String orderID, String customerName, String size, int toppingCount, boolean delivery) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.size = size;
        this.toppingCount = toppingCount;
        this.delivery = delivery;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size) {
        if (size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium") || size.equalsIgnoreCase("Large")) {
            this.size = size.substring(0, 1).toUpperCase() + size.substring(1).toLowerCase();
        } else {
            this.size = "Small";
        }
    }
    public double getBasePrice(){
        switch (size){
            case "Small":
                return Small_Price;
            case "Medium":
                return Medium_Price;
            case "Large":
                return Large_Price;
            default:
                return  Small_Price;
        }
    }
    public double calculateTotalPrice() {
        double totalPrice = getBasePrice() + (toppingCount * Topping_Price);
        if (delivery) {
            totalPrice += Delivery_Price;
        }
        return totalPrice;
    }
    public double discountPercentage(double discountPercntage){
        double total = calculateTotalPrice();
        double discount = total *(discountPercntage/100);
        return discount;
    }
    public int preparationTimeEstimator(){
        return 15 + (2* toppingCount);
    }
    public void displayOrderDetails(){
        System.out.println("Order ID:" + orderID);
        System.out.println("Customer Name:" + customerName);
        System.out.println("Size:" + size);
        System.out.println("Topping Count:" + toppingCount);
        System.out.println("Delivery:" + (delivery? "Yes":"No"));
        System.out.println("Total Price:" + calculateTotalPrice());
        System.out.println("Preparation Time:" + preparationTimeEstimator());
        System.out.println("-------------------------------");

    }
}
public class IT24102906Lab5aQ1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       PizzaOrder order1 = new PizzaOrder("O3001","Olivia Green","Medium",3,true);
       order1.displayOrderDetails();
        System.out.println();
      PizzaOrder order2 = new PizzaOrder("O3002","Noah Smith","Large",2,false);
      order2.displayOrderDetails();
        System.out.println("Enter the discount percentage:");
        double percentage = scanner.nextDouble();
        System.out.println("Order 2 - price after the discount :" + order2.discountPercentage(percentage));
        System.out.println();

        PizzaOrder order3  = new PizzaOrder();
        order3.displayOrderDetails();
    }
}
