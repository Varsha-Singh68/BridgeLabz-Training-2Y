package Strings;
import java.util.*;
public class ShortestLongestWord {

	static int strLen(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) count++;
        return count;
    }

    static String[] splitWords(String text) {
        int len = strLen(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces + 1];
        String word = "";
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }
        words[idx] = word;
        return words;
    }

    static String[][] buildTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(strLen(words[i]));
        }
        return result;
    }

    static int[] findMinMax(String[][] table) {
        int min = Integer.valueOf(table[0][1]);
        int max = Integer.valueOf(table[0][1]);
        for (int i = 1; i < table.length; i++) {
            int len = Integer.valueOf(table[i][1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = buildTable(words);
        int[] result = findMinMax(table);
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.valueOf(row[1]));
        }
        System.out.println("Shortest length: " + result[0]);
        System.out.println("Longest length: " + result[1]);
	}

}
