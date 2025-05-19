 class Paitns{
    private String paitnsID;
    private String paitnsName;
    private int days;

// constructor to initialization for the paitns class
   public Paitns(String paitnsID,String paitnsName,int days ){
       this.paitnsID = paitnsID;
       this.paitnsName = paitnsName;
       this.days = days;
   }
// create the getter methods to declare the days
   public int getDays(){
       return days;
   }
// create the methods for the calculate the total fee
  public double calculateTotalFee(){
       return calculateTotalFee();
  }
// create the methods for the display the paints details
  public void displayPaintsDetails(){
      System.out.println("Paitns ID:" + paitnsID);
      System.out.println("Paitns Name:" + paitnsName);
      System.out.println("Days:"+ days);
  }
}
class StarndWards extends Paitns{
    private boolean addTheAdditionAddEat;
    public StarndWards(String paitnsID,String paintsName,int days,boolean addTheAdditionAddEat){
        super(paitnsID,paintsName,days);
        this.addTheAdditionAddEat = addTheAdditionAddEat;
    }
@Override
  public double calculateTotalFee(){
     double totalFee = getDays() * 2500;
     double choice = addTheAdditionAddEat?1200:0;
     return totalFee+choice;
  }
  public double discount(){
        double discount = calculateTotalFee() * 0.2;
        discount = calculateTotalFee() - discount;
        return discount;
  }
@Override
  public void displayPaintsDetails(){
        super.displayPaintsDetails();
    System.out.println("Add the Bill Eat:" + (addTheAdditionAddEat?"yes":"no"));
    System.out.println("Total Bill:" + calculateTotalFee());
    System.out.println("Discount(20%):" + discount());
   }
}
class LuxuaryWrads extends Paitns{
    private boolean specialistDoctorPanel;
    public LuxuaryWrads(String paitnsID,String paitnsName,int days,boolean specialistDoctorPanel){
        super(paitnsID,paitnsName,days);
        this.specialistDoctorPanel = specialistDoctorPanel;
    }
 @Override
  public double calculateTotalFee(){
        double totalFee = getDays() * 5000;
        double choice = specialistDoctorPanel?2000:0;
        return totalFee + choice;
   }
  public double discount(){
        double discount = calculateTotalFee() * 0.2;
        discount = calculateTotalFee() - discount;
        return discount;
  }
 @Override
   public void displayPaintsDetails(){
     super.displayPaintsDetails();
     System.out.println("Special Doctor Panel:" + (specialistDoctorPanel? "yes":"no"));
     System.out.println("Total Fee:" + calculateTotalFee());
     System.out.println("Discount(40%):" + discount());
  }
}
public class HospitalApp {
    public static void main(String[] args){

        System.out.println("---Starnd Wards---");
        StarndWards starndWards = new StarndWards("SW 1010","Jonson",5,false);
        starndWards.displayPaintsDetails();
        System.out.println();
        System.out.println("---Luxuary Wards---");
        LuxuaryWrads luxuaryWrads = new LuxuaryWrads("LW2010","Michell",8,true);
        luxuaryWrads.displayPaintsDetails();
    }
}