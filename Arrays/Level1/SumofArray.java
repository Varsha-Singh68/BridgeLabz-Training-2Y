package Arrays;
import java.util.*;

public class SumofArray {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        double arr[]=new double[10];
        double total=0.0;
        int index=0;
        while(true){
            System.out.print("Enter number= ");
            double num=sc.nextDouble();
            if(num<= 0 || index==10) break;
            arr[index]=num;
            index++;
        }
        for(int i=0;i<index;i++){
            System.out.println("Number "+(i+1)+"="+arr[i]);
            total+=arr[i];
        }
        System.out.println("Sum of all numbers= "+total);
		

	}

}
