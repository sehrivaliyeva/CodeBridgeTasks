package objtask;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Computer", 1500.0);
        Product product2 = new Product("Notebook", 1200.0);
        Product product3 = new Product("Printer", 400.0);
        Product product4 = new Product("Scanner", 580.0);
        Product product5 = new Product("Monitor", 650.0);
        Product product6 = new Product("Keyboard", 320.0);
        Product product7 = new Product("Mouse", 100.0);

        Customer customer1 = new Customer("Aygun", 1000.0);
        Customer customer2 = new Customer("Gunel", 500.0);
        Customer customer3 = new Customer("Narmin", 1200.0);


        Store store = new Store(List.of(product1, product2, product3, product4, product5, product6, product7));
        System.out.println("-------------------------------------------------------------");


        customer1.buyProduct(store.findProductByName("Scanner"));
        customer1.buyProduct(store.findProductByName("Keyboard"));

        System.out.println(customer1.getName() + " musterinin aldigi mehsullar " + customer1.getInventory().toString());
        System.out.println(customer1.getName() + " musterinin qaliq balansi " + customer1.getMoney());

        System.out.println("---------------------------------------------------------------");

        customer2.buyProduct(store.findProductByName("Macbook"));
        System.out.println(customer2.getName() + " musterinin aldigi mehsullar " + customer2.getInventory().toString());
        System.out.println(customer2.getName() + " musterinin qaliq balansi " + customer2.getMoney());


        System.out.println("-------------------------------------------------------------------");

       customer3.buyProduct(store.findProductByName("Computer"));
        System.out.println(customer3.getName() + " musterinin aldigi mehsullar " + customer3.getInventory().toString());
        System.out.println(customer3.getName() + " musterinin qaliq balansi " + customer3.getMoney());


    }
}
