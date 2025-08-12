package practice;
import java.util.*;

public class Calculate_SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter principal= ");
		int p=sc.nextInt();
		System.out.print("enter rate= ");
		int r=sc.nextInt();
		System.out.print("enter time= ");
		int t=sc.nextInt();
		float si=(p*r*t)/100;
		System.out.println("simple interest= "+si);
		

	}

}
