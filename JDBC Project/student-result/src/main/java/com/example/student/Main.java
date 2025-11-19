package com.example.student;

import com.example.student.dao.StudentDAO;
import com.example.student.dao.ResultDAO;
import com.example.student.model.Student;
import com.example.student.model.Result;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        ResultDAO resultDAO = new ResultDAO();

        while (true) {
            System.out.println("\n===== Student Result Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");

            System.out.println("5. Add Result");
            System.out.println("6. View All Results");
            System.out.println("7. Update Result");
            System.out.println("8. Delete Result");

            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                
                case 1:
                    sc.nextLine();
                    System.out.print("Enter first name: ");
                    String fname = sc.nextLine();

                    System.out.print("Enter last name: ");
                    String lname = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter DOB (YYYY-MM-DD): ");
                    String dob = sc.nextLine();

                    Student newStudent = new Student(0, fname, lname, email, dob);

                    if (studentDAO.addStudent(newStudent)) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Failed to add student.");
                    }
                    break;

                
                case 2:
                    List<Student> students = studentDAO.getAllStudents();
                    System.out.println("\n--- Student List ---");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                
                case 3:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new first name: ");
                    String newFName = sc.nextLine();

                    System.out.print("Enter new last name: ");
                    String newLName = sc.nextLine();

                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();

                    System.out.print("Enter new DOB (YYYY-MM-DD): ");
                    String newDob = sc.nextLine();

                    if (studentDAO.updateStudent(updateId, newFName, newLName, newEmail, newDob)) {
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Update failed.");
                    }
                    break;

                
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    if (studentDAO.deleteStudent(deleteId)) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Delete failed.");
                    }
                    break;

                
                case 5:
                    System.out.print("Enter student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter subject: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();

                    System.out.print("Enter semester: ");
                    int sem = sc.nextInt();

                    Result r = new Result(0, sid, subject, marks, grade, sem);

                    if (resultDAO.addResult(r)) {
                        System.out.println("Result added successfully!");
                    } else {
                        System.out.println("Failed to add result.");
                    }
                    break;

                
                case 6:
                    List<Result> results = resultDAO.getAllResults();
                    System.out.println("\n--- Results List ---");
                    for (Result rs : results) {
                        System.out.println(rs);
                    }
                    break;

                
                case 7:
                    System.out.print("Enter Result ID to update: ");
                    int rid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new student ID: ");
                    int newSid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new subject: ");
                    String newSubject = sc.nextLine();

                    System.out.print("Enter new marks: ");
                    int newMarks = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new grade: ");
                    String newGrade = sc.nextLine();

                    System.out.print("Enter new semester: ");
                    int newSem = sc.nextInt();

                    if (resultDAO.updateResult(rid, newSid, newSubject, newMarks, newGrade, newSem)) {
                        System.out.println("Result updated successfully!");
                    } else {
                        System.out.println("Failed to update result.");
                    }
                    break;

                
                case 8:
                    System.out.print("Enter Result ID to delete: ");
                    int delRid = sc.nextInt();

                    if (resultDAO.deleteResult(delRid)) {
                        System.out.println("Result deleted successfully!");
                    } else {
                        System.out.println("Failed to delete result.");
                    }
                    break;

                
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}


