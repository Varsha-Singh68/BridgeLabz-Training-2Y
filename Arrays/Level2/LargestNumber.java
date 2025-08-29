package Arrays;
import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int maxDigit=10;
        int digitsArr[]=new int[maxDigit];
        int index=0;

        while(num!=0){
            int digit=num%10;
            digitsArr[index]=digit;
            index++;
            if(index==maxDigit) break;
            num/=10;
        }

        int largest=0,secondLargest=0;
        for(int i=0;i<index;i++){
            if(digitsArr[i]>largest){
                secondLargest=largest;
                largest=digitsArr[i];
            }else if(digitsArr[i]>secondLargest && digitsArr[i]!=largest)
                secondLargest=digitsArr[i];
            
        }

        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+secondLargest);
	}

}
