package functional_interface;


interface SmartDevice {
 void turnOn();
 default void turnOff() {
     System.out.println("Device turned OFF.");
 }
}

public class SmartDeviceControl {
 public static void main(String[] args) {

     SmartDevice light = () -> System.out.println("Light is turned ON.");
     SmartDevice ac = () -> System.out.println("Air Conditioner is turned ON.");
     SmartDevice tv = () -> System.out.println("Television is turned ON.");

     
     light.turnOn();
     light.turnOff();

     ac.turnOn();
     ac.turnOff();

     tv.turnOn();
     tv.turnOff();
 }
}




