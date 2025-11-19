package map;

import java.util.*;

public class ExamResultsTopperperSubject {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> results = new HashMap<>();

        results.put("Math", new HashMap<>());
        results.put("Science", new HashMap<>());
        results.put("English", new HashMap<>());

        results.get("Math").put("Amit", 92);
        results.get("Math").put("Neha", 88);
        results.get("Math").put("Rohan", 76);

        results.get("Science").put("Amit", 85);
        results.get("Science").put("Neha", 91);
        results.get("Science").put("Rohan", 67);

        results.get("English").put("Amit", 78);
        results.get("English").put("Neha", 84);
        results.get("English").put("Rohan", 95);

        System.out.println("Top Scorer Per Subject:");
        for (String subject : results.keySet()) {
            Map<String, Integer> marks = results.get(subject);
            String topper = "";
            int max = -1;
            for (Map.Entry<String, Integer> e : marks.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    topper = e.getKey();
                }
            }
            System.out.println(subject + " → " + topper + " (" + max + ")");
        }

        System.out.println("\nAverage Score Per Subject:");
        for (String subject : results.keySet()) {
            Map<String, Integer> marks = results.get(subject);
            int sum = 0;
            for (int m : marks.values()) sum += m;
            double avg = sum / (double) marks.size();
            System.out.println(subject + " → " + avg);
        }

        System.out.println("\nSubjects with at least one score above 90:");
        for (String subject : results.keySet()) {
            Map<String, Integer> marks = results.get(subject);
            boolean found = false;
            for (int m : marks.values()) {
                if (m > 90) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(subject);
            }
        }
    }
}

