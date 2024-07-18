package loan;

import java.util.Objects;

public abstract class Customer {
    private int id;
    private String name;
    private Loan loan;

    public Customer() {
    }

    public Customer(int id, String name, Loan loan) {
        this.id = id;
        this.name = name;
        this.loan = loan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(loan, customer.loan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, loan);
    }




}
