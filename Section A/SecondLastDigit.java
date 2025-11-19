package elementarycodingpractices;


import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        n = Math.abs(n);  

        int secondLast = (n / 10) % 10;   

        System.out.println("Second last digit = " + secondLast);
    }
}
