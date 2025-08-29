package Arrays;
import java.util.*;

public class MeanHeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double heightArr[]=new double[11];
        double sum=0.0;
        for(int i=0;i<heightArr.length;i++){
            System.out.print("Enter height of player "+(i+1)+"=");
            heightArr[i]=sc.nextDouble();
            sum+=heightArr[i];
        }
        double mean=sum/11;
        System.out.printf("Mean height of football team= %.2f",mean);

	}

}
