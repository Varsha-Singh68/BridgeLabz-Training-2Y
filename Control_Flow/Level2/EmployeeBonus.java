package control_flow;
import java.util.*;

public class EmployeeBonus {

	public static void main(String[] args) {
		double salary;
		int years;
		Scanner sc=new Scanner(System.in);     
        System.out.print("Enter salary: ");
        salary=sc.nextDouble();
        System.out.print("Enter years of service: ");
        years=sc.nextInt();        
        if(years>5){
            double bonus=salary*0.05; 
            System.out.printf("Bonus amount: %.2f",bonus);
        }else
            System.out.println("Not getting bonus");       
            

	}

}
