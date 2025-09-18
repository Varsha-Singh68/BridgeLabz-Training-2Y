package constructors;

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number (public): " + rollNumber);
        System.out.println("Name (protected): " + name);
        System.out.println("CGPA (via getter): " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }
}

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayStudentDetails();
        System.out.println();

        s1.setCGPA(9.0);
        System.out.println("After Updating CGPA:");
        s1.displayStudentDetails();
        System.out.println();

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 8.8, "Data Science");
        pg1.displayPGDetails();
    }
}

