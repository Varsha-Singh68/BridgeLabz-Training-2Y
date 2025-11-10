package exception_handling;

import java.io.IOException;
import java.util.Scanner;

public class ExamSubmissionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OnlineExamSystem examSystem = new OnlineExamSystem();

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        try {
            examSystem.submitExam(studentId);
        } catch (InvalidStudentException e) {
            System.out.println("Student Validation Failed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Submission Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
            sc.close();
        }
    }
}

