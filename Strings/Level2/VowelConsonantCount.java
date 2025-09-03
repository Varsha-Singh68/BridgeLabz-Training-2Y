package Strings;
import java.util.*;

public class VowelConsonantCount {

	static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                return "Vowel";
            else 
                return "Consonant";
        }
        return "Not a Letter";
    }

    static int[] countVC(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            String res = checkChar(text.charAt(i));
            if (res.equals("Vowel")) vowels++;
            else if (res.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] result = countVC(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

	}

}
