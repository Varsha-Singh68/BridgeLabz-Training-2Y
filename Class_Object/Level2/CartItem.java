package com.bridgelabz.oops.leveltwo;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    public void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Item added: " + itemName);
    }
    public void removeItem() {
        System.out.println("Item removed: " + itemName);
        this.itemName = null;
        this.price = 0;
        this.quantity = 0;
    }
    public double getTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        if (itemName == null) {
            System.out.println("No item in the cart.");
        } else {
            System.out.println("Item: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + getTotalCost());
        }
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();
        cart.addItem("Refrigerator", 30000, 3); 
        cart.displayItem();             
        cart.removeItem();             
        cart.displayItem();             
    }
}