package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issueBook(Book book, Member member) {
        if (!book.isIssued()) {
            book.issueBook();
            System.out.println("Book \"" + book.getTitle() + "\" issued to " + member.getName());
        } else {
            System.out.println("Sorry, the book is already issued.");
        }
    }

    public void returnBook(Book book, Member member) {
        if (book.isIssued()) {
            book.returnBook();
            System.out.println("Book \"" + book.getTitle() + "\" returned by " + member.getName());
        } else {
            System.out.println("This book was not issued.");
        }
    }
}

