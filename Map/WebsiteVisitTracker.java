package map;

import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        String[] visitedPages = {
            "home", "about", "products", "contact",
            "home", "products", "home", "about",
            "home", "services", "products", "home"
        };

        for (String page : visitedPages) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(visits.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Pages sorted by descending visit count:");
        for (Map.Entry<String, Integer> e : sorted) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

        Map.Entry<String, Integer> mostVisited = sorted.get(0);

        System.out.println("\nMost Visited Page:");
        System.out.println(mostVisited.getKey() + " → " + mostVisited.getValue());
    }
}
