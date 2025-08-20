package Programming_Elements;

import java.util.*;

public class KilometerToMiles {

	public static void main(String[] args) {
		double km;
		Scanner sc=new Scanner(System.in);
		System.out.print("distance in km= ");
		km=sc.nextInt();
		double miles=km/1.6;
		System.out.printf("The total miles is %.2f mile for the given %.2f km",miles,km);
	}

}
