package control_flow;
import java.util.*;

public class FactorsWhile {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        num=sc.nextInt();
        if (num<=0)
            System.out.println("Invalid positive integer");
        else{
        	System.out.println("Factors of "+num+":");
            int i=1;
            while(i<=num){
                if(num%i==0){
                    System.out.println(i);
                }
                i++;
            }
        }
        
	}

}
