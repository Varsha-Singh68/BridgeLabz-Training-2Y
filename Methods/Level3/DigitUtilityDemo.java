package Methods;
import java.util.*;


class DigitUtility {

    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }
        return digits;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysAreEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        return arraysAreEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        if (digits[0] == 0) {
            return false;
        }
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}

public class DigitUtilityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Count of digits: " + DigitUtility.countDigits(number));
        System.out.println("Digits: " + Arrays.toString(DigitUtility.getDigits(number)));
        System.out.println("Reversed digits: " + Arrays.toString(DigitUtility.reverseArray(DigitUtility.getDigits(number))));
        System.out.println("Is Palindrome? " + DigitUtility.isPalindrome(number));
        System.out.println("Is Duck Number? " + DigitUtility.isDuckNumber(number));

        sc.close();
    }
}



