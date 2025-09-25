package inheritance;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        System.out.println("Book Title: " + title + ", Year: " + publicationYear + ", Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author bookWithAuthor = new Author("The Java Handbook", 2022, "James Gosling", "Father of Java Programming");
        bookWithAuthor.displayInfo();
    }
}

