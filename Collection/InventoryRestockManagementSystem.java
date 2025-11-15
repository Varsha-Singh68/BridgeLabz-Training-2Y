package collection;

import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return name + " | Price: ₹" + price + " | Stock: " + stock;
    }
}

public class InventoryRestockManagementSystem {
    public static void main(String[] args) {

        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockHistory = new Stack<>();

        addProduct("Milk", 45.0, 5, productNames, products);
        addProduct("Bread", 25.0, 2, productNames, products);
        addProduct("Butter", 60.0, 12, productNames, products);
        addProduct("Eggs", 6.0, 3, productNames, products);
        addProduct("Milk", 45.0, 10, productNames, products);

        System.out.println("\nProduct List:");
        products.forEach(System.out::println);

        System.out.println("\nLow Stock Items:");
        for (Product p : products) {
            if (p.stock < 5) {
                restockQueue.add(p);
                System.out.println(p.name);
            }
        }

        System.out.println("\nProcessing Restock:");
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restockHistory.push(p);
            System.out.println("Restocked: " + p.name + " | New Stock: " + p.stock);
        }

        System.out.println("\nUndo Last Restock:");
        if (!restockHistory.isEmpty()) {
            Product last = restockHistory.pop();
            last.stock -= 10;
            System.out.println("Undo: " + last.name + " | Stock: " + last.stock);
        }

        System.out.println("\nFinal Product List:");
        products.forEach(System.out::println);
    }

    public static void addProduct(String name, double price, int stock,
                                  Set<String> productNames, List<Product> products) {

        if (productNames.contains(name)) {
            System.out.println("Duplicate Not Added: " + name);
            return;
        }

        productNames.add(name);
        products.add(new Product(name, price, stock));
        System.out.println("Added: " + name);
    }
}

