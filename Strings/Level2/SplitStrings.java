package Strings;
import java.util.*;

public class SplitStrings {

	static int findLength(String text) {
        int count = 0;
        while (true) {
            if (count >= text.toCharArray().length) break;
            count++;
        }
        return count;
    }

    static String[] customSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        int[] spaceIndex = new int[spaceCount + 2];
        spaceIndex[0] = -1;
        int index = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = length;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        boolean result = compareArrays(customWords, builtInWords);
        System.out.println("Custom Split:");
        for (String w : customWords) System.out.println(w);
        System.out.println("Built-in Split:");
        for (String w : builtInWords) System.out.println(w);
        System.out.println("Are both equal? " + result);
		
		

	}

}
