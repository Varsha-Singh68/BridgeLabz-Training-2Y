package lambda_expressions;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Low oxygen level"),
            new Alert("Normal", "Daily health checkup reminder"),
            new Alert("Emergency", "Heart rate abnormal"),
            new Alert("Info", "Appointment confirmed")
        );

        Predicate<Alert> criticalAlerts = a -> a.type.equalsIgnoreCase("Critical") || a.type.equalsIgnoreCase("Emergency");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(criticalAlerts)
              .forEach(System.out::println);
    }
}

