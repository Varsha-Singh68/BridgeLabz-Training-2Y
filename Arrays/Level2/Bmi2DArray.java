package Arrays;
import java.util.*;

public class Bmi2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n=sc.nextInt();
        double personData[][]=new double[n][3];
        String weightStatus[]=new String[n];
        for(int i=0;i<n;i++){
            double weight,height;
            do{
                System.out.print("Enter weight of person "+(i+1)+": ");
                weight=sc.nextDouble();
            }while(weight<=0);

            do{
                System.out.print("Enter height of person "+(i+1)+" in meters: ");
                height=sc.nextDouble();
            }while(height<=0);
            double bmi=weight/(height*height);
            personData[i][0]=height;
            personData[i][1]=weight;
            personData[i][2]=bmi;
            if(bmi<=18.4)
                weightStatus[i]="Underweight";
            else if(bmi<=24.9)
                weightStatus[i]="Normal";
            else if(bmi<=39.9)
                weightStatus[i]="Overweight";
            else
                weightStatus[i]="Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for(int i=0;i<n;i++){
            System.out.println(personData[i][0]+"\t"+personData[i][1]+"\t"+personData[i][2]+"\t"+weightStatus[i]);
        }

	}

}
