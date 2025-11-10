package exception_handling;

import java.util.*;

class OutOfStockException extends Exception {
 public OutOfStockException(String message) {
     super(message);
 }
}

class PaymentFailedException extends Exception {
 public PaymentFailedException(String message) {
     super(message);
 }
}


class OnlineOrder {
 public void placeOrder() throws OutOfStockException, PaymentFailedException {
     Random rand = new Random();
     int status = rand.nextInt(3); 

     if (status == 0) {
         throw new OutOfStockException("Sorry, the product is out of stock.");
     } else if (status == 1) {
         throw new PaymentFailedException("Payment failed! Please try again.");
     } else {
         System.out.println("Order placed successfully! Thank you for shopping with us.");
     }
 }
}

public class OnlineOrderProcessing {
 public static void main(String[] args) {
     OnlineOrder order = new OnlineOrder();

     try {
         order.placeOrder();
     } catch (OutOfStockException e) {
         System.out.println(e.getMessage());
     } catch (PaymentFailedException e) {
         System.out.println(e.getMessage());
     } finally {
         System.out.println("Order process complete. Have a nice day!");
     }
 }
}

