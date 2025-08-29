package Arrays;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        int digitsArr[] = new int[count];
        temp=num;
        for(int i=count-1;i>=0;i--){
            digitsArr[i]=temp%10;
            temp/=10;
        }
        int reversedArr[]=new int[count];
        for(int i=0;i<count;i++) 
            reversedArr[i]=digitsArr[count-1-i];
        
        System.out.print("Reversed number: ");
        for(int i=0;i<reversedArr.length;i++)
            System.out.print(reversedArr[i]);
        

	}

}
