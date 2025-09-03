package Strings;
import java.util.*;

public class Substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int start=sc.nextInt();
		int end=sc.nextInt();
		String sub1 = substring(str, start, end); 
        String sub2 = str.substring(start, end); 
        System.out.println("Custom: " + sub1);
        System.out.println("Built-in: " + sub2);
        System.out.println("Compare(charAt): " + equalStrings(sub1, sub2));
        System.out.println("Compare(equals): " + sub1.equals(sub2));

		
		
    }
	public static String substring(String str1, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += str1.charAt(i);
        }
        return sub;
    }
	public static boolean equalStrings(String s1, String s2) {
	        if (s1.length() != s2.length()) return false;
	        for (int i = 0; i < s1.length(); i++)
	            if (s1.charAt(i) != s2.charAt(i)) return false;
	        return true;
	    }

}
