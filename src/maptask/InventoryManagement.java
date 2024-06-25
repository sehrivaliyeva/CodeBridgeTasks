package maptask;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InventoryManagement {
    static Map<String, Integer> map = new HashMap<>();


    static void findProductQuantity(String searchProduct) {

        Set<String> set = map.keySet();
        boolean foundedProduct = false;
        for (String key : set) {
            int productCount = map.get(key);
            if (key.equalsIgnoreCase(searchProduct) && productCount == 0) {
                foundedProduct = true;
                System.out.println("Product has no stock : " + productCount);
                break;
            } else if (key.equalsIgnoreCase(searchProduct) && productCount <= 20) {
                foundedProduct = true;
                System.out.println("Product find  stock is less : " + productCount);
                break;

            } else if (key.equalsIgnoreCase(searchProduct) && productCount >= 20) {
                foundedProduct = true;
                System.out.println("Product find  stock is  : " + productCount);
                break;

            }

        }

        if (!foundedProduct) {
            System.out.println("product not found");
        }

    }

    public static void main(String[] args) {
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Peach", 45);
        map.put("Strawberry", 35);
        map.put("Raspberry", 20);
        map.put("Lemon", 50);
        map.put("Kivy", 15);
        map.put("Mango", 30);
        map.put("Watermelon", 0);

        findProductQuantity("kivi");

    }

}
