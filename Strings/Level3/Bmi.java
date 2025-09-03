package Strings;
import java.util.*;
public class Bmi {
	
	static double[][] getHW(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) and height (cm) of person " + (i+1) + ":");
            hw[i][0] = sc.nextDouble();
            hw[i][1] = sc.nextDouble();
        }
        return hw;
    }

    static String[][] calc(double[][] hw) {
        String[][] res = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double w = hw[i][0];
            double h = hw[i][1] / 100.0;
            double bmi = Math.round((w / (h * h)) * 100.0) / 100.0;
            String st;
            if (bmi <= 18.4) st = "Underweight";
            else if (bmi <= 24.9) st = "Normal";
            else if (bmi <= 39.9) st = "Overweight";
            else st = "Obese";
            res[i][0] = String.valueOf(w);
            res[i][1] = String.valueOf(hw[i][1]);
            res[i][2] = String.valueOf(bmi);
            res[i][3] = st;
        }
        return res;
    }

    static void show(String[][] res) {
        System.out.printf("%-8s %-8s %-8s %-12s\n","Weight","Height","BMI","Status");
        for (int i = 0; i < res.length; i++) {
            System.out.printf("%-8s %-8s %-8s %-12s\n",res[i][0],res[i][1],res[i][2],res[i][3]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] hw = getHW(n);
        String[][] res = calc(hw);
        show(res);


	}

}
