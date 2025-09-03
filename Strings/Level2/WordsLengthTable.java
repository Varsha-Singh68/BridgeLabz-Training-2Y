package Strings;
import java.util.*;

public class WordsLengthTable {
	
	public static int findLength(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) count++;
        return count;
    }

    static String[] customSplit(String text) {
        int len = findLength(text);
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

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordsWithLength(words);
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.valueOf(row[1]));
        }
	

	}

}
