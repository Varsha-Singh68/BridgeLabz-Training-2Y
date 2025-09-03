package Strings;
import java.util.*;

public class Palindrome {
	static boolean isPalLoop(String s) {
		int start = 0, end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	    return true;
	    }

	    static boolean isPalArray(String s) {
	        char[] original = s.toCharArray();
	        char[] rev = reverse(s);
	        for (int i = 0; i < original.length; i++) {
	            if (original[i] != rev[i]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    static char[] reverse(String s) {
	        int n = s.length();
	        char[] rev = new char[n];
	        for (int i = 0; i < n; i++) {
	            rev[i] = s.charAt(n - 1 - i);
	        }
	        return rev;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String str = sc.nextLine();

	        if (isPalLoop(str))
	            System.out.println("Logic 1 (Loop): Palindrome");
	        else
	            System.out.println("Logic 1 (Loop): Not Palindrome");

	        if (isPalArray(str))
	            System.out.println("Logic 2 (Char Array): Palindrome");
	        else
	            System.out.println("Logic 2 (Char Array): Not Palindrome");
	}

}
