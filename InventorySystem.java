class Device{
    String deviceID;
    String deviceType;
    static int deviceCount;
    // create the static block variable
     static {
         deviceCount = 100;
    }
    public Device(String deviceId, String deviceType) {
        this.deviceID = deviceId;
        this.deviceType = deviceType;
        deviceCount++;
    }

    public void displayDeviceInfo() {
        System.out.println("Device ID: " + deviceID);
        System.out.println("Device Type: " + deviceType);
    }

    public static void displayDeviceCount() {
        System.out.println("Total Devices: " + deviceCount);
        System.out.println();
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Device d1 = new Device("D001", "Laptop");
        Device d2 = new Device("D002", "Tablet");
        Device d3 = new Device("D003", "Smartphone");

        d1.displayDeviceInfo();
        d2.displayDeviceInfo();
        d3.displayDeviceInfo();

        // Display current count
        Device.displayDeviceCount();
    }
}
