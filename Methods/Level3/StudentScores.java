package Methods;
import java.util.*;


public class StudentScores {

    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int) (Math.random() * 100);
            marks[i][1] = (int) (Math.random() * 100);
            marks[i][2] = (int) (Math.random() * 100);
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f\n",
                    "S" + (i + 1),
                    marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] results = calculateResults(marks);
        displayScorecard(marks, results);
        sc.close();
    }
}


