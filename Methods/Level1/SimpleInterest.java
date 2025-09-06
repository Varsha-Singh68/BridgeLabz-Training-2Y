package Methods;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("principal=");
	    double principal=sc.nextDouble();
	    System.out.print("rate of interest=");
	    double rate=sc.nextDouble();
	    System.out.print("time=");
	    double time=sc.nextDouble();
	    double si=calculateSimpleInterest(principal,rate,time);
	    System.out.println("The Simple Interest is "+si+" for Principal "+principal+",Rate of Interest "+rate+" and Time "+time);
	    }
	public static double calculateSimpleInterest(double principal,double rate,double time){
		return (principal*rate*time)/100;
	}
}
