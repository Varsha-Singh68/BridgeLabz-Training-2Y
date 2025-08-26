package control_flow;

import java.util.*;

public class SpringSeason {

	public static void main(String[] args) {
		int month,day;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter month: ");
		month=sc.nextInt();
		System.out.print("Enter day: ");
		day=sc.nextInt();
		boolean check=false;
		if (month==3) {
			if (day>=20&& day<=31)
				check=true;
		}
		else if(month==4) {
			if (day>=1 && day<=30)
				check=true;
		}
		else if(month==5) {
			if(day>=1 && day<=31)
				check=true;
		}
		else if (month==6) {
			if (day>=1 && day<=20)
				check=true;
		}
		if (check==true) System.out.println("It's a spring season.");
		else System.out.println("Not a Spring Season");

	}

}
