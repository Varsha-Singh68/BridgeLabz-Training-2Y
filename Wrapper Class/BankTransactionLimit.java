package wrapper_class;

public class BankTransactionLimit {

    public static double getRemainingLimit(Double dailyLimit, double amountUsed) {
        if (dailyLimit == null) {
            return 0.0;
        }
        return dailyLimit - amountUsed;
    }

    public static void main(String[] args) {
        Double newAccountLimit = 5000.0;
        double oldAccountLimit = 3000.0;

        double remaining1 = getRemainingLimit(newAccountLimit, 1200.0);
        double remaining2 = getRemainingLimit(oldAccountLimit, 500.0);
        double remaining3 = getRemainingLimit(null, 100.0);

        System.out.println("Remaining limit (new account): ₹" + remaining1);
        System.out.println("Remaining limit (old account): ₹" + remaining2);
        System.out.println("Remaining limit (null limit): ₹" + remaining3);
    }
}

