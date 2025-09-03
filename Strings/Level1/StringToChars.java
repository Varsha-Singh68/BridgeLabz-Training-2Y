package Strings;
import java.util.*;

public class StringToChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char customArr[] = customToCharArray(str);
        char builtinArr[] = str.toCharArray();
        boolean result = compareCharArrays(customArr, builtinArr);
        System.out.print("\nCustom char array: ");
        for (char c : customArr) System.out.print(c + " ");
        System.out.print("\nBuilt-in char array: ");
        for (char c : builtinArr) System.out.print(c + " ");
        System.out.println("\nArrays equal? " + result);
	}
	
	public static char[] customToCharArray(String str) {
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    
    public static boolean compareCharArrays(char arr1[], char arr2[]) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

}
