package control_flow;
import java.util.*;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		double first,second,result;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        first=sc.nextDouble();
        System.out.print("Enter second number: ");
        second=sc.nextDouble();
        System.out.print("Enter operator(+,-,*,/): ");
        String op=sc.next();
        switch(op){
            case "+": result=first+second; System.out.println("Result: "+result); break;
            case "-": result=first-second; System.out.println("Result: "+result); break;
            case "*": result=first*second; System.out.println("Result: "+result); break;
            case "/": if(second!=0){result=first/second; System.out.println("Result: "+result);} 
                      else System.out.println("Division by zero"); break;
            default: System.out.println("Invalid Operator");
        }

	}

}
