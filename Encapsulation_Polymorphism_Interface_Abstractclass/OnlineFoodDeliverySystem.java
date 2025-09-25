package encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount(double amount);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied for Veg Item.";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.85;
    }

    @Override
    public String getDiscountDetails() {
        return "15% discount applied for Non-Veg Item.";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        FoodItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        order.add(veg);
        order.add(nonVeg);

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            double totalPrice = item.calculateTotalPrice();
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
                totalPrice = d.applyDiscount(totalPrice);
            }
            System.out.println("Final Price: " + totalPrice);
            System.out.println();
        }
    }
}

