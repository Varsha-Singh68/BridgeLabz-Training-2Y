package Arrays;
import java.util.*;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int numArr[]=new int[5];
        System.out.println("Enter 5 number= ");
        for (int i=0;i<numArr.length;i++) 
        	numArr[i]=sc.nextInt();
        for (int i=0;i<numArr.length;i++){
            int num=numArr[i];
            if(num>0){
                if(num%2==0) 
                    System.out.printf("%d is positive and even%n",num);
                else 
                    System.out.printf("%d is positive and odd%n",num);
            }
            else if(num<0) 
                System.out.printf("%d is negative%n",num);
            else 
                System.out.printf("%d is zero%n",num);
            
        }

        
        int first=numArr[0];
        int last=numArr[numArr.length-1];
        if(first==last)
            System.out.println("The first and last elements are equal");
        else if (first > last)
            System.out.printf("The first element %d is greater than last element %d%n",first,last);
        else
            System.out.printf("The first element %d is less than last element %d%n",first,last);
        

		
		

	}

}
