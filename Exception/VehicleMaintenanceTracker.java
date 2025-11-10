package exception_handling;

import java.time.LocalDate;

class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}

class Vehicle {
    private String vehicleNumber;
    private LocalDate lastServiceDate;
    private int mileage;

    public Vehicle(String vehicleNumber, LocalDate lastServiceDate, int mileage) {
        this.vehicleNumber = vehicleNumber;
        this.lastServiceDate = lastServiceDate;
        this.mileage = mileage;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        LocalDate today = LocalDate.now();
        if (mileage < 0) {
            throw new InvalidMileageException("Invalid mileage: Mileage cannot be negative!");
        }
        if (lastServiceDate.isBefore(today.minusMonths(6))) {
            throw new ServiceOverdueException("Service overdue! Last serviced on: " + lastServiceDate);
        }
        System.out.println("Vehicle " + vehicleNumber + " is in good condition. No maintenance needed.");
    }
}

public class VehicleMaintenanceTracker {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", LocalDate.of(2025, 7, 15), 12000);
        Vehicle v2 = new Vehicle("MH14XY9876", LocalDate.of(2024, 12, 10), 18000);
        Vehicle v3 = new Vehicle("MH20PQ4321", LocalDate.of(2025, 8, 5), -500);

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            try {
                v.checkMaintenance();
            } catch (ServiceOverdueException e) {
                System.out.println(e.getMessage());
            } catch (InvalidMileageException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Maintenance check complete for vehicle: " + v);
                System.out.println("-------------------------------------------");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


