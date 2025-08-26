package control_flow;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		number=sc.nextInt();
		if(number<= 0) {
            System.out.println("Invalid natural number");
        }else{
        	for(int i=1;i<=number;i++) {
                if (i%2==0) {
                    System.out.printf("%d is an even number%n",i);
                }else{
                    System.out.printf("%d is an odd number%n",i);
                }
            }
        }


	}

}
