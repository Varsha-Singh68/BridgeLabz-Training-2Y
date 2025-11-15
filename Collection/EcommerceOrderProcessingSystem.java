package collection;

import java.util.*;

class Order {
    int orderId;
    String product;

    public Order(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        return this.orderId == ((Order) o).orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return orderId + " - " + product;
    }
}

public class EcommerceOrderProcessingSystem {

    public static void main(String[] args) {

        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(101, "Laptop"));
        allOrders.add(new Order(102, "Mobile"));
        allOrders.add(new Order(103, "Watch"));
        allOrders.add(new Order(102, "Mobile"));
        allOrders.add(new Order(101, "Laptop"));

        System.out.println("All Orders:");
        allOrders.forEach(System.out::println);

        Set<Order> uniqueOrders = new HashSet<>(allOrders);

        System.out.println("\nUnique Orders (Duplicates Removed):");
        uniqueOrders.forEach(System.out::println);

        Queue<Order> orderQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedOrders = new Stack<>();

        System.out.println("\nProcessing Orders:");
        while (!orderQueue.isEmpty()) {
            Order current = orderQueue.poll();
            System.out.println("Processing: " + current);

            if (current.orderId % 2 == 0) {
                System.out.println("Failed: " + current);
                failedOrders.push(current);
            } else {
                System.out.println("Success: " + current);
            }
        }

        System.out.println("\nRe-Processing Failed Orders:");
        while (!failedOrders.isEmpty()) {
            Order retry = failedOrders.pop();
            System.out.println("Retrying: " + retry);
            System.out.println("Retry Success: " + retry);
        }
    }
}

