package inheritance;

class BaseVehicle {
    int maxSpeed;
    String model;

    BaseVehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Vehicle Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends BaseVehicle {
    int batteryCapacity;

    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Electric Vehicle " + model + " is charging. Battery Capacity: " + batteryCapacity + " kWh");
    }

    @Override
    void displayInfo() {
        System.out.println("Electric Vehicle -> Model: " + model + ", Max Speed: " + maxSpeed + " km/h, Battery: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends BaseVehicle implements Refuelable {
    int fuelTankCapacity;

    PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Petrol Vehicle " + model + " is refueling. Tank Capacity: " + fuelTankCapacity + " liters");
    }

    @Override
    void displayInfo() {
        System.out.println("Petrol Vehicle -> Model: " + model + ", Max Speed: " + maxSpeed + " km/h, Fuel Tank: " + fuelTankCapacity + " liters");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Toyota Corolla", 50);

        ev.displayInfo();
        ev.charge();

        pv.displayInfo();
        pv.refuel();
    }
}
