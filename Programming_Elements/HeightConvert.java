package Programming_Elements;

import java.util.*;

public class HeightConvert {

	public static void main(String[] args) {
		double heightInCm,inch,remainedInches;
		int feet;
		Scanner sc=new Scanner(System.in);
		System.out.print("height in centimeters= ");
		heightInCm=sc.nextDouble();
		inch=heightInCm/2.54;
		feet=(int)(inch/12);
		remainedInches= inch%12;
		System.out.printf("your height in cm is %.2f while in feet is %d and inches is %.2f",heightInCm,feet,remainedInches);
		
		
		
		
		
		

	}

}
