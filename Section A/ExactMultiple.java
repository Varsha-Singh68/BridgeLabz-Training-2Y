package elementarycodingpractices;

import java.util.Scanner;

public class ExactMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.print("Enter M: ");
        int M = sc.nextInt();

        if (M == 0) {
            System.out.println("Division by zero is not allowed!");
        } else if (N % M == 0) {
            System.out.println(N + " is an exact multiple of " + M);
        } else {
            System.out.println(N + " is NOT an exact multiple of " + M);
        }
    }
}

