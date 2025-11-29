package exercises;
import java.util.*;

public class lambdaDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
            .filter(n -> (n % 2) != 0)
            .map(n -> n* 10)
            .forEach(n -> System.out.println(" The Odd numbers multiplied by 10 are : "+n));
    }
}
