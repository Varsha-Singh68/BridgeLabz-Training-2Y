package map;

import java.util.Map;
import java.util.TreeMap;

public class LibraryBookCatalog {
    public static void main(String[] args) {

        Map<String, String> catalog = new TreeMap<>();

        catalog.put("978-1111111111", "Data Structures");
        catalog.put("978-2222222222", "Operating Systems");
        catalog.put("978-3333333333", "Database Management");
        catalog.put("978-4444444444", "Computer Networks");

        String searchISBN = "978-2222222222";
        if (catalog.containsKey(searchISBN))
            System.out.println("Found: " + catalog.get(searchISBN));
        else
            System.out.println("Book not found");

        catalog.remove("978-3333333333");

        System.out.println("\nAll books (sorted by ISBN):");
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        String searchTitle = "Computer Networks";
        boolean found = false;

        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(searchTitle)) {
                System.out.println("\nTitle found: " + entry.getKey());
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("\nTitle not found");
    }
}

