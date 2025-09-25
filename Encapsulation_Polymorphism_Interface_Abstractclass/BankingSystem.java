package encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited " + amount + ". New balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println(getHolderName() + " applied for a loan of " + amount + " in Savings Account.");
        } else {
            System.out.println(getHolderName() + " is not eligible for a loan.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: Savings, Interest Rate: " + interestRate);
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println(getHolderName() + " applied for a loan of " + amount + " in Current Account.");
        } else {
            System.out.println(getHolderName() + " is not eligible for a loan.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() + overdraftLimit >= 10000;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: Current, Overdraft Limit: " + overdraftLimit);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        BankAccount savings = new SavingsAccount("S001", "Alice", 8000, 0.04);
        BankAccount current = new CurrentAccount("C001", "Bob", 3000, 10000);

        accounts.add(savings);
        accounts.add(current);

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(5000);
                System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}

