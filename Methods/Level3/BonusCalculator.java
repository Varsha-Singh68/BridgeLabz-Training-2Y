package Methods;
import java.util.*;

class ZaraBonusCalculator {

    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2]; 
        Random rand = new Random();

        for (int i = 0; i < employees; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(10);         // years of service between 1-10
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][3]; 
        // old salary, bonus, new salary

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    public static void calculateTotals(double[][] result) {
        double sumOld = 0, sumNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-12s %-12s %-12s %-12s%n", 
                          "Emp", "Old Salary", "Bonus", "New Salary", "Years");

        for (int i = 0; i < result.length; i++) {
            sumOld += result[i][0];
            totalBonus += result[i][1];
            sumNew += result[i][2];
        }
        System.out.println("---------------------------------------------");
        System.out.printf("%-5s %-12.2f %-12.2f %-12.2f%n", 
                          "Total", sumOld, totalBonus, sumNew);
    }
}

public class BonusCalculator {
    public static void main(String[] args) {
        int employees = 10;

        int[][] employeeData = ZaraBonusCalculator.generateEmployeeData(employees);
        double[][] bonusData = ZaraBonusCalculator.calculateBonus(employeeData);

        System.out.printf("%-5s %-12s %-12s %-12s %-12s%n", 
                          "Emp", "Old Salary", "Bonus", "New Salary", "Years");

        for (int i = 0; i < employees; i++) {
            System.out.printf("%-5d %-12.2f %-12.2f %-12.2f %-12d%n", 
                              (i + 1), bonusData[i][0], bonusData[i][1], 
                              bonusData[i][2], employeeData[i][1]);
        }

        System.out.println();
        ZaraBonusCalculator.calculateTotals(bonusData);
    }
}





