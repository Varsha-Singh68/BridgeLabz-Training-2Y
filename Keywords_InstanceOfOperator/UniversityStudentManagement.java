package keywords;

class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;

    private String name;
    private final String rollNumber;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Student Details");
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
           
        } else {
            System.out.println("Invalid object. Not a Student.");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully for Roll No: " + rollNumber);
        } else {
            System.out.println("Invalid object. Cannot update grade.");
        }
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public static void setUniversityName(String newUniversityName) {
        universityName = newUniversityName;
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student("Varsha", "S101", "A");
        Student student2 = new Student("Riya", "S102", "B");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        Student.displayTotalStudents();
        student2.updateGrade("A+");
        student2.displayStudentDetails();
        Student.setUniversityName("GL Bajaj");
        System.out.println("\nAfter Changing University Name:");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
