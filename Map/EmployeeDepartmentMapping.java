package map;

import java.util.*;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {

        HashMap<Integer, String> empDept = new HashMap<>();

        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");
        empDept.put(106, "Marketing");

        empDept.put(103, "IT");

        String targetDept = "IT";
        System.out.println("Employees in " + targetDept + ":");
        for (Map.Entry<Integer, String> e : empDept.entrySet()) {
            if (e.getValue().equals(targetDept)) {
                System.out.println(e.getKey());
            }
        }

        HashMap<String, Integer> deptCount = new HashMap<>();
        for (String dept : empDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nTotal Employees Per Department:");
        for (Map.Entry<String, Integer> e : deptCount.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}

