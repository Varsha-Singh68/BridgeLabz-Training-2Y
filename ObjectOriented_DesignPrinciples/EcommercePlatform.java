package object_relationships;

import java.util.*;

class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private Customer_ customer;
    private List<Product> products;
    public Order(int orderId, Customer_ customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " placed by " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : products) {
            System.out.println(p.getName() + " - $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
        System.out.println();
    }
}

class Customer_ {
    private String name;
    private List<Order> orders;
    public Customer_(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public Order placeOrder(int orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        return order;
    }
    public void showOrders() {
        System.out.println("Customer: " + name + " Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Shoes", 2000);
        Product p2 = new Product("Phone", 15000);
        Product p3 = new Product("Bag", 678);
        Customer_ c1 = new Customer_("Varsha");
        Customer_ c2 = new Customer_("Riya");
        Order o1 = c1.placeOrder(104);
        o1.addProduct(p1);
        o1.addProduct(p3);
        Order o2 = c2.placeOrder(105);
        o2.addProduct(p2);
        o2.addProduct(p3);
        c1.showOrders();
        c2.showOrders();
    }
}

