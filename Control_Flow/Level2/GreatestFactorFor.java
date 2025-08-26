package control_flow;
import java.util.*;

public class GreatestFactorFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        if(num<=1){
            System.out.println("No greatest factor");
        }else{
            int greatestFactor=1;
            for(int i=num-1;i>=1;i--){
                if(num%i==0){
                    greatestFactor=i;
                    break;
                }
            }
            System.out.println("Greatest factor of "+num+" besides itself is: "+greatestFactor);
        }
	}

}
