package Arrays;
import java.util.*;

public class BmiCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of person: ");
        int n=sc.nextInt();

        double weightArr[]=new double[n];
        double heightArr[]=new double[n];
        double bmiArr[]=new double[n];
        String statusArr[]=new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter weight of person "+(i+1)+"= ");
            weightArr[i]=sc.nextDouble();
            System.out.print("Enter height of person "+(i+1)+" in meters= ");
            heightArr[i]=sc.nextDouble();
        }

        for(int i=0;i<n;i++){
            bmiArr[i]=weightArr[i]/(heightArr[i]*heightArr[i]);
            if(bmiArr[i]<=18.4)
                statusArr[i]="Underweight";
            else if(bmiArr[i]<=24.9)
                statusArr[i]="Normal";
            else if(bmiArr[i]<=39.9)
                statusArr[i]="Overweight";
            else
                statusArr[i]="Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for(int i=0;i<n;i++){
            System.out.println(heightArr[i]+"\t"+weightArr[i]+"\t"+bmiArr[i]+"\t"+statusArr[i]);
        }

	}

}
