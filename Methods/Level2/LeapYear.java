package Methods;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year < 1582)
            System.out.println("Leap year check works only for year >= 1582");
        else {
            if (isLeapYear(year))
                System.out.println(year + " is a Leap Year");
            else
                System.out.println(year + " is not a Leap Year");
            
        }
    }

    public static boolean isLeapYear(int year) {
        boolean conditionA = (year % 4 == 0);
        boolean conditionB = (year % 100 != 0 || year % 400 == 0);
        return conditionA && conditionB;
    }
}
	