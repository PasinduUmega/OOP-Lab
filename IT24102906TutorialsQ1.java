class SmartPhone{
    private String brandName;
  public SmartPhone(String brandName){
      this.brandName = brandName;
  }
  void displaySmartPhoneDetails(){
      System.out.println("Smart Phone Brand: " + brandName);
  }
}
class Battery extends SmartPhone{
    private int capacity;
    public Battery(String brandName,int capacity){
        super(brandName);
        this.capacity = capacity;
    }
  @Override
    void displaySmartPhoneDetails(){
        super.displaySmartPhoneDetails();
      System.out.println("Battery Capacity: " + capacity+"mAh");
  }
}
class Processor extends SmartPhone{
    private String model;
    public Processor(String brandName,String model){
        super(brandName);
        this.model = model;
    }
 @Override
  void displaySmartPhoneDetails(){
     System.out.println("Processor Model: " + model + 888);
   }
}
public class IT24102906TutorialsQ1 {
    public static void main(String[] args){


     Battery battery = new Battery("Samsung Galaxy",5000);
     battery.displaySmartPhoneDetails();
     Processor processor = new Processor("Samsung Galaxy","Snapdragon");
     processor.displaySmartPhoneDetails();
    }
}
