package Strings;
import java.util.*;

public class CharFreqNested {
	static String[] getFreq(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }

        String[] res = new String[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != '0') {
                res[k++] = arr[i] + " - " + freq[i];
            }
        }
        String[] finalRes = new String[k];
        for (int i = 0; i < k; i++) {
            finalRes[i] = res[i];
        }
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] ans = getFreq(str);
        System.out.println("Character   Frequency");
        for (String x : ans) {
            System.out.println("    " + x);
        }

	

	}

}
