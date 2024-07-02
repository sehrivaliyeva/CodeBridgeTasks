package objtask;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    double money;
    List<Product> inventory = new ArrayList<>();

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getInventory() {
        return inventory;
    }

    public void buyProduct(Product product) {
        try {

            if (money >= product.getPrice()) {
                money -= product.getPrice();
                inventory.add(product);


            } else {

                throw new BalanceInsufficinetException("BALANCE NOT ENOUGH ! ");

            }

        } catch (BalanceInsufficinetException e) {
            e.printStackTrace();

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }


}



