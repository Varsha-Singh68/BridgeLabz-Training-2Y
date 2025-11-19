package elementarycodingpractices1;

import java.util.Scanner;

public class DigitSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        long n = Math.abs(sc.nextLong());

        System.out.print("Enter choice (E for Even, O for Odd): ");
        char ch = sc.next().toUpperCase().charAt(0);

        int sum = 0;

        while (n > 0) {
            int d = (int)(n % 10);

            if (ch == 'E' && d % 2 == 0) sum += d;
            if (ch == 'O' && d % 2 != 0) sum += d;

            n /= 10;
        }

        System.out.println("Sum = " + sum);
    }
}

