package Programming_Elements;
import java.util.*;

public class DistanceConvertYardsMiles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double feet=sc.nextDouble();
		double yard=(1.0/3.0)*feet;
		double mile=1760*yard;
		System.out.print("The distance in feet is "+feet+" while in yard is "+yard+" and mile is "+ mile);

	}

}