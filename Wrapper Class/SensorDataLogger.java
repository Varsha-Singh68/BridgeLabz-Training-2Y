package wrapper_class;

import java.util.ArrayList;

public class SensorDataLogger {
    public static void logTemperature(double temperature) {
        System.out.println("Logged temperature (primitive): " + temperature);
    }

    public static void logTemperature(Double temperature) {
        System.out.println("Logged temperature (wrapper): " + temperature);
    }

    public static void main(String[] args) {
        double tempPrimitive = 36.6;  
        Double tempWrapper = 38.2;    
        logTemperature(tempPrimitive);  
        logTemperature(tempWrapper);    
        ArrayList<Double> temperatureLog = new ArrayList<>();
        temperatureLog.add(tempPrimitive);
        temperatureLog.add(tempWrapper);
        System.out.println("Stored Temperatures: " + temperatureLog);
        double average = 0;
        for (Double t : temperatureLog) {
            average += t;  
        }
        average /= temperatureLog.size();
        System.out.println("Average Temperature: " + average);
    }
}

