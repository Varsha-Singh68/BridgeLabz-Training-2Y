package Programming_Elements;

public class DiscountedFees {

	public static void main(String[] args) {
		double fees=125000;
		double discountPercent=10;
		double discount=(discountPercent*fees)/100;
		double discountedFees=fees-discount;
		System.out.printf("The discount amount is INR %.2f and final discounted fees is INR %.2f",discount,discountedFees );

	}

}
