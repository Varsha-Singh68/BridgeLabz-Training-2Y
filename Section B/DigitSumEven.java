package elementarycodingpractices1;

import java.util.Scanner;

public class DigitSumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = Math.abs(sc.nextLong());

        int sum = 0;
        while (n > 0) {
            int d = (int)(n % 10);
            if (d % 2 == 0) sum += d;
            n /= 10;
        }

        System.out.println("Sum of even digits = " + sum);
    }
}

