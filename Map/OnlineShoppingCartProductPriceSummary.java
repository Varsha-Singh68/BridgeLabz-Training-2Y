package map;

import java.util.*;

public class OnlineShoppingCartProductPriceSummary {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);
        cart.put("Headphones", 2000.0);

        Map<String, Integer> quantity = new HashMap<>();
        quantity.put("Laptop", 1);
        quantity.put("Mouse", 1);
        quantity.put("Keyboard", 1);
        quantity.put("Headphones", 1);

        System.out.println("Products in Cart (Insertion Order):");
        for (String product : cart.keySet()) {
            System.out.println(product + " → ₹" + cart.get(product) +
                    " (Qty: " + quantity.get(product) + ")");
        }

        double total = 0;
        for (String product : cart.keySet()) {
            total += cart.get(product) * quantity.get(product);
        }

        System.out.println("\nTotal Before Discount: ₹" + total);

        if (total > 5000) {
            double discount = total * 0.10;
            total -= discount;
            System.out.println("10% Discount Applied: -₹" + discount);
        }

        System.out.println("Final Bill Amount: ₹" + total);

        System.out.println("\nRemoving Mouse (Qty becomes 0)");
        quantity.put("Mouse", 0);

        Iterator<Map.Entry<String, Integer>> it = quantity.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() == 0) {
                cart.remove(entry.getKey());
                it.remove();
            }
        }

        System.out.println("\nUpdated Cart:");
        for (String product : cart.keySet()) {
            System.out.println(product + " → ₹" + cart.get(product) +
                    " (Qty: " + quantity.get(product) + ")");
        }
    }
}

