package practice;
import java.util.*;

public class Volume_of_Cylinder {

	public static void main(String[] args) {
		final double Pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter height= ");
		int h=sc.nextInt();
		System.out.print("enter radius= ");
		int r=sc.nextInt();
		double v=Pi*r*r*h;
		System.out.println("volume of cylinder= "+v);
		

	}

}
