package collection;

import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        List<Book> allBooks = new ArrayList<>();
        allBooks.add(new Book("Harry Potter", "J.K. Rowling"));
        allBooks.add(new Book("The Alchemist", "Paulo Coelho"));
        allBooks.add(new Book("Atomic Habits", "James Clear"));

        Set<String> members = new HashSet<>();
        members.add("M001");
        members.add("M002");
        members.add("M003");

        members.add("M002");

        Queue<Book> issueQueue = new LinkedList<>();
        issueQueue.add(allBooks.get(0));
        issueQueue.add(allBooks.get(1));

        Stack<Book> returnedBooks = new Stack<>();
        returnedBooks.push(allBooks.get(2));

        while (!issueQueue.isEmpty()) {
            Book book = issueQueue.poll();
            System.out.println("Issued: " + book);
        }

        Book returnedBook = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
        returnedBooks.push(returnedBook);

        if (!returnedBooks.isEmpty()) {
            Book reissued = returnedBooks.pop();
            System.out.println("Re-Issued: " + reissued);
        }

        System.out.println("\nAll Books:");
        for (Book b : allBooks) System.out.println(b);

        System.out.println("\nMembers:");
        for (String m : members) System.out.println(m);
    }
}
