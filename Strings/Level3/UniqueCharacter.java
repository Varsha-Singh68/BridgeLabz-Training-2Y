package Strings;
import java.util.*;

public class UniqueCharacter {
	static int getLen(String s) {
        int c = 0;
        char[] arr = s.toCharArray();
        for (char x : arr) {
            c++;
        }
        return c;
    }

    static char[] getUnique(String s) {
        int n = getLen(s);
        char[] temp = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[k++] = ch;
            }
        }
        char[] res = new char[k];
        for (int i = 0; i < k; i++) {
            res[i] = temp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] res = getUnique(str);
        System.out.print("Unique characters: ");
        for (char c : res) {
            System.out.print(c + " ");
        }
	}

}
