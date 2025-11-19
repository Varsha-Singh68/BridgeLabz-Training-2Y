package map;

import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington D.C.");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("China", "Beijing");
        map.put("Brazil", "Brasilia");
        map.put("Australia", "Canberra");

        String country = "Japan";
        if (map.containsKey(country))
            System.out.println("Capital: " + map.get(country));
        else
            System.out.println("Unknown country");

        System.out.println("\nAll Countries (Alphabetical):");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

