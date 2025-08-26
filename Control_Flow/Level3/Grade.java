package control_flow;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		int physics,chemistry,maths;
		double average;
		char grade;
		String remarks;
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        physics=sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        chemistry=sc.nextInt();
        System.out.print("Enter Maths marks: ");
        maths=sc.nextInt();
        average=(physics+chemistry+maths)/3.0;
        if(average>=80){
            grade='A';
            remarks="Level 4, above agency-normalized standards";
        }else if(average>=70){
            grade='B';
            remarks="Level 3, at agency-normalized standards";
        }else if(average>=60){
            grade='C';
            remarks="Level 2, below, but approaching agency-normalized standards";
        }else if(average>=50){
            grade='D';
            remarks="Level 1, well below agency-normalized standards";
        }else if(average>=40){
            grade='E';
            remarks="Level 1-, too below agency-normalized standards";
        }else{
            grade='R';
            remarks="Remedial standards";
        }

        System.out.printf("average marks: %.2f%n",average);
        System.out.printf("grade: %c%n",grade);
        System.out.printf("remarks: %s%n",remarks);
	}

}
