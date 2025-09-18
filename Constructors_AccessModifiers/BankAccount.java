package constructors;
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (via getter): ₹" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Alice", 50000);
        b1.displayAccountDetails();
        System.out.println();

        b1.setBalance(55000);
        System.out.println("After Balance Update:");
        b1.displayAccountDetails();
        System.out.println();

        SavingsAccount s1 = new SavingsAccount(201, "Bob", 75000, 4.5);
        s1.displaySavingsDetails();
    }
}
