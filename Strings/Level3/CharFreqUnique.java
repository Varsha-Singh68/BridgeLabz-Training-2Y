package Strings;
import java.util.*;

public class CharFreqUnique {
	
	static char[] getUnique(String s) {
        int n = s.toCharArray().length;
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

    static String[][] getFreq(String s) {
        int[] freq = new int[256];
        int n = s.toCharArray().length;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        char[] unique = getUnique(s);
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[][] ans = getFreq(str);
        System.out.println("Character   Frequency");
        for (int i = 0; i < ans.length; i++) {
            System.out.println("    " + ans[i][0] + "          " + ans[i][1]);
        }

	}

}
