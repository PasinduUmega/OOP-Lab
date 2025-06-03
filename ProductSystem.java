import java.util.Scanner;

class DiscountValidationException extends Exception{
    public DiscountValidationException(String message){
        super(message);
    }
}
class Product{
    String name;
    double price;
    double discountPercentage;

    public Product(String name, double price,double discountPercentage){
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }
    public double DiscountPercentage(){
        return (price*discountPercentage)/100;
    }
}
public class ProductSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the Product Name:");
            String name = scanner.nextLine();

            System.out.print("Enter the Product Price:");
            double price = scanner.nextDouble();

            System.out.print("Enter the Discount Percentage:");
            double discountPercentage = scanner.nextDouble();

            if(discountPercentage >50){
                throw new DiscountValidationException("Discount cannot exceed 50%");
            }

            Product product = new Product(name,price,discountPercentage);
            double discountAmount = product.DiscountPercentage();
            double discountAfterTheAmount = product.price - product.discountPercentage;
            System.out.println("Discount Amount:" + discountAmount);
            System.out.println("Discount after the amount :" + discountAfterTheAmount);
        }catch (DiscountValidationException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
