package loan;

import java.util.Objects;

public abstract class Loan {
    private int id;
    private double amount;

    public Loan(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Loan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan loan)) return false;
        return id == loan.id && Double.compare(loan.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount);
    }

    public abstract double getComission();


}
