package map;

import java.util.Map;
import java.util.HashMap;

public class InventoryManagement {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Sugar", 50);
        inventory.put("Rice", 100);
        inventory.put("Oil", 30);
        inventory.put("Milk", 10);

        inventory.put("Milk", inventory.get("Milk") - 10);
        if (inventory.get("Milk") <= 0) inventory.put("Milk", 0);

        inventory.put("Sugar", inventory.get("Sugar") - 20);
        if (inventory.get("Sugar") <= 0) inventory.put("Sugar", 0);

        inventory.put("Oil", inventory.get("Oil") - 30);
        if (inventory.get("Oil") <= 0) inventory.put("Oil", 0);

        inventory.put("Rice", inventory.get("Rice") + 40);
        inventory.put("Sugar", inventory.get("Sugar") + 25);

        String product = "Oil";
        if (inventory.containsKey(product))
            System.out.println(product + " remaining: " + inventory.get(product));
        else
            System.out.println(product + " not stocked");

        System.out.println("\nOut of stock products:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0)
                System.out.println(entry.getKey());
        }
    }
}

