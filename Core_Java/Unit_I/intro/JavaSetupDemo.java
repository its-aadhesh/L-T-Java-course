package intro;

/**
 * Java Fundamentals and Environment Setup Demo
 * Shows basic Java structure and how to print environment info.
 */
public class JavaSetupDemo {
    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("Hello, Java Environment!");
    }
}
