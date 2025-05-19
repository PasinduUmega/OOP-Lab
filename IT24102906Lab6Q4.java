class VehicleType{
    private String vehicleName;

   public VehicleType(String vehicleName){
       this.vehicleName = vehicleName;
   }
   public void displayVehicleDetails(){
       System.out.println("Vehicle Name:" + vehicleName);
   }
   public double calculateSpeed(){
       return 0.0;
   }
   public double calculateSpeed(double factor){
       return calculateSpeed() * factor;
   }
}
class Car extends VehicleType{
    private int engineCapacity;
    private double topSpeed;
    public Car(String vehicleName,int engineCapacity,double topSpeed){
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }
@Override
   public double calculateSpeed(){
        return topSpeed;
 }
@Override
 public void displayVehicleDetails(){
      super.displayVehicleDetails();
    System.out.println("Engine Capacity:" + engineCapacity+"CC");
    System.out.println("Top Speed:" + topSpeed+"kmh");
    System.out.println("Calculate Speed:" + calculateSpeed());
  }
}
class Bicycle extends  VehicleType{
    private int gearCount;
    private double maxPedalSpeed;
    public Bicycle(String vehicleName,int gearCount,double maxPedalSpeed){
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }
@Override
  public double calculateSpeed(){
      return maxPedalSpeed;
  }
@Override
   public void displayVehicleDetails(){
     super.displayVehicleDetails();
    System.out.println("Gear Count:" + gearCount);
    System.out.println("Max Pedal Speed:" + maxPedalSpeed+"kmh");
    System.out.println("Calculate Speed:" + calculateSpeed());
   }
}
public class IT24102906Lab6Q4 {
    public static void main(String[] args){

        System.out.println("---Car Details--");
     Car car = new Car("CHR",80,80);
     car.displayVehicleDetails();
        System.out.println("Speed:" + car.calculateSpeed(2));
        System.out.println();

        System.out.println("---Bicycle Details---");
     Bicycle bicycle = new Bicycle("Mountun Bike",5,80);
     bicycle.displayVehicleDetails();
     System.out.println("Speed:" + bicycle.calculateSpeed(1.5));

    }
}
