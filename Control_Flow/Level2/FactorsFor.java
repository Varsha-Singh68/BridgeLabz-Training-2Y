package control_flow;
import java.util.*;

public class FactorsFor {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        num=sc.nextInt();
        if (num<=0)
            System.out.println("Invalid positive integer");
        else{
            System.out.printf("Factors of %d:%n",num);
            for (int i=1;i<=num;i++) {
                if (num%i==0) 
                    System.out.println(i);
            }
	    }
	}

}
