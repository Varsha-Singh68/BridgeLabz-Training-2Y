package generic;

import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        for (T i : items) System.out.println(i);
    }
}

class Electronics {
    String name;
    Electronics(String name) { this.name = name; }
    public String toString() { return name; }
}

class Clothing {
    String name;
    Clothing(String name) { this.name = name; }
    public String toString() { return name; }
}

public class GenericCart {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Headphones"));
        electronicsCart.displayItems();

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("Shirt"));
        clothingCart.addItem(new Clothing("Jacket"));
        clothingCart.displayItems();
    }
}

