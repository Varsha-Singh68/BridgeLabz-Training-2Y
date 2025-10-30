package wrapper_class;

public class InputConversionUtility {

    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input: \"123\" → " + safeParseInt("123"));
        System.out.println("Input: \"abc\" → " + safeParseInt("abc"));
        System.out.println("Input: \"45.6\" → " + safeParseInt("45.6"));
        System.out.println("Input: \"0\" → " + safeParseInt("0"));
    }
}
