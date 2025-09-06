package Methods;
import java.util.*;

public class NumberDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = Numberutil.countDigits(number);
        System.out.println("Number of digits: " + count);

        int[] digits = Numberutil.storeDigits(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sum = Numberutil.sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumSquares = Numberutil.sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        boolean isHarshad = Numberutil.isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number? " + isHarshad);

        int[][] frequency = Numberutil.digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
        }
    }
}

class Numberutil {

    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int n = countDigits(number);
        int[] digits = new int[n];
        int temp = number;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += (int) Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
		

	}

}
