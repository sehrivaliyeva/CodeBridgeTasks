package librarytask;

public class Main {
    public static void main(String[] args) {
       /* Book book1 = new Book("IT book", "John", "11");
        Book book2 = new Book("DevOps book", "Nina", "22");
        Book book3 = new Book("HelpDesk book", "Micheal", "33");
        Book book4 = new Book("SMM book", "Henry", "44");
        Book book5 = new Book("CEO book", "Mark", "55");

        Member member1 = new Member("1", "Gunel");
        Member member2 = new Member("2", "Ayten");*/


        Library library = new Library();

        // Kitap ekleme
        library.catalog.addBook("Java Programming", "Author A", "ISBN12345");
        library.catalog.addBook("Effective Java", "Joshua Bloch", "ISBN67890");

//         Üye ekleme
        //  library.memberShip.addMember("M001", "John Doe");
        // library.memberShip.addMember("M002", "Jane Smith");

//         Kitap ödünç alma ve iade
        // library.borrowBook("M001", "ISBN12345");
        // library.returnBook("M001", "ISBN12345");

        // Kitap arama
       /* Book book = library.catalog.searchBook("ISBN67890");
        if (book != null) {
            System.out.println("Found book: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
//
        // Üye arama
        Member member = library.membership.searchMember("M002");
        if (member != null) {
            System.out.println("Found member: " + member.getName());
        } else {
            System.out.println("Member not found.");
        }*/


    }
}
