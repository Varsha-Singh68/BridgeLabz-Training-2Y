package object_relationships;

import java.util.*;

class Account {
    private long accountNumber;
    private double balance;
    public Account(long accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber() + " Balance: " + acc.getBalance());
        }
        System.out.println();
    }
}

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    private long nextAccountNumber = 1000000001L;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public Customer addCustomer(String name) {
        Customer customer = new Customer(name);
        customers.add(customer);
        return customer;
    }

    public void openAccount(Customer customer, double initialBalance) {
        Account account = new Account(nextAccountNumber++, initialBalance);
        customer.addAccount(account);
    }

    public void displayCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer c : customers) {
            System.out.println(c.getName());
        }
        System.out.println();
    }
}

public class Bank_AccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("ICICI Bank");
        Customer c1 = bank.addCustomer("Varsha");
        Customer c2 = bank.addCustomer("Riya");
        bank.openAccount(c1, 100);
        bank.openAccount(c1, 1000);
        bank.openAccount(c2, 2000);
        bank.displayCustomers();
        c1.viewBalances();
        c2.viewBalances();
    }
}
