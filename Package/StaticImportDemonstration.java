import static java.lang.Math.*;

public class StaticImportDemonstration {
    public static void main(String[] args) {

        double a = 16, b = 4, c = -25;

        System.out.println("Square root of " + a + " = " + sqrt(a));
        System.out.println(b + " raised to the power 3 = " + pow(b, 3));
        System.out.println("Maximum of " + a + " and " + b + " = " + max(a, b));
        System.out.println("Minimum of " + a + " and " + b + " = " + min(a, b));
        System.out.println("Absolute value of " + c + " = " + abs(c));
    }
}

