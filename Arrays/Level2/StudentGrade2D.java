package Arrays;
import java.util.*;

public class StudentGrade2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int[][] marks=new int[n][3];   
        double[] percentage=new double[n];
        char[] grade=new char[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter marks for Student "+(i+1));

            for(int j=0;j<3;j++){
                if(j==0) System.out.print("Physics: ");
                else if(j==1) System.out.print("Chemistry: ");
                else System.out.print("Maths: ");

                marks[i][j]=sc.nextInt();

                if(marks[i][j]<0){ 
                    System.out.println("Invalid! Re-enter.");
                    j--;   
                }
            }

            int total=marks[i][0]+marks[i][1]+marks[i][2];
            percentage[i]=(total/300.0)*100;

            if(percentage[i]>=80) grade[i]='A';
            else if(percentage[i]>=70) grade[i]='B';
            else if(percentage[i]>=60) grade[i]='C';
            else if(percentage[i]>=50) grade[i]='D';
            else if(percentage[i]>=40) grade[i]='E';
            else grade[i]='R';
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for(int i=0;i<n;i++){
            System.out.println(marks[i][0]+"\t"+marks[i][1]+"\t\t"+marks[i][2]+"\t"+String.format("%.2f",percentage[i])+"%\t\t"+grade[i]);
        }
	}
}