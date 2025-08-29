package Arrays;
import java.util.*;

public class OddEvenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter natural number=");
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Error: Enter natural number (greater than 0)");
            return;
        }
        int oddArr[]=new int[num/2+1];
        int evenArr[]=new int[num/2+1];
        int oddIndex=0,evenIndex=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                evenArr[evenIndex]=i;
                evenIndex++;
            }else{
                oddArr[oddIndex]=i;
                oddIndex++;
            }
        }
        System.out.print("Even numbers= ");
        for(int i=0;i<evenIndex;i++){
            System.out.print(evenArr[i]+" ");
        }
        System.out.println();
        System.out.print("Odd numbers= ");
        for(int i=0;i<oddIndex;i++){
            System.out.print(oddArr[i]+" ");
        }
        System.out.println();

	}

}
