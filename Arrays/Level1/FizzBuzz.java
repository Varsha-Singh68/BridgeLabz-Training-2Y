package Arrays;
import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number=");
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Not positive integer");
            return;
        }
        String resultArr[]=new String[num+1];
        for(int i=0;i<=num;i++){
            if(i==0) resultArr[i]="0";
            else if(i%3==0 && i%5==0) resultArr[i]="FizzBuzz";
            else if(i%3==0) resultArr[i]="Fizz";
            else if(i%5==0) resultArr[i]="Buzz";
            else resultArr[i]=String.valueOf(i);
        }
        for(int i=0;i<=num;i++){
            System.out.println("Position "+i+" = "+resultArr[i]);
        }

	}

}
