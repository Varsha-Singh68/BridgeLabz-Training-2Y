package collection;

import java.util.*;

class Question {
    int id;
    String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return id + ". " + text;
    }
}

class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return studentId + " - " + name;
    }
}

public class OnlineExaminationManagementSystem {

    public static void main(String[] args) {

        Set<String> studentIds = new HashSet<>();
        Queue<Student> examQueue = new LinkedList<>();

        System.out.println("Enrolling Students:");
        enroll(studentIds, examQueue, new Student("S01", "Aarav"));
        enroll(studentIds, examQueue, new Student("S02", "Varun"));
        enroll(studentIds, examQueue, new Student("S01", "Duplicate"));
        enroll(studentIds, examQueue, new Student("S03", "Meera"));

        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1, "What is Java?"));
        questions.add(new Question(2, "What is OOP?"));
        questions.add(new Question(3, "What is JVM?"));
        questions.add(new Question(4, "Define Encapsulation"));

        Collections.shuffle(questions);

        System.out.println("\nRandomized Questions:");
        questions.forEach(System.out::println);

        System.out.println("\nServing Students:");
        while (!examQueue.isEmpty()) {
            Student s = examQueue.poll();
            System.out.println("Serving: " + s);
            navigateQuestions(questions);
        }
    }

    static void enroll(Set<String> ids, Queue<Student> queue, Student s) {
        if (ids.add(s.studentId)) {
            queue.add(s);
            System.out.println("Enrolled: " + s);
        } else {
            System.out.println("Duplicate Student ID Blocked: " + s.studentId);
        }
    }

    static void navigateQuestions(List<Question> questions) {
        Stack<Question> stack = new Stack<>();
        System.out.println("Navigating Questions:");
        for (Question q : questions) {
            stack.push(q);
            System.out.println("Forward: " + q);
        }
        System.out.println("Going Back:");
        while (!stack.isEmpty()) {
            System.out.println("Back: " + stack.pop());
        }
    }
}

