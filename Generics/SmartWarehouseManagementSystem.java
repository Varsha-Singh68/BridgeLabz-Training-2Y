package generic;

import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}

class Electronic extends WarehouseItem {
    Electronic(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtil {
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem w : items) System.out.println(w);
    }
}

public class SmartWarehouseManagementSystem{
    public static void main(String[] args) {
        Storage<Electronic> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronic("Laptop"));
        electronicsStorage.addItem(new Electronic("Camera"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        WarehouseUtil.displayAll(electronicsStorage.getItems());
        WarehouseUtil.displayAll(groceryStorage.getItems());
        WarehouseUtil.displayAll(furnitureStorage.getItems());
    }
}

