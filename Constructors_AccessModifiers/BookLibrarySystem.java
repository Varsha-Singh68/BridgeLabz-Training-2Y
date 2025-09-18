package constructors;

class EBook extends BookLibrarySystem {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
        System.out.println("Author (via getter): " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class BookLibrarySystem {
    public String ISBN;
    protected String title;
    private String author;

    public BookLibrarySystem() {
        this.ISBN = "Unknown";
        this.title = "Unknown";
        this.author = "Unknown";
    }

    public BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        BookLibrarySystem b1 = new BookLibrarySystem("978-0135166307", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();
        System.out.println();

        b1.setAuthor("J. Bloch");
        System.out.println("After Updating Author:");
        b1.displayBookDetails();
        System.out.println();

        EBook eb1 = new EBook("978-0135166307", "Effective Java", "Joshua Bloch", 5.5);
        eb1.displayEBookDetails();
    }
}

