package functional_interface;

interface MessageCheck {
    void check(String message);
}

public class StringLengthChecker {
    public static void main(String[] args) {

        MessageCheck checkLength = msg -> {
            int limit = 20;
            if (msg.length() > limit)
                System.out.println("Message exceeds character limit.");
            else
                System.out.println("Message is within character limit.");
        };

        checkLength.check("Hello");
        checkLength.check("This is a long message exceeding the limit");
    }
}