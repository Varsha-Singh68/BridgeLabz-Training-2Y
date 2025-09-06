package Methods;
import java.util.*;

public class SumUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0)
            System.out.println("enter a valid natural number");
        else {
            int recursiveSum = recursiveSum(n);
            int formulaSum = formulaSum(n);

            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (recursiveSum == formulaSum)
                System.out.println("Both computations match correctly");
            else
                System.out.println("Results do not match.");
            
        }
    }

    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
}
	
