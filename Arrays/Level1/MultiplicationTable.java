package Arrays;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number= ");
        int num=sc.nextInt();
        int tableArr[]=new int[10];
        for(int i=1;i<=10;i++)
            tableArr[i-1]=num*i;
        for(int i=1;i<=10;i++)
            System.out.printf("%d * %d = %d%n",num,i,tableArr[i-1]);
        
		

	}

}
