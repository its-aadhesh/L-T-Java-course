package overloading;

/**
 * This class demonstrates constructor and method overloading:
 * - Multiple constructors with different parameters
 * - Methods with the same name but different parameters
 */
public class OverloadingDemo {
    
    public static void main(String[] args) {
        // Demonstrating constructor overloading
        System.out.println("Constructor Overloading Examples:");
        
        // Using different constructors
        Rectangle rect1 = new Rectangle(); // No-arg constructor
        Rectangle rect2 = new Rectangle(5.0, 3.0); // Two parameters
        Rectangle rect3 = new Rectangle(4.0); // One parameter (square)
        Rectangle rect4 = new Rectangle("Blue", 6.0, 2.0); // Three parameters
        
        // Display rectangle information
        System.out.println("\nRectangle 1 (default):");
        rect1.displayInfo();
        
        System.out.println("\nRectangle 2 (width=5.0, height=3.0):");
        rect2.displayInfo();
        
        System.out.println("\nRectangle 3 (square with side=4.0):");
        rect3.displayInfo();
        
        System.out.println("\nRectangle 4 (blue, width=6.0, height=2.0):");
        rect4.displayInfo();
        
        // Demonstrating method overloading
        System.out.println("\n\nMethod Overloading Examples:");
        Calculator calc = new Calculator();
        
        // Using overloaded add methods
        System.out.println("Adding two integers: " + calc.add(5, 3));
        System.out.println("Adding three integers: " + calc.add(5, 3, 2));
        System.out.println("Adding two doubles: " + calc.add(5.5, 3.5));
        System.out.println("Adding a string and an integer: " + calc.add("5", 3));
        
        // Using overloaded print methods
        System.out.println("\nPrinting different types:");
        calc.print(10);
        calc.print("Hello");
        calc.print(3.14);
        calc.print(true);
    }
}

/**
 * Rectangle class demonstrating constructor overloading
 */
class Rectangle {
    private double width;
    private double height;
    private String color;
    
    // No-argument constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.color = "White";
    }
    
    // Constructor with two parameters
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "White";
    }
    
    // Constructor for a square (one parameter)
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
        this.color = "White";
    }
    
    // Constructor with color and dimensions
    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return width * height;
    }
    
    // Method to display rectangle information
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}

/**
 * Calculator class demonstrating method overloading
 */
class Calculator {
    // Overloaded add methods
    
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Add a string and an integer (converts string to int)
    public int add(String a, int b) {
        return Integer.parseInt(a) + b;
    }
    
    // Overloaded print methods
    
    // Print an integer
    public void print(int value) {
        System.out.println("Integer: " + value);
    }
    
    // Print a string
    public void print(String value) {
        System.out.println("String: " + value);
    }
    
    // Print a double
    public void print(double value) {
        System.out.println("Double: " + value);
    }
    
    // Print a boolean
    public void print(boolean value) {
        System.out.println("Boolean: " + value);
    }
}
