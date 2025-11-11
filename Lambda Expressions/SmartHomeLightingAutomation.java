package lambda_expressions;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {
        LightAction motionDetected = () -> System.out.println("Motion detected → Lights ON");
        LightAction nightTime = () -> System.out.println("Night time → Lights dimmed to 30%");
        LightAction voiceCommand = () -> System.out.println("Voice command → Color lights set to party mode!");

        System.out.println("=== Smart Lighting Automation ===");
        motionDetected.activate();
        nightTime.activate();
        voiceCommand.activate();
    }
}
