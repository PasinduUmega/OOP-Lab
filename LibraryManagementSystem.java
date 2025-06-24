class Book{
    String bookID;
    String bookTitle;
    String authorName;
    static String libraryName;
    static int totalBooksCount = 0;

    public Book(String bookID,String bookTitle,String authorName){
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        totalBooksCount ++;
    }
    public void displayBookInfo(){
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Library Name: " + libraryName);
        System.out.println("Total Book  count: " + totalBooksCount);
        System.out.println();

    }
}
public class LibraryManagementSystem {
    public static void main(String[] args){

       Book.libraryName = "City Library";
        Book book1 = new Book("101", "The Alchemist", "Paulo Coelho");
        Book book2 = new Book("102", "1984", "George Orwell");
        Book book3 = new Book("103", "To Kill a Mockingbird", "Harper Lee");
        Book book4 = new Book("104", "The Hobbit", "J.R.R. Tolkien");
        Book book5 = new Book("105", "The Catcher in the Rye", "J.D. Salinger");

        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();
        book4.displayBookInfo();
        book5.displayBookInfo();

        Book.libraryName = "National Library";
        book1.displayBookInfo();
        book2.displayBookInfo();

        System.out.println("Number of Book Count:" + Book.totalBooksCount);
    }
}
