package interfaceDemo;

/**
 * Default and Static Method Demo
 * Shows default and static methods in interfaces (Java 8+).
 */
interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

public class DefaultStaticMethodDemo implements MyInterface {
    public static void main(String[] args) {
        DefaultStaticMethodDemo d =new DefaultStaticMethodDemo();
        d.defaultMethod();
        MyInterface.staticMethod();
    }
}
