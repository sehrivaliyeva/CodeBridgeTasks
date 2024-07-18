package loan;

public class RetailLoan extends Loan {


    public RetailLoan(int id, double amount) {
        super(id, amount);
    }

    public RetailLoan() {
    }

    @Override
    public double getComission() {
        double result = (getAmount() * 5) / 100;
        return result;
    }

}
