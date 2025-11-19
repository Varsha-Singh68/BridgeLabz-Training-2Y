package elementarycodingpractices1;

import java.util.Scanner;

public class PrimeCountRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int a = sc.nextInt();
        System.out.print("Enter end: ");
        int b = sc.nextInt();

        int count = 0;

        for (int n = a; n <= b; n++) {
            if (n <= 1) continue;
            boolean prime = true;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) count++;
        }

        System.out.println("Total primes = " + count);
    }
}

