package control_flow;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        num=sc.nextInt();
        for(int i=6;i<=9;i++){
            System.out.printf("%d * %d = %d%n",num,i,num*i);
        }


	}

}
