class LibraryBook {

    // Private instance fields
    private String bookId;
    private String title;
    private boolean issued;

    // Static fields
    static String libraryName = "SRM Central Library";
    static int bookCount = 0;

    // Constructor 1: bookId and title
    LibraryBook(String bookId, String title) {

        // Validation
        if (bookId == null || bookId.trim().isEmpty()) {
            System.out.println("Warning: Invalid book ID.");
            return;
        }

        if (title == null || title.trim().isEmpty()) {
            System.out.println("Warning: Invalid book title.");
            return;
        }

        // Initialize instance fields
        this.bookId = bookId;
        this.title = title;
        this.issued = false;

        // Count valid book
        bookCount++;

        System.out.println("Book created: " + this.bookId + " - " + this.title);
    }

    // Constructor 2: bookId, title and issued
    LibraryBook(String bookId, String title, boolean issued) {

        // Constructor chaining
        this(bookId, title);

        // Only set issued if the book was valid
        if (this.bookId != null) {
            this.issued = issued;
        }
    }

    // Method to issue a book
    void issueBook() {

        if (issued) {
            System.out.println("Book " + bookId + " is already issued.");
        } else {
            issued = true;
            System.out.println("Book " + bookId + " issued successfully.");
        }
    }

    // Method to return a book
    void returnBook() {

        issued = false;
        System.out.println("Book " + bookId + " returned successfully.");
    }

    // Static method
    static void printLibraryInfo() {

        System.out.println("Library: " + libraryName);
        System.out.println("Total valid books: " + bookCount);
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        // Creating objects using both constructors
        LibraryBook book1 =
                new LibraryBook("B101", "Java Programming");

        LibraryBook book2 =
                new LibraryBook("B102", "Data Structures");

        LibraryBook book3 =
                new LibraryBook("B103", "Database Systems", false);

        System.out.println();

        // Demonstrate issuing a book
        book1.issueBook();

        // Attempt to issue an already-issued book
        book1.issueBook();

        // Return the book
        book1.returnBook();

        System.out.println();

        // Access static method using class name
        LibraryBook.printLibraryInfo();
    }
}