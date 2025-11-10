package exception_handling;

import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String message) {
        super(message);
    }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String message) {
        super(message);
    }
}

class Library {
    private Map<String, Boolean> books = new HashMap<>();
    private Map<String, List<String>> userRecords = new HashMap<>();

    public Library() {
        books.put("Java Programming", true);
        books.put("Python Basics", true);
        books.put("Data Structures", true);
        books.put("Operating Systems", true);
        books.put("Database Concepts", true);
    }

    public void borrowBook(String user, String book)
            throws BookNotAvailableException, UserLimitExceededException {
        if (!books.containsKey(book)) {
            throw new BookNotAvailableException("Book '" + book + "' does not exist in the library.");
        }

        if (!books.get(book)) {
            throw new BookNotAvailableException("Book '" + book + "' is currently checked out.");
        }

        userRecords.putIfAbsent(user, new ArrayList<>());
        List<String> borrowedBooks = userRecords.get(user);

        if (borrowedBooks.size() >= 5) {
            throw new UserLimitExceededException("User '" + user + "' has reached the borrowing limit (5 books).");
        }

        borrowedBooks.add(book);
        books.put(book, false);
        System.out.println(user + " successfully borrowed '" + book + "'.");
    }

    public void returnBook(String user, String book)
            throws InvalidReturnException {
        if (!userRecords.containsKey(user) || !userRecords.get(user).contains(book)) {
            throw new InvalidReturnException("Invalid return attempt. '" + book + "' was not borrowed by " + user );
        }

        userRecords.get(user).remove(book);
        books.put(book, true);
        System.out.println(user + " successfully returned '" + book + "'.");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                if (choice == 1) {
                    System.out.print("Enter your name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter book title: ");
                    String book = sc.nextLine();
                    library.borrowBook(user, book);
                } else if (choice == 2) {
                    System.out.print("Enter your name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter book title: ");
                    String book = sc.nextLine();
                    library.returnBook(user, book);
                } else if (choice == 3) {
                    System.out.println("Thank you for using the Library Management System!");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (BookNotAvailableException | InvalidReturnException | UserLimitExceededException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            } finally {
                System.out.println("------------------------------------------");
            }
        }
        sc.close();
    }
}

