/* Collections Framework Overview

Collection (root interface for List, Set, Queue)

   List – ordered, duplicates allowed
   Set – no duplicates
   Queue – FIFO (usually)
   Map – key–value pairs, keys unique

Key points:

 List keeps order and duplicates.
 Set keeps unique values.
 Map stores key→value and overwrites by key.
   
*/

import java.util.*;

public class CollectionsOverview {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();

        list.add("A");
        list.add("B");
        list.add("A");  // duplicates allowed

        set.add("A");
        set.add("B");
        set.add("A");   // duplicate ignored

        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "New One"); // key 1 overwritten

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
    }
}
