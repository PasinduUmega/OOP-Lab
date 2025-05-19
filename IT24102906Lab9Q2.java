interface Printable {
    void printDetails();
}
class Report implements Printable {
    private String title;
    private String author;

    public Report(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //  Implement printDetails
    @Override
    public void printDetails() {
        System.out.println("=== Report ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class Invoice implements Printable {
    private String invoiceId;
    private double amount;

    public Invoice(String invoiceId, double amount) {
        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    //  Implement printDetails
    @Override
    public void printDetails() {
        System.out.println("=== Invoice ===");
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Amount: " + amount);
    }
}
public class IT24102906Lab9Q2 {
    public static void main(String[] args) {
        // Create objects
        Printable[] items = new Printable[4];

        items[0] = new Report("Annual Report", "John Doe");
        items[1] = new Report("Sales Report", "Jane Smith");
        items[2] = new Invoice("INV001", 1500.00);
        items[3] = new Invoice("INV002", 3200.50);

        // Loop to print details
        for (Printable item : items) {
            item.printDetails();
            System.out.println(); // For better spacing
        }
    }
}
