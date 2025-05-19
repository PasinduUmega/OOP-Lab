class Membership {
    private String membershipID;
    private String membershipName;
    protected int durationMonths;  //  Changed to protected so child classes can access it

    // Constructor
    public Membership(String membershipID, String membershipName, int durationMonths) {
        this.membershipID = membershipID;
        this.membershipName = membershipName;
        this.durationMonths = durationMonths;
    }
   // create the methods access the duration months
      public int getDurationMonths(){
        return durationMonths;
      }

    // Display details
    public void displayMemberDetails() {
        System.out.println("Membership ID: " + membershipID);
        System.out.println("Membership Name: " + membershipName);
        System.out.println("Duration Months: " + durationMonths);
    }
}

// Child Class: BasicMembership
class BasicMembership extends Membership {
    private boolean hasGymAccess;

    public BasicMembership(String membershipID, String membershipName, int durationMonths, boolean hasGymAccess) {
        super(membershipID, membershipName, durationMonths);
        this.hasGymAccess = hasGymAccess;
    }

    // Fixed totalFee method
    public double totalFee() {
        return (200 * getDurationMonths());  // Now it correctly uses the durationMonths from Membership
    }

    @Override
    public void displayMemberDetails() {
        super.displayMemberDetails();
        System.out.println("Has Gym Access: " + (hasGymAccess ? "True" : "False"));
        System.out.println("Total Fee: " + totalFee());
    }
}

// Child Class: PremiumMembership
class PremiumMembership extends Membership {
    private boolean includePersonalTraining;

    public PremiumMembership(String membershipID, String membershipName, int durationMonths, boolean includePersonalTraining) {
        super(membershipID, membershipName, durationMonths);
        this.includePersonalTraining = includePersonalTraining;
    }

    public double totalFee() {
        return (300 * getDurationMonths()) + (includePersonalTraining ? 100 : 0);
    }

    @Override
    public void displayMemberDetails() {
        super.displayMemberDetails();
        System.out.println("Include Personal Training: " + (includePersonalTraining ? "True" : "False"));
        System.out.println("Total Fee: " + totalFee());
    }
}


public class IT24102906Lab6Q2 {
    public static void main(String[] args) {
        BasicMembership basicMembership = new BasicMembership("N/A", "N/A", 0, false);
        PremiumMembership premiumMembership = new PremiumMembership("PM202", "John Smith", 6, true);

        System.out.println("Basic Membership:");
        basicMembership.displayMemberDetails();
        System.out.println();

        System.out.println("Premium Membership:");
        premiumMembership.displayMemberDetails();
        System.out.println();
    }
}
