package functional_interface;

interface VehicleRental {
 void rent();  

 default void returnVehicle() {
     System.out.println("Vehicle returned successfully.");
 }
}

public class MultiVehicleRentalSystem {
 public static void main(String[] args) {
	 VehicleRental car = () -> System.out.println("Car has been rented.");
     VehicleRental bike = () -> System.out.println("Bike has been rented.");
     VehicleRental bus = () -> System.out.println("Bus has been rented.");
     car.rent();
     car.returnVehicle();

     bike.rent();
     bike.returnVehicle();

     bus.rent();
     bus.returnVehicle();
 }
}

