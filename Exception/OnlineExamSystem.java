package exception_handling;

import java.io.IOException;

class InvalidStudentException extends Exception {
 public InvalidStudentException(String message) {
     super(message);
 }
}

public class OnlineExamSystem {

 public void validateStudent(String studentId) throws InvalidStudentException {
     if (!studentId.equals("STU123")) {
         throw new InvalidStudentException("Invalid student ID: " + studentId);
     }
     System.out.println("Student validation successful for ID: " + studentId);
 }

 public void submitExam(String studentId) throws InvalidStudentException, IOException {
     validateStudent(studentId);

  
     double random = Math.random();
     if (random < 0.5) {
         throw new IOException("Network error occurred during submission.");
     }

     System.out.println("Exam submitted successfully!");
 }
}
