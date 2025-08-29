package Arrays;
import java.util.*;

public class YoungestTallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String nameArr[]={"Amar","Akbar","Anthony"};
        int ageArr[]=new int[3];
        double heightArr[]=new double[3];

        for(int i=0;i<3;i++){
            System.out.print("Enter age of "+nameArr[i]+": ");
            ageArr[i]=sc.nextInt();
            System.out.print("Enter height of "+nameArr[i]+": ");
            heightArr[i]=sc.nextDouble();
        }

        int youngIndex=0,tallIndex=0;
        for(int i=1;i<3;i++){
            if(ageArr[i]<ageArr[youngIndex]) youngIndex=i;
            if(heightArr[i]>heightArr[tallIndex]) tallIndex=i;
        }

        System.out.println("Youngest Friend: "+nameArr[youngIndex]+" ,Age="+ageArr[youngIndex]);
        System.out.println("Tallest Friend: "+nameArr[tallIndex]+" ,Height="+heightArr[tallIndex]);


	}

}
