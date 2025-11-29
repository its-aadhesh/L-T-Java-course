package lambda;

/**
 * Lambda Expressions Demo
 * Shows basic usage of lambda expressions in Java 8.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello from Lambda!");
        r.run();
        // Lambda with parameters
        MathOperation add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operation(5, 3));
    }
    interface MathOperation {
        int operation(int a, int b);
    }
}
