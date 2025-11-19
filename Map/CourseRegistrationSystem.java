package map;

import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("MA201", 10);
        courses.put("PH150", 3);
        courses.put("EC210", 52);
        courses.put("HS101", 0);

        courses.put("CS101", courses.get("CS101") + 7);
        courses.put("PH150", courses.get("PH150") + 2);
        courses.put("HS101", courses.get("HS101") + 4);

        courses.put("MA201", Math.max(0, courses.get("MA201") - 5));
        courses.put("EC210", Math.max(0, courses.get("EC210") - 2));
        courses.put("PH150", Math.max(0, courses.get("PH150") - 1));

        System.out.println("Final Course Registrations:");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        System.out.println("\nNear Full Courses (≥ 50):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() >= 50)
                System.out.println(e.getKey());
        }

        System.out.println("\nUnder-Subscribed Courses (< 5):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() < 5)
                System.out.println(e.getKey());
        }
    }
}

