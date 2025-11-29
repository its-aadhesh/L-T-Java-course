package collectionfram;
/*1. Why Collections?
 Arrays are fixed size and not very flexible.
 Collections are resizable, type-safe (with generics), and offer many useful operations (search, sort, etc.).
key points:
 - Arrays are fixed length.
 - `ArrayList` can grow and shrink.
 - Collections are in the package `java.util`.
 */
public class ArrayVsCollection {
    public static void main(String[] args) {
        // Using an array
        int[] marksArray = new int[3];
        marksArray[0] = 85;
        marksArray[1] = 90;
        marksArray[2] = 95;
        // marksArray[3] = 100; // ERROR: ArrayIndexOutOfBoundsException

        // Using a collection (ArrayList)
        java.util.ArrayList<Integer> marksList = new java.util.ArrayList<>();
        marksList.add(85);
        marksList.add(90);
        marksList.add(95);
        marksList.add(100); // No problem, list grows dynamically

        System.out.println("Array length: " + marksArray.length);
        System.out.println("List size: " + marksList.size());
    }
}

