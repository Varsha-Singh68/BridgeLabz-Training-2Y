package Methods;

import java.util.*;

class OtpGenerator {

    public static int generateOtp() {
        return (int)(100000 + Math.random() * 900000);
    }

    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class Otp {
    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = OtpGenerator.generateOtp();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + OtpGenerator.areUnique(otps));
    }
}

