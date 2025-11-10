package exception_handling;

import java.util.*;

class InvalidCredentialsException extends Exception {
 public InvalidCredentialsException(String message) {
     super(message);
 }
}


class LoginSystem {
 private final String validUsername = "admin";
 private final String validPassword = "12345";


 public void validate(String user, String pass) throws InvalidCredentialsException {
     if (!user.equals(validUsername) || !pass.equals(validPassword)) {
         throw new InvalidCredentialsException("Invalid username or password!");
     } else {
         System.out.println("Login successful! Welcome, " + user + ".");
     }
 }
}


public class LoginSystemMain {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     LoginSystem login = new LoginSystem();
     boolean success = false;

     
     while (!success) {
         System.out.print("Enter username: ");
         String username = sc.nextLine();

         System.out.print("Enter password: ");
         String password = sc.nextLine();

         try {
             login.validate(username, password);
             success = true; 
         } catch (InvalidCredentialsException e) {
             System.out.println(e.getMessage());
             System.out.println("Please try again.\n");
         }
     }

     sc.close();
 }
}

