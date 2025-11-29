package collectionfram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * List and Set Implementation Demo
 * Shows ArrayList and HashSet usage.
 */
public class ListSetDemo {
    public static void main(String[] args) {
        // List example
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplicates allowed
        System.out.println("List: " + names);

        // Set example
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicates ignored
        System.out.println("Set: " + uniqueNames);
    }
}
