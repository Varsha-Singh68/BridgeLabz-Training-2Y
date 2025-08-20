package Programming_Elements;

import java.util.*;

public class FeesDiscount {

	public static void main(String[] args) {
		double fee,discountPercent;
		Scanner sc=new Scanner(System.in);
		System.out.print("university fees= ");
		fee=sc.nextInt();
		System.out.print("discount percent= ");
		discountPercent=sc.nextInt();
		double discount=(discountPercent*fee)/100;
		double discountedFee=fee-discount;
		System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f",discount,discountedFee);
		
	}

}
