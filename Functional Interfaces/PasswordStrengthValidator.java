package functional_interface;

interface SecurityUtils {
    static void checkPassword(String password) {
        if (password.length() >= 8 && 
            password.matches(".*[A-Z].*") && 
            password.matches(".*[a-z].*") && 
            password.matches(".*\\d.*") && 
            password.matches(".*[@#$%^&+=!].*")) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {

        SecurityUtils.checkPassword("higfytdy123@");
        SecurityUtils.checkPassword("pass123");
    }
}

