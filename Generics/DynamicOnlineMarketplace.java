package generic;

import java.util.*;

interface Category { }

class BookCategory implements Category {
    String type;
    BookCategory(String type) { this.type = type; }
    public String toString() { return type; }
}

class ClothingCategory implements Category {
    String type;
    ClothingCategory(String type) { this.type = type; }
    public String toString() { return type; }
}

class GadgetCategory implements Category {
    String type;
    GadgetCategory(String type) { this.type = type; }
    public String toString() { return type; }
}

class Producti<T extends Category> {
    String name;
    double price;
    T category;

    Producti(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + " - " + price + " - " + category;
    }
}

class MarketplaceUtil {
    public static <T extends Producti<?>> void applyDiscount(T producti, double percentage) {
        double newPrice = producti.price - (producti.price * percentage / 100);
        producti.setPrice(newPrice);
    }
}

class Catalog {
    private List<Producti<?>> products = new ArrayList<>();

    public void addProduct(Producti<?> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Producti<?> p : products) System.out.println(p);
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Producti<BookCategory> book = new Producti<>("Java Book", 500, new BookCategory("Programming"));
        Producti<ClothingCategory> shirt = new Producti<>("Formal Shirt", 1200, new ClothingCategory("Men"));
        Producti<GadgetCategory> phone = new Producti<>("Smartphone", 25000, new GadgetCategory("Electronics"));

        MarketplaceUtil.applyDiscount(book, 10);
        MarketplaceUtil.applyDiscount(shirt, 20);
        MarketplaceUtil.applyDiscount(phone, 5);

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        catalog.showCatalog();
    }
}

