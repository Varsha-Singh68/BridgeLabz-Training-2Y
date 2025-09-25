package encapsulation_polymorphism_interface_abstractclass;

import java.util.*;

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class RideCar extends RideVehicle implements GPS {
    private String location;

    RideCar(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class RideBike extends RideVehicle implements GPS {
    private String location;

    RideBike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class RideAuto extends RideVehicle implements GPS {
    private String location;

    RideAuto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<RideVehicle> rides = new ArrayList<>();
        RideCar car = new RideCar("C101", "Amit", 15);
        RideBike bike = new RideBike("B201", "Ravi", 10);
        RideAuto auto = new RideAuto("A301", "Suresh", 12);

        car.updateLocation("Sector 10");
        bike.updateLocation("Sector 15");
        auto.updateLocation("Sector 20");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        double distance = 10;

        for (RideVehicle v : rides) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            if (v instanceof GPS) {
                GPS g = (GPS) v;
                System.out.println("Current Location: " + g.getCurrentLocation());
            }
            System.out.println();
        }
    }
}
