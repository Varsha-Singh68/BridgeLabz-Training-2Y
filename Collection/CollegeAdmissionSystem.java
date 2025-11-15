package collection;

import java.util.*;

class Studenti implements Comparable<Studenti> {
    String name;
    int marks;

    Studenti(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Studenti other) {
        return other.marks - this.marks;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studenti)) return false;
        Studenti s = (Studenti) o;
        return this.name.equals(s.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name + " | Marks: " + marks;
    }
}

public class CollegeAdmissionSystem {
    public static void main(String[] args) {

        List<Studenti> applicants = Arrays.asList(
                new Studenti("Amit", 92),
                new Studenti("Riya", 88),
                new Studenti("Kabir", 76),
                new Studenti("Sara", 95),
                new Studenti("Amit", 92)
        );

        Set<Studenti> shortlisted = new HashSet<>();
        Queue<Studenti> interviewQueue = new LinkedList<>();
        TreeSet<Studenti> meritList = new TreeSet<>();

        for (Studenti s : applicants) {
            if (s.marks >= 80) shortlisted.add(s);
        }

        for (Studenti s : shortlisted) interviewQueue.add(s);

        while (!interviewQueue.isEmpty()) {
            Studenti s = interviewQueue.poll();
            meritList.add(s);
        }

        System.out.println("Applicants:");
        for (Studenti s : applicants) System.out.println(s);

        System.out.println("\nShortlisted:");
        for (Studenti s : shortlisted) System.out.println(s);

        System.out.println("\nInterview Queue Completed");

        System.out.println("\nFinal Merit List:");
        for (Studenti s : meritList) System.out.println(s);
    }
}


