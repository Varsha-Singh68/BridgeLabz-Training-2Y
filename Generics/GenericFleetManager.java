package generic;

import java.util.*;

class Vehicle {
    String name;
    Vehicle(String name) { this.name = name; }
    public String toString() { return name; }
}

class Truck extends Vehicle {
    Truck() { super("Truck"); }
}

class Bike extends Vehicle {
    Bike() { super("Bike"); }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (T v : fleet) System.out.println(v);
    }
}

public class GenericFleetManager {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck());
        truckFleet.addVehicle(new Truck());
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike());
        bikeFleet.addVehicle(new Bike());
        bikeFleet.showFleet();
    }
}

