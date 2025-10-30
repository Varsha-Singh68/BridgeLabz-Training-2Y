package library.books;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + (isIssued ? "Issued" : "Available"));
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public String getTitle() {
        return title;
    }
}

