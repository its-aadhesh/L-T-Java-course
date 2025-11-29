package collectionfram;

import java.util.HashMap;
import java.util.Map;

/**
 * Map Interface and Implementations Demo
 * Shows HashMap usage and traversal.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);
        // Traversal using entrySet
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Traversal using keySet
        for (String key : scores.keySet()) {
            System.out.println(key + "'s score: " + scores.get(key));
        }
    }
}
