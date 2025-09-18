package keywords;

class BankAccount {
	private static String bankName = "HDFC";
	private static int totalAccounts = 0;
	private String accountHolderName;
	private final String accountNumber;
	private double balance;

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++;
	}

	public static void getTotalAccounts() {
		System.out.println("Total Accounts: " + totalAccounts);
	}

	public void displayAccountDetails() {
		if (this instanceof BankAccount) {
			System.out.println("Account Details ");
			System.out.println("Bank Name: " + bankName);
			System.out.println("Account Holder: " + accountHolderName);
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Balance: " + balance);
			
		} else {
			System.out.println("Invalid object. Not a BankAccount.");
		}
	}
	public static void setBankName(String newBankName) {
		bankName = newBankName;
	}
}
public class BankAccountSystem {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("Varsha", "HDFC12345", 3263.0);
		BankAccount acc2 = new BankAccount("Riya", "HDFC67890", 6569.0);
		acc1.displayAccountDetails();
		acc2.displayAccountDetails();
		BankAccount.getTotalAccounts();
		BankAccount.setBankName("SBI");
		System.out.println("\nAfter Changing Bank Name:");
		acc1.displayAccountDetails();
	}
}

