package functional_interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static void formatDate(LocalDate date) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println("Format 1: " + date.format(format1));
        System.out.println("Format 2: " + date.format(format2));
        System.out.println("Format 3: " + date.format(format3));
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        DateFormatter.formatDate(today);
    }
}

