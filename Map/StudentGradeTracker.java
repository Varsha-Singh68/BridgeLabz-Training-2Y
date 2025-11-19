package map;

import java.util.Map;
import java.util.TreeMap;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Map<String, Double> grades = new TreeMap<>();

        grades.put("Aman", 85.0);
        grades.put("Riya", 92.5);
        grades.put("Karan", 76.0);
        grades.put("Tina", 88.0);

        System.out.println("After adding students:");
        System.out.println(grades);

        grades.put("Karan", 82.0);

        System.out.println("\nAfter updating Karan's grade:");
        System.out.println(grades);

        grades.remove("Tina");

        System.out.println("\nAfter removing Tina:");
        System.out.println(grades);

        System.out.println("\nFinal student list (sorted by name):");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

