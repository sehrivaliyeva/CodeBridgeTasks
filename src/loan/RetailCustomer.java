package loan;

public class RetailCustomer extends Customer implements DiscountService {

    public RetailCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }

    @Override
    public double discountForLoanComission(Loan loan) {
        double result = loan.getComission() - (loan.getAmount() * 2 / 100);
        System.out.println("yekun komissiya : " + result);
        return result;
    }

   /* @Override
    public double discountForLoanComission(Loan loan) {
        if (loan instanceof RetailLoan) {
            RetailLoan retailLoan = (RetailLoan) loan;
            double result = retailLoan.getComission() - (retailLoan.getComission() * 2 / 100);
            System.out.println("yekun komissiya : " + result);
            return result;
        } else {
            System.out.println("Yanlis melumat gonderilib !!!");
            ;
            return 0;

        }

    }*/


}
