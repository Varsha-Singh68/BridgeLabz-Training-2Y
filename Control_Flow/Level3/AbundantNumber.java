package control_flow;
import java.util.*;

public class AbundantNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum>num)
            System.out.println("Abundant number");
        else
            System.out.println("Not an Abundant number");
        
		

	}

}
