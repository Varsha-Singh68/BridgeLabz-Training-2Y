package encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isBorrowed;
    private String borrowerName;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowItem(String borrowerName) {
        if (!isBorrowed) {
            this.isBorrowed = true;
            this.borrowerName = borrowerName;
            System.out.println(title + " borrowed by " + borrowerName);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnItem() {
        if (isBorrowed) {
            System.out.println(title + " returned by " + borrowerName);
            this.isBorrowed = false;
            this.borrowerName = null;
        }
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem(String reserverName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private int pages;

    Book(String itemId, String title, String author, int pages) {
        super(itemId, title, author);
        this.pages = pages;
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem(String reserverName) {
        if (checkAvailability()) {
            System.out.println("Book '" + getTitle() + "' reserved by " + reserverName);
        } else {
            System.out.println("Book '" + getTitle() + "' is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Pages: " + pages;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private int issueNumber;

    Magazine(String itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String reserverName) {
        if (checkAvailability()) {
            System.out.println("Magazine '" + getTitle() + "' reserved by " + reserverName);
        } else {
            System.out.println("Magazine '" + getTitle() + "' is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Issue No: " + issueNumber;
    }
}

class DVD extends LibraryItem implements Reservable {
    private int durationMinutes;

    DVD(String itemId, String title, String author, int durationMinutes) {
        super(itemId, title, author);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String reserverName) {
        if (checkAvailability()) {
            System.out.println("DVD '" + getTitle() + "' reserved by " + reserverName);
        } else {
            System.out.println("DVD '" + getTitle() + "' is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Duration: " + durationMinutes + " mins";
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        LibraryItem book = new Book("B001", "Java Programming", "John Doe", 500);
        LibraryItem magazine = new Magazine("M001", "Tech Monthly", "Jane Smith", 45);
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan", 120);

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable res = (Reservable) item;
                res.reserveItem("Alice");
            }
            item.borrowItem("Bob");
            item.returnItem();
            System.out.println();
        }
    }
}

