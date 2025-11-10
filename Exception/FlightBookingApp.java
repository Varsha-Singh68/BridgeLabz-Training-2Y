package exception_handling;

import java.util.Scanner;

class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

public class FlightBookingApp {
    public void checkSeatAvailability(String seatNo) throws SeatUnavailableException {
        if (seatNo.equalsIgnoreCase("A1") || seatNo.equalsIgnoreCase("B2")) {
            throw new SeatUnavailableException("Seat " + seatNo + " is already booked.");
        } else {
            System.out.println("Seat " + seatNo + " is available.");
        }
    }

    public void processPayment(double amount) throws PaymentFailedException {
        if (amount < 500) {
            throw new PaymentFailedException("Payment failed: Amount too low.");
        } else {
            System.out.println("Payment of " + amount + " processed successfully.");
        }
    }

    public void bookTicket(String seatNo, double amount) throws Exception {
        checkSeatAvailability(seatNo);
        processPayment(amount);
        System.out.println("Ticket booked successfully for seat " + seatNo + "!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightBookingApp booking = new FlightBookingApp();

        try {
            System.out.print("Enter seat number: ");
            String seat = sc.nextLine();

            System.out.print("Enter payment amount: ");
            double amount = sc.nextDouble();

            booking.bookTicket(seat, amount);

        } catch (SeatUnavailableException e) {
            System.out.println("Booking Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Payment Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }

        sc.close();
    }
}

