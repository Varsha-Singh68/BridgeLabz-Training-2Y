package Arrays;
import java.util.*;

public class FrequencyOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        long num=sc.nextLong();
        long temp=num;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int arr[]=new int[count];
        temp=num;
        for(int i=count-1;i>=0;i--){
            arr[i]=(int)(temp%10);
            temp/=10;
        }
        int freq[]=new int[10];
        for(int i=0;i<count;i++)
            freq[arr[i]]++;
        
        
        System.out.println("Digit frequencies:");
        for(int i=0;i<10;i++)
            if(freq[i]>0)
                System.out.println(i+" occurs "+freq[i]+" times");

	}

}
