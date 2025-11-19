package elementarycodingpractices;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int lastDigit = Math.abs(n % 10);   // last digit logic
        System.out.println("Last digit = " + lastDigit);
    }
}


