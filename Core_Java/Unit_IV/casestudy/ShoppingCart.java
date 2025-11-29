package casestudy;

import java.util.*;

/**
 * Online Shopping Cart
 * Demonstrates collections, wrappers, and maps.
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Map<Integer, String> products = new HashMap<>();
        products.put(1, "Pen");
        products.put(2, "Notebook");
        products.put(3, "Bag");
        List<Integer> cart = new ArrayList<>();
        cart.add(1); cart.add(2); cart.add(1); // Add Pen, Notebook, Pen
        System.out.println("Cart Items:");
        for (Integer pid : cart) {
            System.out.println(products.get(pid));
        }
        Set<Integer> unique = new HashSet<>(cart);
        System.out.println("Unique Items: " + unique.size());
    }
}
