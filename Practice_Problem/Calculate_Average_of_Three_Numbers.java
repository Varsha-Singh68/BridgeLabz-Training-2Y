package practice;
import java.util.*;

public class Calculate_Average_of_Three_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("1st no.= ");
		int a=sc.nextInt();
		System.out.print("2nd no.= ");
		int b=sc.nextInt();
		System.out.print("3rd no.= ");
		int c=sc.nextInt();
		float avg=(a+b+c)/3;
		System.out.println("Average of three numbers= "+avg);
	}

}
