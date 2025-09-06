package Methods;
import java.util.*;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=findSum(n);
        System.out.println("Sum of "+n+" natural numbers="+result);
		
	}
	
	public static int findSum(int n){
		int sum=0;
	    for(int i=1;i<=n;i++)
	    	sum+=i;
	    return sum;
	}
	

}
