package control_flow;
import java.util.*;

public class NumberOfDigits {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer: ");
        num=sc.nextInt();
        int count=0;
        if(num==0)
            count=1;
        else{
            while(num!=0){
                num/=10;
                count++;
            }
        }
        System.out.printf("number of digits: %d%n",count);
	}

}
