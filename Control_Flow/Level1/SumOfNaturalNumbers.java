package control_flow;
import java.util.*;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int num,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		num=sc.nextInt();
		if (num>=1) {
			sum=num*(num+1)/2;
		    System.out.printf("The sum of %d natural numbers is %d",num,sum);
		}
		else System.out.printf("The number %d is not a natural number",num);
		  
		
		

	}

}
