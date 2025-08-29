package Arrays;
import java.util.*;

public class StudentGrades1D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int physics[]=new int[n];
        int chemistry[]=new int[n];
        int maths[]=new int[n];
        double percentage[]=new double[n];
        char grade[]=new char[n];

        for(int i=0;i<n;i++){
            System.out.println("\nEnter marks for Student "+(i+1));

            System.out.print("Physics: ");
            physics[i]=sc.nextInt();
            if(physics[i]<0){ System.out.println("Invalid! Re-enter."); i--; continue; }

            System.out.print("Chemistry: ");
            chemistry[i]=sc.nextInt();
            if(chemistry[i]<0){ System.out.println("Invalid! Re-enter."); i--; continue; }

            System.out.print("Maths: ");
            maths[i]=sc.nextInt();
            if(maths[i]<0){ System.out.println("Invalid! Re-enter."); i--; continue; }

            int total=physics[i]+chemistry[i]+maths[i];
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
            System.out.println(physics[i]+"\t"+chemistry[i]+"\t\t"+maths[i]+"\t"+String.format("%.2f",percentage[i])+"%\t\t"+grade[i]);
        }
		

    
        

	}

}
