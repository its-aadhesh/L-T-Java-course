package collectionfram;
/*| Interface | Implementation Classes                     |
| --------- | ------------------------------------------ |
| List      | ArrayList, LinkedList, Vector, Stack       |
| Set       | HashSet, LinkedHashSet, TreeSet            |
| Queue     | PriorityQueue, LinkedList                  |
| Map       | HashMap, LinkedHashMap, TreeMap, Hashtable |
 */
// ArrayList (List Interface) — allows duplicates, maintains order
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Usha");
        list.add("Rahul");
        list.add("Rahul"); // duplicates allowed
        list.add("Amit");

        System.out.println("ArrayList: " + list);

        list.remove("Amit");
        System.out.println("After remove: " + list);

        System.out.println("Get 1st index: " + list.get(1));
    }
}
// HashSet (Set Interface) — no duplicates, unordered
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();

//         set.add(10);
//         set.add(20);
//         set.add(20); // ignored (no duplicates)
//         set.add(30);

//         System.out.println("HashSet: " + set);
//     }
// }
// // LinkedHashSet — no duplicates, but maintains insertion order
// import java.util.*;

// public class DemoSet {
//     public static void main(String[] args) {
//         LinkedHashSet<String> lhs = new LinkedHashSet<>();

//         lhs.add("Apple");
//         lhs.add("Banana");
//         lhs.add("Apple"); // duplicate not allowed
//         lhs.add("Mango");

//         System.out.println("LinkedHashSet: " + lhs);
//     }
// }
// // TreeSet — sorted set, no duplicates
// import java.util.*;

// public class DemoSet {
//     public static void main(String[] args) {
//         TreeSet<Integer> ts = new TreeSet<>();

//         ts.add(50);
//         ts.add(10);
//         ts.add(40);
//         ts.add(40);

//         System.out.println("TreeSet(sorted): " + ts);
//     }
// }
// // Queue – PriorityQueue — smallest element has highest priority
// import java.util.*;

// public class DemoQueue {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         pq.add(40);
//         pq.add(10);
//         pq.add(30);
//         pq.add(20);

//         System.out.println("PriorityQueue: " + pq);
//         System.out.println("Poll(remove): " + pq.poll());
//         System.out.println("After Poll: " + pq);
//     }
// }
// // Map – HashMap — key value pair, unique keys
// import java.util.*;

// public class DemoMap {
//     public static void main(String[] args) {
//         HashMap<Integer, String> map = new HashMap<>();

//         map.put(1, "Usha");
//         map.put(2, "Amit");
//         map.put(3, "Rahul");
//         map.put(2, "Neha"); // replaces Amit (key must be unique)

//         System.out.println("HashMap: " + map);
//         System.out.println("Get key 2: " + map.get(2));

//         map.remove(1);
//         System.out.println("After remove: " + map);
//     }
// }
// // Iterating Collections Using Loops
// // Using for-each loop:
// import java.util.*;

// public class LoopDemo {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("One");
//         list.add("Two");
//         list.add("Three");

//         for (String s : list) {
//             System.out.println(s);
//         }
//     }
// }
// // Iterate Map:
// import java.util.*;

// public class LoopDemo {
//     public static void main(String[] args) {
//         HashMap<Integer, String> map = new HashMap<>();
//         map.put(1, "A");
//         map.put(2, "B");
//         map.put(3, "C");

//         for (Map.Entry<Integer, String> e : map.entrySet()) {
//             System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
//         }
//     }
// }
// // User-Defined Objects in Collection
// import java.util.*;

// class Student {
//     int id;
//     String name;

//     Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public String toString() {
//         return id + " - " + name;
//     }
// }

// public class DemoObjectList {
//     public static void main(String[] args) {
//         ArrayList<Student> students = new ArrayList<>();

//         students.add(new Student(101, "Usha"));
//         students.add(new Student(102, "Rahul"));
//         students.add(new Student(103, "Amit"));

//         System.out.println("Students List: " + students);
//     }
// }
