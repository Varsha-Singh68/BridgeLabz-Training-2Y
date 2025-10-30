package functional_interface;

interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed successfully (default method).");
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Paytm.");
    }
}

class GooglePay implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Google Pay.");
    }

    public void refund(double amount) {
        System.out.println("Refund of " + amount + " processed via Google Pay.");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {

        PaymentProcessor paytm = new Paytm();
        PaymentProcessor gpay = new GooglePay();

        paytm.pay(500);
        paytm.refund(200);

        gpay.pay(1000);
        gpay.refund(300);
    }
}

