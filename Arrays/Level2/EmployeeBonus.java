package Arrays;
import java.util.*;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double salaryArr[]=new double[10];
        double yearsArr[]=new double[10];
        double bonusArr[]=new double[10];
        double newSalaryArr[]=new double[10];
        double totalBonus=0,totalOldSalary=0,totalNewSalary=0;

        for(int i=0;i<10;i++){
            System.out.println("Enter details of employee "+(i+1));
            System.out.print("Salary= ");
            double s=sc.nextDouble();
            System.out.print("years of service= ");
            double y=sc.nextDouble();

            if(s<=0 || y<0){
                System.out.println("invalid input");
                i--; 
                continue;
            }
            salaryArr[i]=s;
            yearsArr[i]=y;
        }

        for(int i=0;i<10;i++){
            if(yearsArr[i]>5) bonusArr[i]=salaryArr[i]*0.05;
            else bonusArr[i]=salaryArr[i]*0.02;

            newSalaryArr[i]=salaryArr[i]+bonusArr[i];
            totalBonus+=bonusArr[i];
            totalOldSalary+=salaryArr[i];
            totalNewSalary+=newSalaryArr[i];
        }
        for(int i=0;i<10;i++)
            System.out.println("Employee "+(i+1)+": Old Salary="+salaryArr[i]+", Bonus="+bonusArr[i]+", New Salary="+newSalaryArr[i]);
            
        System.out.println("Total Bonus Payout= "+totalBonus);
        System.out.println("Total Old Salary= "+totalOldSalary);
        System.out.println("Total New Salary= "+totalNewSalary);

	}

}
