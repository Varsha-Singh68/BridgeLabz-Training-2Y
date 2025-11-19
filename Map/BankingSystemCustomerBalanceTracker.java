package map;

import java.util.*;

public class BankingSystemCustomerBalanceTracker {
    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        accounts.put("ACC101", 5000.0);
        accounts.put("ACC102", 12000.0);
        accounts.put("ACC103", 7500.0);
        accounts.put("ACC104", 3000.0);
        accounts.put("ACC105", 15000.0);

        accounts.put("ACC101", accounts.get("ACC101") + 2000);
        accounts.put("ACC104", accounts.get("ACC104") + 1000);

        double withdrawAmount = 8000;
        if (accounts.get("ACC103") >= withdrawAmount)
            accounts.put("ACC103", accounts.get("ACC103") - withdrawAmount);

        withdrawAmount = 40000;
        if (accounts.get("ACC105") >= withdrawAmount)
            accounts.put("ACC105", accounts.get("ACC105") - withdrawAmount);
        else
            System.out.println("Withdrawal denied for ACC105: insufficient balance");

        List<Map.Entry<String, Double>> sorted = new ArrayList<>(accounts.entrySet());
        sorted.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("\nAccounts sorted by descending balance:");
        for (Map.Entry<String, Double> e : sorted) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        System.out.println("\nTop 3 Customers:");
        for (int i = 0; i < 3 && i < sorted.size(); i++) {
            System.out.println(sorted.get(i).getKey() + " → " + sorted.get(i).getValue());
        }
    }
}

