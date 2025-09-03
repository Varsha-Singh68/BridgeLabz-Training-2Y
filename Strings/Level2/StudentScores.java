package Strings;
import java.util.*;


public class StudentScores {
	static int[][] getMarks(int n) {
	        Scanner sc = new Scanner(System.in);
	        int[][] m = new int[n][3];
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter marks of student " + (i + 1) + " (Physics Chemistry Maths):");
	            for (int j = 0; j < 3; j++) {
	                m[i][j] = sc.nextInt();
	            }
	        }
	        return m;
	    }

	    static double[][] getResult(int[][] m) {
	        double[][] r = new double[m.length][3];
	        for (int i = 0; i < m.length; i++) {
	            int t = m[i][0] + m[i][1] + m[i][2];
	            double a = t / 3.0;
	            double p = Math.round((t / 300.0 * 100) * 100.0) / 100.0;
	            r[i][0] = t;
	            r[i][1] = Math.round(a * 100.0) / 100.0;
	            r[i][2] = p;
	        }
	        return r;
	    }

	    static String[] getGrade(double[][] r) {
	        String[] g = new String[r.length];
	        for (int i = 0; i < r.length; i++) {
	            double p = r[i][2];
	            if (p >= 80) g[i] = "A";
	            else if (p >= 70) g[i] = "B";
	            else if (p >= 60) g[i] = "C";
	            else if (p >= 50) g[i] = "D";
	            else if (p >= 40) g[i] = "E";
	            else g[i] = "R";
	        }
	        return g;
	    }

	    static void show(int[][] m, double[][] r, String[] g) {
	        System.out.println("Phy  Chem  Math  Total  Avg   Per   Grade");
	        for (int i = 0; i < m.length; i++) {
	            System.out.println(m[i][0] + "    " + m[i][1] + "    " + m[i][2] +
	                    "    " + (int) r[i][0] + "   " + r[i][1] + "  " + r[i][2] + "   " + g[i]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();
	        int[][] m = getMarks(n);
	        double[][] r = getResult(m);
	        String[] g = getGrade(r);
	        show(m, r, g);
	}

}
