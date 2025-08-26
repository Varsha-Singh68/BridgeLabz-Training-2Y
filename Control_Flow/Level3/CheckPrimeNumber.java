package control_flow;
import java.util.*;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();
        boolean isPrime=true;
        if(num<=1)
            isPrime=false; 
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
            System.out.printf("%d is prime number%n",num);
        else
            System.out.printf("%d is not prime number%n",num);
	}

}
