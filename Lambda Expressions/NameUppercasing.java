package lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Rahul", "Sneha", "Amit", "Varsha");

        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Employee Names in Uppercase:");
        upperNames.forEach(System.out::println);
    }
}

