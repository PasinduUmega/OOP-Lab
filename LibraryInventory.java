import java.util.Scanner;
import java.util.ArrayList;

class Book {
    int isbn;
    String title;

    public Book(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + isbn + ", Title: " + title);
    }
}

public class LibraryInventory {
    public static void main(String[] args) {
        ArrayList<Book> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Book ISBN (-99 to stop): ");
            int isbn = scanner.nextInt();
            if (isbn == -99) {
                break;
            }

            scanner.nextLine();
            System.out.print("Enter the Book Title: ");
            String title = scanner.nextLine();

            Book book = new Book(isbn, title);
            inventory.add(book);
        }

        System.out.print("\nEnter the ISBN of the book to remove: ");
        int removeIsbn = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getIsbn() == removeIsbn) {
                inventory.remove(i);
                found = true;
                System.out.println("Book removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }


        // Display results
        System.out.println("\nTotal number of books: " + inventory.size());
        System.out.println("Book Details:");
        for (Book b : inventory) {
            System.out.println("ISBN:" +b.getIsbn() + ","+"Title:" + b.title);
        }

    }
}
