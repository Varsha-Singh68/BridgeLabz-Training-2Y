package com.bridgelabz.oops.leveltwo;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    public MovieTicket() {
        this.movieName = "Not Booked";
        this.seatNumber = "N/A";
        this.price = 0.0;
    }
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public double getPrice() {
        return price;
    }
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for " + movieName + "!");
    }
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        System.out.println("Initial Ticket Details:");
        ticket.displayTicketDetails();
        System.out.println("\nBooking ticket...");
        ticket.bookTicket("Baahubali", "C60", 300);
        System.out.println("\nBooked Ticket Details:");
        ticket.displayTicketDetails();
    }
}
