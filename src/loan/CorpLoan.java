package loan;

public class CorpLoan extends Loan {
    public CorpLoan(int id, double amount) {
        super(id, amount);
    }

    public CorpLoan() {
    }

    @Override
    public double getComission() {
        double result = (getAmount() * 1.2) / 100;
        return result;
    }

}
