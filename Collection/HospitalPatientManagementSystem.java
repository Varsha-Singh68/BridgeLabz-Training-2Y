package collection;

import java.util.*;

class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        Patient p = (Patient) o;
        return this.name.equals(p.name) && this.age == p.age;
    }
}

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {

        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waiting = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        admit(new Patient("Rohan", 30), admitted, waiting, history);
        admit(new Patient("Meera", 24), admitted, waiting, history);
        admit(new Patient("Amit", 45), admitted, waiting, history);
        admit(new Patient("Rohan", 30), admitted, waiting, history);

        System.out.println("\nTreating Patients:");
        while (!waiting.isEmpty()) {
            Patient p = waiting.poll();
            System.out.println("Treated: " + p);
            discharge(p, admitted, discharged);
        }

        System.out.println("\nRecently Discharged Stack:");
        System.out.println(discharged);

        System.out.println("\nRe-admitting last discharged patient:");
        if (!discharged.isEmpty()) {
            Patient p = discharged.pop();
            admit(p, admitted, waiting, history);
        }

        System.out.println("\nAdmitted Patients:");
        System.out.println(admitted);

        System.out.println("\nWaiting Queue:");
        System.out.println(waiting);

        System.out.println("\nTotal Patient History:");
        System.out.println(history);
    }

    public static void admit(Patient p, Set<Patient> admitted,
                             Queue<Patient> waiting, List<Patient> history) {

        if (admitted.add(p)) {
            waiting.add(p);
            history.add(p);
            System.out.println("Admitted: " + p);
        } else {
            System.out.println("Duplicate Admission Ignored: " + p);
        }
    }

    public static void discharge(Patient p, Set<Patient> admitted, Stack<Patient> discharged) {
        admitted.remove(p);
        discharged.push(p);
        System.out.println("Discharged: " + p);
    }
}

