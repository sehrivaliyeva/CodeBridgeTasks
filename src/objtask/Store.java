package objtask;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> productList = new ArrayList<>();

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public Product findProductByName(String name) {
        try {
            for (Product product : productList) {
                if (product.getName().equals(name)) {
                    return product;

                }
            }
            throw new ProductNotFountException("PRODUCT NOT FOUND !");

        } catch (ProductNotFountException e) {
            e.printStackTrace();
            return null;

        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }

    }
}








