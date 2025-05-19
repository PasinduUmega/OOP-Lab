import java.util.Scanner;

class OnlineBookingSystem{
    private String customerBookingID;
    private String customerName;
    private int seat;

// Constructor to initialization for the booking class
   public OnlineBookingSystem(String customerBookingID,String customerName,int seat){
       this.customerBookingID = customerBookingID;
       this.customerName = customerName;
       this.seat = seat;
   }
   public int getSeat(){
       return seat;
   }
//  create the methods for the display online booking
    public void displayOnlineBookingSystem(){
        System.out.println("Customer Booking ID:" + customerBookingID);
        System.out.println("Customer Name:" + customerName);
        System.out.println("How many booking of the seat:" + seat);
    }
}
class  BusSeatBooking extends OnlineBookingSystem{
    private boolean comparatbleSeat;
    public BusSeatBooking(String customerBookingID,String customerName,int seat,boolean comparatbleSeat){
        super(customerBookingID,customerName,seat);
        this.comparatbleSeat = comparatbleSeat;
    }
  public double calculateTotalFee(){
        double totalFee =  getSeat() * 3500;
        double choice = comparatbleSeat? 5500:0;
        return totalFee + choice;
  }
  public double discount(){
      double discount  = calculateTotalFee() * 0.2;
      discount = calculateTotalFee() - discount;
      return discount;
  }

  @Override
    public void displayOnlineBookingSystem(){
        super.displayOnlineBookingSystem();
      System.out.println("Seat Avaible :"+(comparatbleSeat?"yes":"no"));
      System.out.println("Total Fee:" + calculateTotalFee());
      System.out.println("Discount(20%):" + discount());
  }
}
class Trian extends OnlineBookingSystem{
    private boolean firstClassSeat;
    public Trian(String customerBookingID, String customerName,int seat,boolean firstClassSeat){
        super(customerBookingID,customerName,seat);
        this.firstClassSeat = firstClassSeat;
    }
  public double calculateTotalFee(){
        double totalFee = getSeat() * 2000;
        double choice = firstClassSeat? 4500:0;
        return totalFee + choice;
  }
 public double discount(){
        double discount = calculateTotalFee() * 0.1;
        discount = calculateTotalFee() - discount;
        return discount;
   }
   @Override
     public void displayOnlineBookingSystem(){
        super.displayOnlineBookingSystem();
       System.out.println("First class seat:" + (firstClassSeat? "yes":"no"));
       System.out.println("Total Fee:" + calculateTotalFee());
       System.out.println("Discount(10%):" + discount());
   }
}
public class SeatBooking {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer Booking  ID:" );
        String customerBookingID = scanner.nextLine();

        System.out.print("Customer Name:");
        String customerName = scanner.nextLine();

        System.out.print("How many booking for the seat number:");
        int seat = scanner.nextInt();

        System.out.println();
        System.out.println("--Bus System--");
        BusSeatBooking busSeatBooking = new BusSeatBooking(customerBookingID,customerName,seat,false);
        busSeatBooking.displayOnlineBookingSystem();
        System.out.println();

        System.out.println("--Train System--");
        Trian trian = new Trian(customerBookingID,customerName,seat,true);
        trian.displayOnlineBookingSystem();
    }
}
