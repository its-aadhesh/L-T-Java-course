/* Map Interface – HashMap, LinkedHashMap, TreeMap 

What is a Map?

 Stores key–value pairs.
 Keys are unique, values can be duplicated.

Key points:
 `put`, `get`, `containsKey`, `remove`, `entrySet`.
 Keys must be unique → last `put` with same key wins.

 Discuss briefly:
 HashMap: fast, no order.
 LinkedHashMap: preserves insertion order.
 TreeMap: sorts by key.
*/
// 1. `HashMap` basic example


import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Usha");
        students.put(2, "Amit");
        students.put(3, "Ravi");

        // Overwrite value for key 2
        students.put(2, "Amit Kumar");

        // Access value by key
        System.out.println("Student with roll 1: " + students.get(1));

        // Check if key exists
        System.out.println("Contains key 3? " + students.containsKey(3));

        // Remove by key
        students.remove(3);

        // Iterate: entrySet()
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}


// 2. `LinkedHashMap` – insertion order

/*
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new LinkedHashMap<>();

        scores.put("Math", 90);
        scores.put("Science", 85);
        scores.put("English", 88);

        System.out.println(scores); // Maintains insertion order
    }
}
*/

// 3. `TreeMap` – sorted by key

/*
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new TreeMap<>();

        wordCount.put("Banana", 2);
        wordCount.put("Apple", 5);
        wordCount.put("Cherry", 3);

        System.out.println(wordCount); // Keys sorted: Apple, Banana, Cherry
    }
}
*/

/*Mini Exercise:

 Build a `Map<String, Integer>` that stores product names and price.
 Print each product with its price.
*/
