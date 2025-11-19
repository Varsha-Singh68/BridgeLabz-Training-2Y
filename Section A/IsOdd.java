package elementarycodingpractices;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 != 0)
            System.out.println("Odd");
        else
            System.out.println("Not Odd");
    }
}

