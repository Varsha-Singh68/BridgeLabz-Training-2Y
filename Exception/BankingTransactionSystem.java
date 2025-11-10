package exception_handling;

import java.util.Random;


class NegativeAmountException extends Exception {
 public NegativeAmountException(String message) {
     super(message);
 }
}


class InsufficientFundsException1 extends Exception {
 public InsufficientFundsException1(String message) {
     super(message);
 }
}


class NetworkFailureException extends Exception {
 public NetworkFailureException(String message) {
     super(message);
 }
}


class Transaction {
 private double balance = 5000; 

 
 public void processTransaction(double amount)
         throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

     Random random = new Random();
     int outcome = random.nextInt(3); 

     if (amount < 0) {
         throw new NegativeAmountException("Transaction failed: Negative amount entered!");
     } else if (amount > balance) {
         throw new InsufficientFundsException("Transaction failed: Insufficient balance!");
     } else if (outcome == 1) {
         throw new NetworkFailureException("Transaction failed: Network connection lost!");
     } else {
         balance -= amount;
         System.out.println("Transaction successful!");
         System.out.println("Amount debited: ₹" + amount);
         System.out.println("Remaining balance: ₹" + balance);
     }
 }
}

public class BankingTransactionSystem {
 public static void main(String[] args) {
     Transaction transaction = new Transaction();
     java.util.Scanner sc = new java.util.Scanner(System.in);

     System.out.print("Enter transaction amount: ");
     double amount = sc.nextDouble();

     try {
         transaction.processTransaction(amount);
     } catch (NegativeAmountException e) {
         System.out.println(e.getMessage());
     } catch (InsufficientFundsException e) {
         System.out.println(e.getMessage());
     } catch (NetworkFailureException e) {
         System.out.println(e.getMessage());
     } finally {
         System.out.println("Thank you for banking with us!");
         sc.close();
     }
 }
}
