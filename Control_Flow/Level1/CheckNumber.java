package control_flow;
import java.util.*;

public class CheckNumber {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		number=sc.nextInt();
		if (number>0) System.out.printf("Positive");
		else if (number<0) System.out.printf("Negative");
		else System.out.printf("Zero");
		
		
		
		

	}

}
