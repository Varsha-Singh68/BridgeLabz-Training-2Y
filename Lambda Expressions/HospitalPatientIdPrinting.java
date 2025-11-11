package lambda_expressions;

import java.util.*;

public class HospitalPatientIdPrinting {
    public static void main(String[] args) {
        List<Integer> patientIDs = Arrays.asList(1001, 1002, 1003, 1004, 1005);

        System.out.println("Patient IDs for Verification:");
        patientIDs.forEach(System.out::println);
    }
}

