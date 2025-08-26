package control_flow;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num;
		 Scanner sc=new Scanner(System.in);
	     System.out.print("Enter a number: ");
	     num=sc.nextInt();
	     int originalNum=num,sum=0;
	     while(originalNum!=0){
	    	 int digit=originalNum%10;
	            sum+=digit*digit*digit;
	            originalNum/=10;
	        }
	        if(sum==num)
	            System.out.printf("%d is armstrong number%n",num);
	        else
	            System.out.printf("%d is not armstrong number%n",num);
	 }

}
