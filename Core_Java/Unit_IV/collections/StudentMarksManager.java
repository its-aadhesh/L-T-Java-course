/* Putting It All Together – Small Mini Project

Problem:
Create a program to manage students and their marks:

 Use `List<String>` to store student names.
 Use `Map<String, Integer>` to store name → marks.
 Print:

   All student names (sorted).
   The highest and lowest marks.
*/

import java.util.*;

public class StudentMarksManager {
    public static void main(String[] args) {
        // Names
        List<String> students = new ArrayList<>();
        students.add("Usha");
        students.add("Amit");
        students.add("Ravi");

        // Map of name -> marks
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Usha", 95);
        marks.put("Amit", 88);
        marks.put("Ravi", 76);

        // Sort student names
        Collections.sort(students);

        System.out.println("Students (sorted):");
        for (String s : students) {
            System.out.println(s + " : " + marks.get(s));
        }

        // Find highest and lowest marks
        int maxMarks = Integer.MIN_VALUE;
        int minMarks = Integer.MAX_VALUE;
        String topper = "";
        String lowest = "";

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            String name = entry.getKey();
            int mark = entry.getValue();

            if (mark > maxMarks) {
                maxMarks = mark;
                topper = name;
            }
            if (mark < minMarks) {
                minMarks = mark;
                lowest = name;
            }
        }

        System.out.println("\nTopper: " + topper + " with " + maxMarks);
        System.out.println("Lowest: " + lowest + " with " + minMarks);
    }
}