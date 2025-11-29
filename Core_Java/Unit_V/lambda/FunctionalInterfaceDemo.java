package lambda;

/**
 * Functional Interface Demo
 * Shows a custom functional interface and usage with lambda.
 */
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name + "!");
        greet.sayHello("World");
    }
}
