package constructors;

public class LibraryBookSystem {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBookSystem() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }

    public LibraryBookSystem(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        LibraryBookSystem b1 = new LibraryBookSystem("The Paradise", "James", 500, true);
        b1.displayInfo();
        System.out.println();
        b1.borrowBook();
        b1.displayInfo();
        System.out.println();
        b1.borrowBook();
    }
}
