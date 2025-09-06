package Methods;
import java.util.Scanner;

class NumberUtility {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}

public class NumberUtilityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Prime? " + NumberUtility.isPrime(number));
        System.out.println("Is Neon? " + NumberUtility.isNeon(number));
        System.out.println("Is Spy? " + NumberUtility.isSpy(number));
        System.out.println("Is Automorphic? " + NumberUtility.isAutomorphic(number));
        System.out.println("Is Buzz? " + NumberUtility.isBuzz(number));

        sc.close();
    }
}