package control_flow;
import java.util.*;

public class FizzBuzzWhile {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        if(num<=0)
            System.out.println("Not a positive integer");
        else{
            int i=1;
            while (i<=num) {
                if (i%3==0 && i%5==0)
                    System.out.println("FizzBuzz");
                else if(i%3==0)
                    System.out.println("Fizz");
                else if(i%5==0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
                i++; 
            }
        }


	}

}
