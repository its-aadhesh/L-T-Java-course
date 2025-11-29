package keywords;

/**
 * This class demonstrates the static and final keywords in Java:
 * - Static variables (class variables)
 * - Static methods
 * - Static blocks
 * - Static inner classes
 * - Final variables (constants)
 * - Final methods
 * - Final classes
 */
public class StaticFinalDemo {
    
    // Static variable (class variable)
    private static int instanceCount = 0;
    
    // Final variable (constant)
    private final String id;
    
    // Static final constant
    public static final double PI = 3.14159265359;
    public static final String APP_NAME = "Static & Final Demo";
    
    // Static block - executed when the class is loaded
    static {
        System.out.println("Static block executed");
        System.out.println("Initializing application: " + APP_NAME);
    }
    
    // Constructor
    public StaticFinalDemo(String id) {
        this.id = id; // Initialize final variable
        instanceCount++; // Increment static counter
    }
    
    // Static method
    public static int getInstanceCount() {
        return instanceCount;
    }
    
    // Final method - cannot be overridden by subclasses
    public final void displayId() {
        System.out.println("Object ID: " + id);
    }
    
    // Static inner class
    public static class StaticHelper {
        public static void help() {
            System.out.println("This is a helper method from a static inner class");
            System.out.println("Current instance count: " + instanceCount);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("STATIC KEYWORD EXAMPLES:");
        
        // Accessing static variables and methods
        System.out.println("Initial instance count: " + StaticFinalDemo.getInstanceCount());
        
        // Creating instances
        StaticFinalDemo obj1 = new StaticFinalDemo("A001");
        StaticFinalDemo obj2 = new StaticFinalDemo("B002");
        StaticFinalDemo obj3 = new StaticFinalDemo("C003");
        
        // Static method shows total count
        System.out.println("Current instance count: " + StaticFinalDemo.getInstanceCount());
        
        // Using static inner class
        StaticFinalDemo.StaticHelper.help();
        
        // Using MathUtils static methods
        System.out.println("\nUsing static utility methods:");
        System.out.println("Square of 5: " + MathUtils.square(5));
        System.out.println("Cube of 3: " + MathUtils.cube(3));
        System.out.println("Max of 10 and 20: " + MathUtils.max(10, 20));
        
        System.out.println("\nFINAL KEYWORD EXAMPLES:");
        
        // Using final variables
        System.out.println("PI constant: " + PI);
        System.out.println("APP_NAME constant: " + APP_NAME);
        
        // Final variables must be initialized and cannot be changed
        // PI = 3.14; // This would cause a compilation error
        
        // Using final methods
        obj1.displayId();
        obj2.displayId();
        obj3.displayId();
        
        // Creating an instance of a final class
        FinalCircle circle = new FinalCircle(5.0);
        System.out.println("Circle area: " + circle.calculateArea());
        
        // Cannot extend a final class
        // class SubCircle extends FinalCircle {} // This would cause a compilation error
        
        // Using a class with final methods
        Vehicle vehicle = new Vehicle("Toyota", "Camry");
        vehicle.displayInfo();
        
        // Extending a class with final methods
        Car car = new Car("Honda", "Civic", 4);
        car.displayInfo(); // Can use the final method
        // car.getManufacturer() is inherited and final, cannot be overridden
    }
}

/**
 * Utility class with static methods
 */
class MathUtils {
    // Private constructor to prevent instantiation
    private MathUtils() {
        throw new AssertionError("Utility class should not be instantiated");
    }
    
    // Static utility methods
    public static int square(int num) {
        return num * num;
    }
    
    public static int cube(int num) {
        return num * num * num;
    }
    
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}

/**
 * Final class - cannot be extended
 */
final class FinalCircle {
    private double radius;
    
    public FinalCircle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Class with final methods
 */
class Vehicle {
    private final String manufacturer; // final instance variable
    private String model;
    
    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    
    // Final method - cannot be overridden
    public final String getManufacturer() {
        return manufacturer;
    }
    
    // Regular method - can be overridden
    public void displayInfo() {
        System.out.println("Vehicle: " + manufacturer + " " + model);
    }
}

/**
 * Subclass of Vehicle
 */
class Car extends Vehicle {
    private int doors;
    
    public Car(String manufacturer, String model, int doors) {
        super(manufacturer, model);
        this.doors = doors;
    }
    
    // Override non-final method
    @Override
    public void displayInfo() {
        System.out.println("Car: " + getManufacturer() + " with " + doors + " doors");
    }
    
    // Cannot override final method
    // @Override
    // public String getManufacturer() { // This would cause a compilation error
    //     return "Override: " + super.getManufacturer();
    // }
}
