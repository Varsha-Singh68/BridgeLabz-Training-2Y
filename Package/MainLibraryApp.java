import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainLibraryApp {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling", "ISBN1234");
        Member member1 = new Member("Amit Sharma", 101);
        Transaction transaction = new Transaction();

        System.out.println("=== Adding New Book ===");
        book1.displayBookDetails();

        System.out.println("\n=== Registering New Member ===");
        member1.displayMemberDetails();

        System.out.println("\n=== Issuing Book ===");
        transaction.issueBook(book1, member1);

        System.out.println("\n=== Book Status After Issue ===");
        book1.displayBookDetails();
    }
}

