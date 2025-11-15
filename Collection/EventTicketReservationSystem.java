package collection;

import java.util.*;

class Booking implements Comparable<Booking> {
    String user;
    String event;
    boolean vip;

    Booking(String user, String event, boolean vip) {
        this.user = user;
        this.event = event;
        this.vip = vip;
    }

    @Override
    public int compareTo(Booking b) {
        return Boolean.compare(b.vip, this.vip);
    }

    @Override
    public String toString() {
        return user + " | " + event + " | VIP: " + vip;
    }
}

public class EventTicketReservationSystem {
    public static void main(String[] args) {

        List<Booking> confirmed = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> normalQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>();

        register("rohan", users);
        register("meera", users);
        register("amit", users);
        register("rohan", users);

        addBooking(new Booking("rohan", "Concert", true), users, normalQueue, vipQueue);
        addBooking(new Booking("meera", "Concert", false), users, normalQueue, vipQueue);
        addBooking(new Booking("amit", "Concert", true), users, normalQueue, vipQueue);
        addBooking(new Booking("unknown", "Concert", false), users, normalQueue, vipQueue);

        System.out.println("\nProcessing VIP Bookings:");
        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            confirmed.add(b);
            System.out.println("Confirmed VIP: " + b);
        }

        System.out.println("\nProcessing Normal Bookings:");
        while (!normalQueue.isEmpty()) {
            Booking b = normalQueue.poll();
            confirmed.add(b);
            System.out.println("Confirmed: " + b);
        }

        System.out.println("\nFinal Confirmed Bookings:");
        confirmed.forEach(System.out::println);
    }

    public static void register(String user, Set<String> users) {
        if (users.add(user)) {
            System.out.println("Registered: " + user);
        } else {
            System.out.println("Duplicate User Ignored: " + user);
        }
    }

    public static void addBooking(Booking b, Set<String> users,
            Queue<Booking> normalQueue, PriorityQueue<Booking> vipQueue) {

        if (!users.contains(b.user)) {
            System.out.println("Booking Rejected (User Not Registered): " + b.user);
            return;
        }

        if (b.vip) vipQueue.add(b);
        else normalQueue.add(b);
    }
}

