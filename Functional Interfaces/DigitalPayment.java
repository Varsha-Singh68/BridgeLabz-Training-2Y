package functional_interface;

interface Payment {
    void pay();
    default void paymentDone() {
        System.out.println("Payment completed successfully.");
    }
}

public class DigitalPayment {
    public static void main(String[] args) {

        Payment upi = () -> System.out.println("Payment done through UPI.");
        Payment creditCard = () -> System.out.println("Payment done through Credit Card.");
        Payment wallet = () -> System.out.println("Payment done through Digital Wallet.");

        upi.pay();
        upi.paymentDone();

        creditCard.pay();
        creditCard.paymentDone();

        wallet.pay();
        wallet.paymentDone();
    }
}
