package collection;

import java.util.*;

class Package {
    String id;
    String address;

    Package(String id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return id + " | " + address;
    }
}

public class WarehouseDeliveryTrackingSystem {
    public static void main(String[] args) {

        Queue<Package> pending = new LinkedList<>();
        Set<String> uniqueIds = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        addPackage(new Package("P101", "Delhi"), uniqueIds, pending);
        addPackage(new Package("P102", "Mumbai"), uniqueIds, pending);
        addPackage(new Package("P103", "Pune"), uniqueIds, pending);
        addPackage(new Package("P101", "Duplicate"), uniqueIds, pending);

        System.out.println("\nPending Deliveries:");
        pending.forEach(System.out::println);

        System.out.println("\nProcessing Deliveries:");
        while (!pending.isEmpty()) {
            Package p = pending.poll();

            if (p.id.equals("P102")) {
                returned.push(p);
                System.out.println("Returned: " + p);
            } else {
                delivered.add(p);
                System.out.println("Delivered: " + p);
            }
        }

        System.out.println("\nDelivered Packages:");
        delivered.forEach(System.out::println);

        System.out.println("\nReturned Packages:");
        returned.forEach(System.out::println);

        System.out.println("\nSummary:");
        System.out.println("Total Unique Packages: " + uniqueIds.size());
        System.out.println("Delivered Count: " + delivered.size());
        System.out.println("Returned Count: " + returned.size());
    }

    public static void addPackage(Package p, Set<String> uniqueIds, Queue<Package> pending) {
        if (!uniqueIds.add(p.id)) return;
        pending.add(p);
    }
}

