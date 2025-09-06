package Methods;
import java.util.*;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int result=checkNumber(num);
        if(result==1)
            System.out.println("The no. is positive");
        else if(result==-1)
            System.out.println("The no. is negative");
        else
            System.out.println("The no. is zero");
        
    }

    public static int checkNumber(int n){
        if (n>0)
            return 1;
        else if (n<0)
            return -1;
        else
            return 0;
    }
}


