package Arrays;
import java.util.*;
public class VoteEligibility{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ageArr[]=new int[10];
		System.out.println("Enter age of 10 students= ");
        for (int i=0;i<ageArr.length;i++)
            ageArr[i]=sc.nextInt();
        for(int i=0;i<ageArr.length;i++){
            int age= ageArr[i];
            if(age<0)
                System.out.println("Invalid age");
            else if(age>=18)
                System.out.printf("The student with age %d can vote%n",age);
            else
                System.out.printf("The student with age %d cannot vote%n",age);
		
            
        }

}
    }


