package Programming_Elements;

import java.util.*;

public class BasicCalculator {

	public static void main(String[] args) {
		double number1,number2,add,subtract,divide,multiply;
		Scanner sc=new Scanner(System.in);
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		add=number1+number2;
		subtract=number1-number2;
		multiply=number1*number2;
		if(number2 !=0) {
			divide=number1/number2;
			System.out.printf("The addition,subtraction,multiplication and division value of 2 numbers %.2f and %.2f is %.2f,%.2f,%.2f,%.2f",number1,number2,add,subtract,multiply,divide);
		}
		else {
			System.out.println("Division is not possible");
		    System.out.printf("The addition,subtraction,multiplication of 2 numbers %.2f and %.2f is %.2f,%.2f,%.2f",number1,number2,add,subtract,multiply);
		}

	}

}
