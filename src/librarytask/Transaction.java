package librarytask;

import java.util.Date;

public class Transaction {
    private static int counter = 1;
    private String transactionId;
    private String memberId;
    private String isbn;
    private String type;


    public Transaction(String memberId, String isbn, String type) {
        this.transactionId = "T" + counter++;
        this.memberId = memberId;
        this.isbn = isbn;
        this.type = type;

    }

    public void printTransactionDetails() {
        System.out.println("Transaction Details : ");
        System.out.println(transactionId + " ," + memberId + " , " + isbn + " , " + type );
    }

}
