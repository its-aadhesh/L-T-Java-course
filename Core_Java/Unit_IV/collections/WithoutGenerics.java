/* Generics & Collections Utility Methods

Why Generics?

Without generics (old style):

Key points:

 Generics give type safety.
 Avoid runtime `ClassCastException`.
*/

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList(); // raw type, NOT recommended
        list.add("Hello");
        list.add(10); // allowed at compile time

        // Risk of ClassCastException at runtime
        String s = (String) list.get(1); // runtime error
    }
}


// 1. With generics:

/*
import java.util.ArrayList;
import java.util.List;

public class WithGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        // list.add(10); // compile-time error: good!

        String s = list.get(0); // No cast needed
        System.out.println(s);
    }
}
*/



// 2. `Collections` utility class

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(1);
        nums.add(3);

        System.out.println("Original: " + nums);

        Collections.sort(nums);
        System.out.println("Sorted: " + nums);

        Collections.reverse(nums);
        System.out.println("Reversed: " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
*/

