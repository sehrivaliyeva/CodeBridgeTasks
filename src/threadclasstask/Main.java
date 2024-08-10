package threadclasstask;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Bank user = new Bank(1, "Aygun", 300.0);

        Thread thread1 = new Thread(() ->
        {
            try {
                user.cash(100);
            } catch (BalanceProblemException e) {
                e.printStackTrace();
            }
        });


        Thread thread2 = new Thread(() ->
        {
            try {
                user.cardToCard(100);
            } catch (BalanceProblemException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();


        System.out.println("-----------------------------------------------------------------");


        Bank user2 = new Bank(2, "Gunel", 500.0);


        Thread thread3 = new Thread(() ->
        {
            try {
                user2.cash(600);
            } catch (BalanceProblemException e) {
                e.printStackTrace();
            }
        });


        Thread thread4 = new Thread(() ->
        {
            try {
                user2.cardToCard(50);
            } catch (BalanceProblemException e) {
                e.printStackTrace();
            }
        });

        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();


    }
}