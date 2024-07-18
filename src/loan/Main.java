package loan;

public class Main {
    public static void main(String[] args) {

        Loan loan1 = new RetailLoan(1, 100.0);
        Loan loan2 = new CorpLoan(2, 200.0);

        CorpCustomer customer1 = new CorpCustomer(1, "Aygun", loan2);
        RetailCustomer customer2 = new RetailCustomer(2, "Gunel", loan1);

        customer2.discountForLoanComission(loan1);
        customer1.discountForLoanComission(loan2);


    }
}
