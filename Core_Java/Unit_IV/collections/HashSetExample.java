/* Set Interface – HashSet, LinkedHashSet, TreeSet

Why Set?

 No duplicates.
 Often used for unique values (user IDs, unique tags, etc.).
Key points:

 `HashSet` does not maintain insertion order.
 Check membership with `contains`.
Explain differences clearly:

 HashSet → fast, no order.
 LinkedHashSet → insertion order.
 TreeSet → sorted order.*/


// 1. `HashSet` basic example

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();

        // Add elements
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Mumbai"); // duplicate, will be ignored

        System.out.println("Cities: " + cities);
        System.out.println("Contains Delhi? " + cities.contains("Delhi"));

        // Iterate
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

// 2. `LinkedHashSet` – maintains insertion order
/*
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> orderSet = new LinkedHashSet<>();

        orderSet.add("First");
        orderSet.add("Second");
        orderSet.add("Third");
        orderSet.add("Second"); // duplicate, ignored

        System.out.println(orderSet); // prints in insertion order
    }
}
*/

// 3. `TreeSet` – sorted order

/*
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10); // duplicate ignored

        System.out.println(numbers); // [10, 30, 50] sorted
    }
}*/


/* Mini Exercise:

Store names in `HashSet` and then in `TreeSet` and compare the output order.

*/
