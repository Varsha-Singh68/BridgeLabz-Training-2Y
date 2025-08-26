package control_flow;
import java.util.*;

public class BmiCalculator {

	public static void main(String[] args) {
		double weight,heightCm,heightMeter,bmi;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter weight (kg): ");
        weight=sc.nextDouble();
        System.out.print("Enter height in cm: ");
        heightCm=sc.nextDouble();
        heightMeter=heightCm/100;
        bmi=weight/(heightMeter*heightMeter);
        System.out.printf("Your BMI is: %.2f%n",bmi);
        if(bmi<=18.4)
            System.out.println("Status:Underweight");
        else if(bmi<=24.9)
            System.out.println("Status:Normal");
        else if(bmi<=39.9)
            System.out.println("Status:Overweight");
        else
            System.out.println("Status:Obese");
        

	}

}
