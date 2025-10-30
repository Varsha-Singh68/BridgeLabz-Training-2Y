import college.faculty.Faculty;
import college.student.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Amit Sharma", 101);
        Faculty f1 = new Faculty("Dr. Mehta", "Computer Science");

        System.out.println("=== Student Details ===");
        s1.displayName();
        s1.displayRollNumber();

        System.out.println("\n=== Faculty Details ===");
        f1.displayName();
        f1.displaySubject();
    }
}
