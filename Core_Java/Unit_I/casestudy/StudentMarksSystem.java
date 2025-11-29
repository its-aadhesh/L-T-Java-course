package casestudy;

import java.util.Scanner;

/**
 * Student Marks Management System
 * Demonstrates arrays, control flow, and basic I/O.
 */
public class StudentMarksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];
        int max = -1, topperIdx = -1;
        int sum = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter marks for " + names[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();
            sum += marks[i];
            if (marks[i] > max) 
            { 
                max = marks[i]; 
                topperIdx = i; 
            }
        }
        System.out.println("\nAll Students:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + ": " + marks[i]);
        }
        System.out.println("Average marks: " + (sum / (double)n));
        System.out.println("Topper: " + names[topperIdx] + " (" + max + ")");
        sc.close();
    }
}
