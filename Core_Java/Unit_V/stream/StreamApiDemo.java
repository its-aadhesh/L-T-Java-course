package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Stream API Demo
 * Shows basic stream operations: filter, map, forEach.
 */
public class StreamApiDemo {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList
    (1, 2, 3, 4, 5);
    numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(n -> System.out.println
                ("Square of even: " + n));
    }
}
