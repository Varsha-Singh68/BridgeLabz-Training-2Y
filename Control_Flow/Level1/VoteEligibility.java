package control_flow;
import java.util.*;

public class VoteEligibility {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age: ");
		age=sc.nextInt();
		if (age>=18) System.out.printf("The person's age is %d and can vote",age);
		else System.out.printf("The person's age is %d and cannot vote",age);
		
	
		

	}

}
