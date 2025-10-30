package college.student;

public class Student {
    private String name;
    private int rollNumber;

    // Constructor to initialize student details
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student name
    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    // Method to display student roll number
    public void displayRollNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
}

