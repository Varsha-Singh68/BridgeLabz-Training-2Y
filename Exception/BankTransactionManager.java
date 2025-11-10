package exception_handling;

import java.util.Scanner;

class AccountNotFoundException extends Exception {
 public AccountNotFoundException(String message) {
     super(message);
 }
}

class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

public class BankTransactionManager {

 public void verifyAccount(String accountNumber) throws AccountNotFoundException {
     if (!accountNumber.equals("12345")) {
         throw new AccountNotFoundException("Account number " + accountNumber + " not found.");
     } else {
         System.out.println("Account verified successfully.");
     }
 }

 public void processTransaction(double balance, double amount) throws InsufficientFundsException {
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient balance for this transaction.");
     } else {
         System.out.println("Transaction of " + amount + " completed successfully.");
     }
 }


 public void executeTransaction(String accountNumber, double balance, double amount) throws Exception {
     verifyAccount(accountNumber);
     processTransaction(balance, amount);
 }


 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     BankTransactionManager bank = new BankTransactionManager();

     try {
         System.out.print("Enter account number: ");
         String account = sc.nextLine();

         System.out.print("Enter current balance: ");
         double balance = sc.nextDouble();

         System.out.print("Enter transaction amount: ");
         double amount = sc.nextDouble();

         bank.executeTransaction(account, balance, amount);

     } catch (AccountNotFoundException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected Error: " + e.getMessage());
     } finally {
         System.out.println("Transaction complete.");
     }

     sc.close();
 }
}

