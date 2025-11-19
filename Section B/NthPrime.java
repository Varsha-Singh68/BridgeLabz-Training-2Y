package elementarycodingpractices1;

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0, num = 1;

        while (count < n) {
            num++;
            boolean prime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) count++;
        }

        System.out.println("Nth Prime = " + num);
    }
}

