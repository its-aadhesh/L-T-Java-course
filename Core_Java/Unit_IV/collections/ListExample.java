/* 1. List Interface – ArrayList & LinkedList

 `List<String>` is an interface. `ArrayList<>` is its implementation.
 `add`, `get`, `set`, `remove`, `size` are common operations.
 Use for-each loop to iterate.
*/

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> names = new ArrayList<>();

        // 1. Add elements
        names.add("Usha");
        names.add("Amit");
        names.add("Ravi");

        // 2. Access by index
        System.out.println("First name: " + names.get(0)); // Usha

        // 3. Update element
        names.set(1, "Amit Kumar");

        // 4. Remove element
        names.remove(2); // remove "Ravi" by index

        // 5. Size of the list
        System.out.println("Size: " + names.size());

        // 6. Iterate using for-each
        System.out.println("All names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

// 2. Iterating in multiple ways
/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterationExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // 1. Classic for loop
        System.out.println("Using classic for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }

        // 2. Enhanced for-each
        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 3. Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println(value);
        }
    }
}*/

/* Brief: ArrayList vs LinkedList

ArrayList

   Backed by a dynamic array.
   Fast random access (by index).
   Slower insert/remove in the middle (shifts elements).
 
LinkedList

   Backed by a doubly linked list.
   Fast insert/remove at start or middle (once you’re at node).
   Slower random access (no direct index).
*/
// 3. `LinkedList` small example

/*
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> tasks = new LinkedList<>();

        tasks.add("Wake up");
        tasks.add("Brush teeth");
        tasks.add(0, "Check phone"); // Insert at index 0

        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
*/

/*Mini Exercise for students:

 Create an `ArrayList<Integer>` of marks.
 Add 5 marks, print average, highest and lowest marks.
*/