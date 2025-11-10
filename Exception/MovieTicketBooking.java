package exception_handling;

import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class MovieBookingSystem {
    private Map<String, Boolean> seats = new HashMap<>();

    public MovieBookingSystem() {
        seats.put("A1", true);
        seats.put("A2", true);
        seats.put("A3", true);
        seats.put("B1", true);
        seats.put("B2", true);
        seats.put("B3", true);
    }

    public void bookSeat(String seatNumber) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNumber)) {
            throw new InvalidSeatException("Seat " + seatNumber + " does not exist.");
        }

        if (!seats.get(seatNumber)) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked.");
        }

        seats.put(seatNumber, false);
        System.out.println("Booking successful! Seat " + seatNumber + " is now reserved.");
    }

    public void showAvailableSeats() {
        System.out.println("\nAvailable Seats:");
        for (Map.Entry<String, Boolean> entry : seats.entrySet()) {
            System.out.println(entry.getKey() + " → " + (entry.getValue() ? "Available" : "Booked"));
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieBookingSystem bookingSystem = new MovieBookingSystem();

        while (true) {
            System.out.println("\n===== Movie Ticket Booking =====");
            bookingSystem.showAvailableSeats();
            System.out.print("\nEnter seat number to book (or type 'exit' to quit): ");
            String seat = sc.nextLine().toUpperCase();

            if (seat.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Movie Booking System!");
                break;
            }

            try {
                bookingSystem.bookSeat(seat);
            } catch (InvalidSeatException e) {
                System.out.println(e.getMessage());
            } catch (SeatAlreadyBookedException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}

