package control_flow;
import java.util.*;

public class DivisibilityBy5 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		num=sc.nextInt();
		if (num%5==0)
			System.out.printf("Is the number %d divisible by 5? Yes",num);
		else
			System.out.printf("Is the number %d divisible by 5? No",num);

	}

}
