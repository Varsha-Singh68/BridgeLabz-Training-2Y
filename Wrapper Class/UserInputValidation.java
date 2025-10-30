package wrapper_class;

import java.util.Scanner;

public class UserInputValidation {
    
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String userInput = sc.nextLine();

        if (isValidAge(userInput)) {
            System.out.println("Signup successful! You are eligible.");
        } else {
            System.out.println("Invalid or underage. Signup failed.");
        }

        sc.close();
    }
}



