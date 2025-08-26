package control_flow;
import java.util.*;

public class SmallestNumber {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		num1=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		num2=sc.nextInt();
		System.out.print("Enter 3rd number: ");
		num3=sc.nextInt();
		if (num1<=num2 && num1<=num3)
			System.out.println("Is the first number the smallest? Yes");
		else
			System.out.println("Is the first number the smallest? No");
		
		

	}

}
