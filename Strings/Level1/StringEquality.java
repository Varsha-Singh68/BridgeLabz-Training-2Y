package Strings;
import java.util.*;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		if(equalsto(str1,str2) && str1.equals(str2)) System.out.println("both strings are equal");
		else
			System.out.println("both the string are not equal");
	}
	public static boolean equalsto(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) return false;
		}
		return true;
		
	}

}
