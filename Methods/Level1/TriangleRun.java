package Methods;
import java.util.*;
public class TriangleRun {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter side 1 of triangle in meters=");
        double side1=sc.nextDouble();
        System.out.print("Enter side 2 of the triangle=");
        double side2=sc.nextDouble();
        System.out.print("Enter side 3 of the triangle=");
        double side3=sc.nextDouble();

        double rounds=calculateRounds(side1,side2,side3,5000);
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km run.");
    }

    public static double calculateRounds(double a,double b,double c,double distance){
        double perimeter=a+b+c;
        return distance/perimeter;

	}

}
