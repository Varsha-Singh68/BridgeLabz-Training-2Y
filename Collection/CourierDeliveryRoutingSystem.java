package collection;

import java.util.*;

class Parcel {
    String deliveryId;
    String address;
    int priority;

    Parcel(String deliveryId, String address, int priority) {
        this.deliveryId = deliveryId;
        this.address = address;
        this.priority = priority;
    }

    public String toString() {
        return deliveryId + " | " + address + " | Priority: " + priority;
    }
}

public class CourierDeliveryRoutingSystem {
    public static void main(String[] args) {

        PriorityQueue<Parcel> priorityParcels = new PriorityQueue<>(Comparator.comparingInt(p -> -p.priority));
        Queue<Parcel> normalParcels = new LinkedList<>();
        Set<String> assignedIds = new HashSet<>();
        List<Parcel> completedDeliveries = new ArrayList<>();

        addParcel("P101", "Delhi", 5, priorityParcels, normalParcels, assignedIds);
        addParcel("P102", "Mumbai", 2, priorityParcels, normalParcels, assignedIds);
        addParcel("P103", "Pune", 1, priorityParcels, normalParcels, assignedIds);
        addParcel("P101", "Chennai", 4, priorityParcels, normalParcels, assignedIds);

        processDeliveries(priorityParcels, normalParcels, completedDeliveries);

        System.out.println("\nCompleted Deliveries:");
        for (Parcel p : completedDeliveries) System.out.println(p);
    }

    static void addParcel(String id, String address, int priority,
                          PriorityQueue<Parcel> priorityPQ,
                          Queue<Parcel> normalQ,
                          Set<String> ids) {
        if (ids.contains(id)) return;
        ids.add(id);
        Parcel p = new Parcel(id, address, priority);
        if (priority >= 3) priorityPQ.add(p);
        else normalQ.add(p);
    }

    static void processDeliveries(
            PriorityQueue<Parcel> priorityPQ,
            Queue<Parcel> normalQ,
            List<Parcel> completed) {

        while (!priorityPQ.isEmpty()) completed.add(priorityPQ.poll());
        while (!normalQ.isEmpty()) completed.add(normalQ.poll());
    }
}
