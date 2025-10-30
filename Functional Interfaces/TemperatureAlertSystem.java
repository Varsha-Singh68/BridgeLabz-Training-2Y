package functional_interface;

interface TemperatureCheck {
    void check(double temperature);
}

public class TemperatureAlertSystem {
    public static void main(String[] args) {

        TemperatureCheck alert = t -> {
            if (t > 40)
                System.out.println("Alert! Temperature " + t + " is above threshold.");
            else
                System.out.println("Temperature " + t + " is normal.");
        };

        alert.check(36.5);
        alert.check(42.8);
    }
}
