package control_flow;
import java.util.*;

public class LeapYearLogical {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter year (>=1582): ");
        year=sc.nextInt();
        if(year>=1582){
            if((year%4==0 && year%100!=0) || (year%400==0))
                System.out.printf("%d is a leap year%n",year);
            else
                System.out.printf("%d is not a leap year%n",year);
        }
        else
        	System.out.printf("Year should be >=1582 according to Gregorian calendar%n");
        
	}

}
