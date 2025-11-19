package map;

import java.util.*;

public class StudentAttendanceTracker {
    public static void main(String[] args) {

        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = Arrays.asList("Aman", "Riya", "Karan", "Tina", "Mehul");

        for (String s : students) attendance.put(s, 0);

        List<List<String>> presentEachDay = Arrays.asList(
                Arrays.asList("Aman", "Riya"),
                Arrays.asList("Riya", "Karan", "Tina"),
                Arrays.asList("Aman", "Mehul"),
                Arrays.asList("Aman", "Riya", "Tina"),
                Arrays.asList("Karan"),
                Arrays.asList("Riya", "Tina"),
                Arrays.asList("Aman", "Riya", "Mehul"),
                Arrays.asList("Tina"),
                Arrays.asList("Aman", "Karan"),
                Arrays.asList("Riya", "Tina"),
                Arrays.asList("Aman"),
                Arrays.asList("Karan", "Mehul"),
                Arrays.asList("Riya"),
                Arrays.asList("Aman", "Tina"),
                Arrays.asList("Karan")
        );

        for (List<String> day : presentEachDay) {
            for (String s : day) {
                attendance.put(s, attendance.get(s) + 1);
            }
        }

        System.out.println("Attendance Count:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\nUnder-attending students (<10 days):");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < 10)
                System.out.println(entry.getKey());
        }
    }
}

