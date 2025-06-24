interface Notifiable{
    void sendNotification(String message);

    String getDeliveryStatus();
}
class EmailNotification implements Notifiable{
    String emailAddress;
    boolean deliveryStatus;

    public EmailNotification(String emailAddress){
        this.emailAddress = emailAddress;
        this.deliveryStatus = false;

    }
    @Override
    public void sendNotification(String message){
        System.out.println("Send Notification: " +emailAddress +":" + message);
    }
    @Override
    public String getDeliveryStatus(){
        return deliveryStatus ? "Email delivered to " + emailAddress : "Email not delivered";
    }
}
class SMSNotification implements Notifiable{
    int phoneNumber;
    boolean deliveryStatus;

    public SMSNotification(int phoneNumber){
        this.phoneNumber = phoneNumber;
        this.deliveryStatus = false;
    }
    @Override
    public void sendNotification(String message){
        System.out.println("Send Notification: " + phoneNumber + ":" + message);
    }
    @Override
    public String getDeliveryStatus(){
        return deliveryStatus? "SMS delivered to " + phoneNumber : "SMS not delivered";
    }
}
public class NotificationSystem {
    public static void main(String[] args){

        Notifiable[] notifications = new Notifiable[]{
                new EmailNotification("alice@example.com"),
                new SMSNotification(1234567890),

        };
        for (Notifiable notifiable: notifications){
            notifiable.sendNotification("This is your notification.");
        }
        for (Notifiable notifiable: notifications){
            System.out.println(notifiable.getDeliveryStatus());
        }
    }
}
