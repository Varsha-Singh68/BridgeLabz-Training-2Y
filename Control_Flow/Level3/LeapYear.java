package control_flow;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        year=sc.nextInt();
        if(year<1582)
            System.out.printf("year must be >=1582 according to Gregorian calendar%n");
        else{
        	if(year%400==0)
                System.out.printf("%d is a leap year(first part)%n",year);
            else if(year%100==0)
                System.out.printf("%d is not a leap year(first part)%n",year);
            else if(year%4==0)
                System.out.printf("%d is a leap year(first part)%n",year);
            else
                System.out.printf("%d is not a leap year(first part)%n",year);
            

            if((year%4==0 && year%100!=0) || (year%400==0))
                System.out.printf("%d is a leap year(second part)%n",year);
            else
                System.out.printf("%d is not a leap year(second part)%n",year);
            
        }
        
	}

}
