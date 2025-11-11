package lambda_expressions;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class CustomSortingE_Commerce {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 25000, 4.5, 10));
        products.add(new Product("Laptop", 75000, 4.7, 15));
        products.add(new Product("Headphones", 2000, 4.2, 25));
        products.add(new Product("Smartwatch", 6000, 4.0, 5));

        System.out.println("Sort by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}

