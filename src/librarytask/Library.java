package librarytask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

     Catalog catalog = new Catalog();

     MemberShip memberShip = new MemberShip();

    List<Transaction> transactions = new ArrayList<>();


    public void borrowBook(String memberId, String isbn) {
        Member member = memberShip.searchMember(memberId);
        Book book = catalog.searchBook(isbn);
        if (member != null && book != null && !book.isBorrowed()) {
            member.borrowBook(book);
            Transaction transaction = new Transaction(memberId, isbn, "Borrow");
            transactions.add(transaction);
            transaction.printTransactionDetails();
        } else {
            System.out.println("  Unsuccessfull operation !! Either member or book not found, or book is already borrowed.");
        }
    }

    public void returnBook(String memberId, String isbn) {
        Member member = memberShip.searchMember(memberId);
        Book book = catalog.searchBook(isbn);
        if (member != null && book != null && book.isBorrowed()) {
            member.returnBook(book);
            Transaction transaction = new Transaction(memberId, isbn, "Return");
            transactions.add(transaction);
            transaction.printTransactionDetails();
        } else {
            System.out.println("Cannot return book. Either member or book not found, or book was not borrowed.");
        }
    }

     class MemberShip {
        private Map<String, Member> members = new HashMap<>();

         public Map<String, Member> getMembers() {
             return members;
         }

         public void setMembers(Map<String, Member> members) {
             this.members = members;
         }

         public void addMember(String memberId, String name) {
            members.put(memberId, new Member(memberId, name));

        }

        public void removeMember(String memberId) {
            if (members.containsKey(memberId)) {
                members.remove(memberId);
            } else {
                System.out.println("Member Not Found");
            }
        }

        public Member searchMember(String memberId) {
            if (members.containsKey(memberId)) {
                Member member = members.get(memberId);
                return member;
            } else {
                System.out.println("Member not found");
                return null;
            }
        }

    }

     class Catalog {
        private Map<String, Book> booksCatalog = new HashMap<>();


        public void addBook(String title, String author, String isbn) {

            booksCatalog.put(isbn, new Book(title, isbn, author));
            System.out.println(" success");
        }

        public void removeBookCatalog(String isbn) {
            if (booksCatalog.containsKey(isbn)) {
                booksCatalog.remove(isbn);
            } else {
                System.out.println("Book not found this isbn for remove");
            }
        }

        public Book searchBook(String isbn) {
            if (booksCatalog.containsKey(isbn)) {
                Book book = booksCatalog.get(isbn);
                return book;
            } else {
                System.out.println("Book not found ! ");
                return null;
            }
        }
    }


}
