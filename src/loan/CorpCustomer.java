package loan;

public class CorpCustomer extends Customer implements DiscountService {

    public CorpCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }

    @Override
    public double discountForLoanComission(Loan loan) {
        double result = loan.getComission() - (loan.getComission() * 0.5 / 100);
        System.out.println("yekun komissiya : " + result);
        return result;

    }




    /*@Override
    public double discountForLoanComission(Loan loan) {

        if (loan instanceof CorpLoan) {
            CorpLoan corpLoan = (CorpLoan) loan;
            double result = corpLoan.getComission() - (corpLoan.getComission() * 0.5 / 100);
            System.out.println("yekun komissiya : " + result);
            return result;
        } else {
            System.out.println(" Yanlis melumat gonderilib !! ");
            return 0;
        }

    }*/
}
