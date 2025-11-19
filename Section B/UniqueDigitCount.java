package elementarycodingpractices1;

import java.util.Scanner;

public class UniqueDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = Math.abs(sc.nextLong());

        int[] freq = new int[10];

        if (n == 0) freq[0] = 1;

        while (n > 0) {
            int d = (int)(n % 10);
            freq[d]++;
            n /= 10;
        }

        int unique = 0;
        for (int f : freq) {
            if (f > 0) unique++;
        }

        System.out.println("Unique digits = " + unique);
    }
}

