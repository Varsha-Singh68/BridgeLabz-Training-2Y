package com.bridgelabz.oops.levelone;

class Item {
    private String itemCode;
    private String itemName;
    private double price;
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
    	Item item = new Item("I001I", "Tablet", 35000);
        item.displayItemDetails();
        int quantity = 5;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}