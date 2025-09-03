package Strings;
import java.util.*;

public class TrimCompare {
	static int[] getTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] indices = getTrimIndices(text);
        String trimmedCustom = substring(text, indices[0], indices[1]);
        String trimmedBuiltIn = text.trim();
        System.out.println("Custom Trim: '" + trimmedCustom + "'");
        System.out.println("Built-in Trim: '" + trimmedBuiltIn + "'");
        System.out.println("Are both equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));

}
}
