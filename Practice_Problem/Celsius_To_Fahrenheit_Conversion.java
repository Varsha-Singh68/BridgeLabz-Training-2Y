package practice;
import java.util.*;

public class Celsius_To_Fahrenheit_Conversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("temperature  in celsius= ");
		float c=sc.nextInt();
		float f=(c*9/5)+32;
		System.out.println("temperatue in fahrenheit= "+f);
		

	}

}
