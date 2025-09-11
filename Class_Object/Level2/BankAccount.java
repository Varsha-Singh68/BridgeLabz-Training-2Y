package com.bridgelabz.oops.leveltwo;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Varsha Singh", "ACC12345", 5000.0);
        System.out.println("Initial Account Details:");
        account.displayBalance();
        System.out.println("\nDepositing 2000...");
        account.deposit(2000);
        account.displayBalance();
        System.out.println("\nWithdrawing 3000...");
        account.withdraw(3000);
        account.displayBalance();
        System.out.println("\nTrying to withdraw 10000...");
        account.withdraw(10000);
        account.displayBalance();
    }
}
