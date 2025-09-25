package encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private final String productId;
    private String name;
    private double price;

    Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public abstract double calculateDiscount();

    public double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private int warrantyYears;

    Electronics(String productId, String name, double price, int warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST @18% for Electronics";
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() + calculateTax() - calculateDiscount();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Electronics, Warranty: " + warrantyYears + " years");
    }
}

class Clothing extends Product implements Taxable {
    private String size;

    Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "GST @5% for Clothing";
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() + calculateTax() - calculateDiscount();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Clothing, Size: " + size);
    }
}

class Groceries extends Product {
    private double weightInKg;

    Groceries(String productId, String name, double price, double weightInKg) {
        super(productId, name, price);
        this.weightInKg = weightInKg;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() - calculateDiscount();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Groceries, Weight: " + weightInKg + " kg");
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        Product laptop = new Electronics("P001", "Laptop", 60000, 2);
        Product shirt = new Clothing("P002", "Shirt", 2000, "M");
        Product rice = new Groceries("P003", "Rice Bag", 1500, 10);

        cart.add(laptop);
        cart.add(shirt);
        cart.add(rice);

        System.out.println("   CART DETAILS   ");
        for (Product product : cart) {
            product.displayDetails();
            double finalPrice = product.calculateFinalPrice();
            System.out.println("Discount: " + product.calculateDiscount());
            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                System.out.println(taxable.getTaxDetails() + ", Tax: " + taxable.calculateTax());
            }
            System.out.println("Final Price: " + finalPrice);
        
        }
    }
}

