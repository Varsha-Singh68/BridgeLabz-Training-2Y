package constructors;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        double rate;
        switch (carModel.toLowerCase()) {
            case "suv": rate = 3000; break;
            case "sedan": rate = 2000; break;
            case "hatchback": rate = 1500; break;
            default: rate = 1000;
        }
        return rate * rentalDays;
    }

    public void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        System.out.println("Default Rental:");
        r1.displayRental();

        System.out.println();

        CarRental r2 = new CarRental("Varsha", "SUV", 5);
        System.out.println("Custom Rental:");
        r2.displayRental();
    }
}
