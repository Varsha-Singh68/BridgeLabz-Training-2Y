package Programming_Elements;

public class ProfitPercentage {

	public static void main(String[] args) {
		double profitPercent;
		int sellingPrice=191;
		int costPrice=129;
		int profit=sellingPrice-costPrice;
		profitPercent=((double)profit/costPrice)*100;
		System.out.printf("The cost price is INR %d and selling price is INR %d%nThe profit is INR %d and the profit percentage is %.2f",costPrice,sellingPrice,profit,profitPercent);		

	}

}
