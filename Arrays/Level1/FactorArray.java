package Arrays;
import java.util.*;

public class FactorArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        int num=sc.nextInt();
        int maxFactor=10;
        int factorsArr[]=new int[maxFactor];
        int index=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(index==maxFactor){
                    maxFactor=maxFactor*2;
                    int temp[]=new int[maxFactor];
                    for(int j=0;j<factorsArr.length;j++){
                        temp[j]=factorsArr[j];
                    }
                    factorsArr=temp;
                }
                factorsArr[index]=i;
                index++;
            }
        }
        System.out.print("Factors of "+num+" are: ");
        for(int i=0;i<index;i++){
            System.out.print(factorsArr[i]+" ");
        }
        System.out.println();

	}

}
