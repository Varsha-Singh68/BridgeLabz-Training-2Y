package encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public void displayInfo() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate per day: " + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private int seatCapacity;
    private String policyNumber;

    Car(String vehicleNumber, double rentalRate, int seatCapacity, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.seatCapacity = seatCapacity;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + policyNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Bike extends Vehicle implements Insurable {
    private String engineType;
    private String policyNumber;

    Bike(String vehicleNumber, double rentalRate, String engineType, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.engineType = engineType;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + policyNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
    }
}

class Truck extends Vehicle implements Insurable {
    private double loadCapacity;
    private String policyNumber;

    Truck(String vehicleNumber, double rentalRate, double loadCapacity, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.loadCapacity = loadCapacity;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + policyNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C123", 2000, 5, "CAR-INS-101"));
        vehicles.add(new Bike("B456", 500, "Petrol", "BIKE-INS-202"));
        vehicles.add(new Truck("T789", 4000, 10, "TRUCK-INS-303"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            v.displayInfo();
            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails() + ", Insurance: " + ins.calculateInsurance());
            }
            System.out.println();
        }
    }
}

