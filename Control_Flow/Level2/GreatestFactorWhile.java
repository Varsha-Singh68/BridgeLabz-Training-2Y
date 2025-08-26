package control_flow;
import java.util.*;

public class GreatestFactorWhile {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();
        if(num<=1){
            System.out.println("No greatest factor");
        }else{
        	int greatestFactor=1;
            int i=num-1;
            while(i>=1){
                if(num%i==0){
                    greatestFactor=i;
                    break;
                }
                i--;
            }
            System.out.println("Greatest factor of "+num+" besides itself is: "+greatestFactor);
        }
	}

}
