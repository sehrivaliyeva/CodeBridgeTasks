package threadclasstask;

public class Bank implements CardToCard, Cash {

    public int id;
    public String userName;

    // burada volatile elemeyime ehtiyac olmadi
    public double balance;

    public Bank(int id, String userName, double balance) {
        this.id = id;
        this.userName = userName;
        this.balance = balance;
    }

    @Override
    synchronized public double cash(double amount) throws BalanceProblemException {
        if (balance >= amount) {
            System.out.println("Evvelki balans : " + balance);
            System.out.println("Cixarilan mebleg :" + amount);
            //double result = balance - amount;
            balance -= amount;
            System.out.println("Netice : " + balance);
            return balance;

        } else {
            throw new BalanceProblemException("BALANSINIZDA KIFAYET QEDER PUL YOXDUR !!!");

        }
    }

    @Override
    synchronized public double cardToCard(double amount) throws BalanceProblemException {
        if (balance >= amount) {
            System.out.println("Evvelki balans : " + balance);
            System.out.println("Kocurulen mebleg :" + amount);
            //  double result = balance - amount;
            balance -= amount;
            System.out.println("Netice : " + balance);
            return balance;
        } else {
            throw new BalanceProblemException("BALANSINIZDA KIFAYET QEDER PUL YOXDUR!!!");

        }
    }


}
