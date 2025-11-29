package intro;

/**
 * Algorithm and Pseudocode Demo
 * This file demonstrates how to translate a simple algorithm/pseudocode into Java code.
 * Example: Find the sum of first N natural numbers.
 */
public class AlgorithmAndPseudocodeDemo {
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;
        // Algorithm: For i = 1 to N, sum = sum + i
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + N + " natural numbers: " + sum);
    }
}
