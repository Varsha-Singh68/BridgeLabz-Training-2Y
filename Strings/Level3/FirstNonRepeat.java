package Strings;
import java.util.*;

public class FirstNonRepeat {
	
	static char getFirst(String s) {
        int[] freq = new int[256];
        int n = s.toCharArray().length;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char ans = getFirst(str);
        if (ans == '\0')
            System.out.println("No non-repeating character found");
        else
            System.out.println("First non-repeating character: " + ans);

	}

}
