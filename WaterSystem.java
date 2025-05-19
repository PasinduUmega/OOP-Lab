import java.util.Scanner;

class Water{
    private String customerAccountNumber;
    private String customerName;
    private double casumedUnits;

// constructor to initialization for the water class
  public Water(String customerAccountNumber,String customerName,double casumedUnits){
      this.customerAccountNumber = customerAccountNumber;
      this.customerName = customerName;
      this.casumedUnits = casumedUnits;
  }
  public double calculateWaterBill(){
      double price = 0.0;
      if(casumedUnits<=100){
          return price = 20* casumedUnits;
      } else if (casumedUnits>= 300) {
          return  price = 50 * casumedUnits;
      }else
         return price = 100 * casumedUnits;
  }
    void displayWaterSystemDetails(){
        System.out.println("Customer Account Number:" + customerAccountNumber);
        System.out.println("Customer Name:" + customerName);
        System.out.println("Casumed Units:" + casumedUnits);
        System.out.println("Bill Amounts:" + calculateWaterBill());
    }
}
public class WaterSystem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer Account Number:" );
        String customerAccountNumber = scanner.nextLine();

        System.out.print("Customer Name:");
        String customerName = scanner.nextLine();

        System.out.print("Casumed Units:");
        double casumedUnits = scanner.nextDouble();
        System.out.println();

        Water water = new Water(customerAccountNumber,customerName,casumedUnits);
        water.displayWaterSystemDetails();
    }
}
