package exception_handling;

import java.util.*;

class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

class ATM {
 private int balance = 10000; 

 public void withdraw(int amount) throws InsufficientFundsException {
     if (amount > balance) {
         throw new InsufficientFundsException("Error: Insufficient funds! Available balance: ₹" + balance);
     } else if (amount <= 0) {
         throw new InsufficientFundsException("Error: Invalid withdrawal amount.");
     } else {
         balance -= amount;
         System.out.println("Withdrawal successful! Amount withdrawn: ₹" + amount);
         System.out.println("Remaining balance: ₹" + balance);
     }
 }
}

public class AtmWithdrawalSystem {
 public static void main(String[] args) {
     ATM atm = new ATM();

     try {
         atm.withdraw(12000); 
     } catch (InsufficientFundsException e) {
         System.out.println(e.getMessage());
     }

     System.out.println("Transaction complete.");
 }
}

