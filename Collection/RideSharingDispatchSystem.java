package collection;

import java.util.*;

class RideRequest {
    int requestId;
    String location;
    int priority;

    public RideRequest(int requestId, String location, int priority) {
        this.requestId = requestId;
        this.location = location;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return requestId + " - " + location + " (P:" + priority + ")";
    }
}

class Driver {
    String driverId;
    String name;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return Objects.equals(driverId, d.driverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverId);
    }

    @Override
    public String toString() {
        return driverId + " - " + name;
    }
}

class Ride {
    RideRequest request;
    Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Ride: " + request + " | Driver: " + driver;
    }
}

public class RideSharingDispatchSystem {

    public static void main(String[] args) {

        Queue<RideRequest> normalQueue = new LinkedList<>();
        PriorityQueue<RideRequest> priorityQueue =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);

        Set<Driver> availableDrivers = new HashSet<>();
        List<Ride> completedRides = new ArrayList<>();

        normalQueue.add(new RideRequest(1, "Mall Road", 1));
        normalQueue.add(new RideRequest(2, "Airport", 2));
        normalQueue.add(new RideRequest(3, "City Center", 3));

        priorityQueue.addAll(normalQueue);

        availableDrivers.add(new Driver("D01", "Amit"));
        availableDrivers.add(new Driver("D02", "Rohit"));
        availableDrivers.add(new Driver("D01", "Duplicate"));

        System.out.println("Available Drivers:");
        availableDrivers.forEach(System.out::println);

        System.out.println("\nProcessing Ride Requests:");
        while (!priorityQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest req = priorityQueue.poll();
            Driver driver = availableDrivers.iterator().next();
            availableDrivers.remove(driver);

            Ride ride = new Ride(req, driver);
            completedRides.add(ride);

            System.out.println("Assigned: " + ride);
        }

        System.out.println("\nCompleted Rides History:");
        completedRides.forEach(System.out::println);
    }
}

