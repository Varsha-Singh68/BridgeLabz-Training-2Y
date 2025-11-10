package exception_handling;

import java.util.Scanner;

class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    public static double convert(double value, char unit) throws InvalidTemperatureException {
        if ((unit == 'C' || unit == 'c') && value < -273.15)
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        else if ((unit == 'F' || unit == 'f') && value < -459.67)
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");

        if (unit == 'C' || unit == 'c')
            return (value * 9 / 5) + 32; 
        else if (unit == 'F' || unit == 'f')
            return (value - 32) * 5 / 9; 
        else
            throw new InvalidTemperatureException("Invalid unit entered! Use 'C' or 'F'.");
    }
}

public class TemperatureConversionTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter temperature value: ");
            double temp = sc.nextDouble();
            System.out.print("Enter unit (C/F): ");
            char unit = sc.next().charAt(0);

            double converted = TemperatureConverter.convert(temp, unit);

            if (unit == 'C' || unit == 'c')
                System.out.printf("%.2f°C = %.2f°F%n", temp, converted);
            else
                System.out.printf("%.2f°F = %.2f°C%n", temp, converted);

        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a numeric value and valid unit.");
        } finally {
            sc.close();
        }
    }
}

