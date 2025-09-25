package inheritance;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account -> Account Number: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account -> Account Number: " + accountNumber + ", Balance: " + balance + ", Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int depositTerm;

    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account -> Account Number: " + accountNumber + ", Balance: " + balance + ", Deposit Term: " + depositTerm + " years");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA1001", 15000, 5.0);
        CheckingAccount checking = new CheckingAccount("CA2001", 10000, 5000);
        FixedDepositAccount fd = new FixedDepositAccount("FD3001", 50000, 3);

        savings.displayAccountType();
        checking.displayAccountType();
        fd.displayAccountType();
    }
}

