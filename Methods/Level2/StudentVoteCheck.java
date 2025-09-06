package Methods;
import java.util.*;

public class StudentVoteCheck {
	
	public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteCheck checker = new StudentVoteCheck();

        int[] studentAges = new int[10];

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
        }

        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}
