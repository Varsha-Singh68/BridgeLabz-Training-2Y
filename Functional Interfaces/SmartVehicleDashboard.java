package functional_interface;

interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery status feature available only for electric vehicles.");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric Car speed: 60 km/h");
    }

    public void displayBattery() {
        System.out.println("Electric Car battery: 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}

