package control_flow;
import java.util.*;

public class SumOfNumbers {

	public static void main(String[] args) {
		double num,total;
		Scanner sc=new Scanner(System.in);
	    total=0.0;
		System.out.print("Enter number(0 for stop): ");
		num=sc.nextDouble();
		while(num!=0) {
			total+=num;
		    System.out.print("Enter number( 0 for stop): ");
		    num=sc.nextDouble();
		}
		System.out.printf("total sum= %.2f",total);
		    
		

	}

}
