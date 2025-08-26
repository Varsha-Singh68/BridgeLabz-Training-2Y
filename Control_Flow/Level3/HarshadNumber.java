package control_flow;
import java.util.*;

public class HarshadNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();
        int numCopy=num,sum=0;
        while(numCopy!=0){
            sum+=numCopy%10;
            numCopy/=10;
        }
        if(num%sum==0)
            System.out.println("Harshad number");
        else
            System.out.println("Not a Harshad number");

	}

}
