package collection;

import java.util.*;

class Account {
    String accountId;
    String name;

    public Account(String accountId, String name) {
        this.accountId = accountId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account a = (Account) o;
        return Objects.equals(accountId, a.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public String toString() {
        return accountId + " - " + name;
    }
}

class Transaction {
    int transactionId;
    String accountId;
    double amount;

    public Transaction(int transactionId, String accountId, double amount) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "T" + transactionId + " | Acc:" + accountId + " | Amt:" + amount;
    }
}

public class BankingTransactionSystem {

    public static void main(String[] args) {

        List<Transaction> allTransactions = new ArrayList<>();
        Queue<Transaction> pending = new LinkedList<>();
        Stack<Transaction> rollbackStack = new Stack<>();
        Set<Account> validAccounts = new HashSet<>();

        validAccounts.add(new Account("A01", "Aarav"));
        validAccounts.add(new Account("A02", "Meera"));
        validAccounts.add(new Account("A03", "Rohan"));

        pending.add(new Transaction(1, "A01", 5000));
        pending.add(new Transaction(2, "A02", 2000));
        pending.add(new Transaction(3, "A99", 1500));
        pending.add(new Transaction(4, "A03", 8000));

        System.out.println("Transactions in Queue:");
        pending.forEach(System.out::println);

        System.out.println("\nProcessing Transactions:");
        while (!pending.isEmpty()) {
            Transaction t = pending.poll();

            boolean valid = validAccounts.stream()
                    .anyMatch(a -> a.accountId.equals(t.accountId));

            if (valid) {
                System.out.println("Executed: " + t);
                allTransactions.add(t);
                rollbackStack.push(t);
            } else {
                System.out.println("Invalid Account Skipped: " + t);
            }
        }

        System.out.println("\nRolling Back Last Transaction:");
        if (!rollbackStack.isEmpty()) {
            Transaction last = rollbackStack.pop();
            System.out.println("Rolled Back: " + last);
        }

        System.out.println("\nFinal Transaction History:");
        allTransactions.forEach(System.out::println);
    }
}

