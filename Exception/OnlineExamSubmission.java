package exception_handling;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String message) {
        super(message);
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

class ExamPortal {
    private static final LocalDateTime DEADLINE = LocalDateTime.of(2025, 11, 5, 17, 0); 

    public void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {

        if (!fileName.endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format (only .pdf allowed).");
        }

        if (submissionTime.isAfter(DEADLINE)) {
            throw new LateSubmissionException("Submission failed: you missed the deadline.");
        }

        System.out.println("Submission successful! File: " + fileName);
    }
}

public class OnlineExamSubmission {
    public static void main(String[] args) {
        ExamPortal portal = new ExamPortal();
        String fileName = "exam_answers.pdf";
        LocalDateTime submissionTime = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Submitting exam at: " + submissionTime.format(format));

        try {
            portal.submitExam(fileName, submissionTime);
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

