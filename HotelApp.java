class Room{
    private int customerID;
    private String customerName;
    private int numberOfDays;

// constructor to initialized for the room class
   public Room(int customerID,String customerName,int numberOfDays){
       this.customerID = customerID;
       this.customerName = customerName;
       this.numberOfDays = numberOfDays;
   }
// create the methods for the get the number of days
   public int getNumberOfDays(){
       return numberOfDays;
   }
// create the methods for the calculate total fee
   public double calculateRoomCost(){
       return numberOfDays * 150;
   }
// create the methods for the display room details
   public void displayRoomDetails(){
       System.out.println("Customer ID:" + customerID);
       System.out.println("Customer Name:" + customerName);
       System.out.println("Number of days:" + numberOfDays);
   }
}
class StrandRoom extends Room{
    private boolean WiFi;
    public StrandRoom(int customerID,String customerName,int numberOfDays,boolean WiFi ){
        super(customerID,customerName,numberOfDays);
        this.WiFi = WiFi;
    }
  @Override
    public double calculateRoomCost(){
        double totalFee = getNumberOfDays() * 100;
        String choice = WiFi? "Yes":"No";
        return totalFee ;
  }
  public double discount(){
        double discount = calculateRoomCost() * 0.1;
        discount = calculateRoomCost() - discount;
        return discount;
   }
   @Override
     public void displayRoomDetails(){
        super.displayRoomDetails();
       System.out.println("Including WiFi:" + (WiFi?"yes":"no"));
       System.out.println("Total Cost:" + calculateRoomCost());
       System.out.println("Discounted(10%):" + discount());
   }
}
class LuxuaryRoom extends Room{
    private boolean  breakfastAndAirportPickup;
    public LuxuaryRoom(int customerID,String customerName,int numberOfDays,boolean breakfastAndAirportPickup){
        super(customerID,customerName,numberOfDays);
        this.breakfastAndAirportPickup = breakfastAndAirportPickup;
    }
 @Override
   public double calculateRoomCost(){
     double totalFee = 200 * getNumberOfDays();
     double choice  = breakfastAndAirportPickup? 75:0;
     return totalFee + choice;
  }
  public double discount(){
        double discount = calculateRoomCost() * 0.15;
        discount = calculateRoomCost() - discount;
        return discount;
  }
  @Override
    public void displayRoomDetails(){
        super.displayRoomDetails();
      System.out.println("Breakfast And Airport Pickup:" + (breakfastAndAirportPickup?"Yes":"No"));
      System.out.println("Total Fee:" + calculateRoomCost());
      System.out.println("Discounted(20%):" + discount());
  }
}
public class HotelApp {
    public static void main(String[] args){

        System.out.println("---Strand Room---");
      StrandRoom strandRoom = new StrandRoom(000,"UnKnow",0,false);
      strandRoom.displayRoomDetails();

        System.out.println();

        System.out.println("---Luxuary Room---");
        LuxuaryRoom luxuaryRoom = new LuxuaryRoom(305,"Alice Green",3,true);
        luxuaryRoom.displayRoomDetails();
    }
}