package librarytask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Member {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }


    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

    public void borrowBook(Book book) {
        if (book != null) {
            book.setBorrowed(true);
            borrowedBooks.add(book);
            System.out.println("Book successfully added borrowed list ");
        }

    }

    public void returnBook(Book book) {
        if (book != null && borrowedBooks.contains(book)) {
            book.setBorrowed(false);
            borrowedBooks.remove(book);
            System.out.println("Book successfully remove borrowed list ");
        }else {
            System.out.println("This book not borrowed by yourself !");
        }
    }


}
