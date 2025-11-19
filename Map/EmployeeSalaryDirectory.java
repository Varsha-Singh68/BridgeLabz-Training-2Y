package map;

import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {

        Map<String, Double> salaries = new HashMap<>();

        salaries.put("Aman", 45000.0);
        salaries.put("Riya", 52000.0);
        salaries.put("Karan", 48000.0);
        salaries.put("Tina", 60000.0);
        salaries.put("Mehul", 39000.0);
        salaries.put("Sonia", 61000.0);

        String emp1 = "Aman";
        if (salaries.containsKey(emp1))
            salaries.put(emp1, salaries.get(emp1) * 1.10);
        else
            System.out.println("Employee not found");

        String emp2 = "Tina";
        if (salaries.containsKey(emp2))
            salaries.put(emp2, salaries.get(emp2) * 1.05);
        else
            System.out.println("Employee not found");

        String emp3 = "Riya";
        if (salaries.containsKey(emp3))
            salaries.put(emp3, salaries.get(emp3) * 1.08);
        else
            System.out.println("Employee not found");

        double total = 0;
        for (double sal : salaries.values()) total += sal;
        double avg = total / salaries.size();

        double maxSalary = 0;
        for (double sal : salaries.values())
            if (sal > maxSalary) maxSalary = sal;

        System.out.println("Final Salaries:");
        for (Map.Entry<String, Double> e : salaries.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        System.out.println("\nAverage Salary: " + avg);

        System.out.println("\nHighest Paid Employee(s):");
        for (Map.Entry<String, Double> e : salaries.entrySet()) {
            if (e.getValue() == maxSalary)
                System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}

