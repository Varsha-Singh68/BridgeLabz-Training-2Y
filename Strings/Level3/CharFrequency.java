package Strings;
import java.util.*;

public class CharFrequency {

	static String[][] getFreq(String s) {
        int[] freq = new int[256];
        int n = s.toCharArray().length;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        String[][] res = new String[n][2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (freq[ch] > 0) {
                res[k][0] = String.valueOf(ch);
                res[k][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                k++;
            }
        }
        String[][] finalRes = new String[k][2];
        for (int i = 0; i < k; i++) {
            finalRes[i][0] = res[i][0];
            finalRes[i][1] = res[i][1];
        }
        return finalRes;
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
