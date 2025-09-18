package com.bridgelabz.oops.levelone;

class MobilePhone {
    private String brand;
    private String model;
    private double price;
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Price: " + price);
    }

    
    public static void main(String[] args) {
        
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15 Pro", 150000);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24 Ultra", 130000);
        System.out.println("Details of Phone 1:");
        phone1.displayDetails();
        System.out.println("\nDetails of Phone 2:");
        phone2.displayDetails();
    }
}

