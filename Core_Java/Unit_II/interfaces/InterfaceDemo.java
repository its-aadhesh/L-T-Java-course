package interfaces;

/**
 * This class demonstrates interfaces in Java:
 * - Interface definition
 * - Interface implementation
 * - Multiple interface implementation
 * - Default methods in interfaces (Java 8+)
 * - Static methods in interfaces (Java 8+)
 * - Functional interfaces (Java 8+)
 */
public class InterfaceDemo {
    
    public static void main(String[] args) {
        // Basic interface implementation
        System.out.println("BASIC INTERFACE IMPLEMENTATION:");
        
        // Creating objects that implement interfaces
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        
        // Using interface methods
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        
        // Multiple interface implementation
        System.out.println("\nMULTIPLE INTERFACE IMPLEMENTATION:");
        
        Smartphone smartphone = new Smartphone();
        smartphone.call("123-456-7890");
        smartphone.takePhoto();
        smartphone.browseInternet("www.example.com");
        
        // Default methods in interfaces
        System.out.println("\nDEFAULT METHODS IN INTERFACES:");
        
        Vehicle car = new Car("Toyota", "Camry");
        Vehicle motorcycle = new Motorcycle("Honda", "CBR");
        
        car.start();
        car.displayInfo(); // Using default method
        car.stop();
        
        motorcycle.start();
        motorcycle.displayInfo(); // Using default method
        motorcycle.stop();
        
        // Static methods in interfaces
        System.out.println("\nSTATIC METHODS IN INTERFACES:");
        
        double circleArea = ShapeUtil.calculateCircleArea(3.0);
        double rectangleArea = ShapeUtil.calculateRectangleArea(2.0, 4.0);
        
        System.out.println("Circle area (using static method): " + circleArea);
        System.out.println("Rectangle area (using static method): " + rectangleArea);
        
        // Functional interfaces
        System.out.println("\nFUNCTIONAL INTERFACES:");
        
        // Using a class that implements a functional interface
        MathOperation addition = new Addition();
        System.out.println("10 + 5 = " + addition.operate(10, 5));
        
        // Using lambda expressions with functional interfaces
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;
        
        System.out.println("10 - 5 = " + subtraction.operate(10, 5));
        System.out.println("10 * 5 = " + multiplication.operate(10, 5));
        System.out.println("10 / 5 = " + division.operate(10, 5));
    }
}

/**
 * Basic interface definition
 */
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

/**
 * Circle class implementing Shape interface
 */
class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

/**
 * Rectangle class implementing Shape interface
 */
class Rectangle implements Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

/**
 * Multiple interface example
 */
interface Phone {
    void call(String number);
}

interface Camera {
    void takePhoto();
}

interface WebBrowser {
    void browseInternet(String url);
}

/**
 * Class implementing multiple interfaces
 */
class Smartphone implements Phone, Camera, WebBrowser {
    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }
    
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }
    
    @Override
    public void browseInternet(String url) {
        System.out.println("Browsing " + url);
    }
}

/**
 * Interface with default method
 */
interface Vehicle {
    void start();
    void stop();
    
    // Default method (Java 8+)
    default void displayInfo() {
        System.out.println("This is a vehicle");
    }
}

/**
 * Classes implementing interface with default method
 */
class Car implements Vehicle {
    private String make;
    private String model;
    
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    @Override
    public void start() {
        System.out.println(make + " " + model + " car is starting");
    }
    
    @Override
    public void stop() {
        System.out.println(make + " " + model + " car is stopping");
    }
    
    // Override default method
    @Override
    public void displayInfo() {
        System.out.println("This is a " + make + " " + model + " car");
    }
}

class Motorcycle implements Vehicle {
    private String make;
    private String model;
    
    public Motorcycle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    @Override
    public void start() {
        System.out.println(make + " " + model + " motorcycle is starting");
    }
    
    @Override
    public void stop() {
        System.out.println(make + " " + model + " motorcycle is stopping");
    }
}

/**
 * Interface with static methods (Java 8+)
 */
interface ShapeUtil {
    // Static methods in interface
    static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
}

/**
 * Functional interface (has exactly one abstract method)
 */
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

/**
 * Class implementing functional interface
 */
class Addition implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
