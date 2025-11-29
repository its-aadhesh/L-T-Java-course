package inheritance;

/**
 * This class demonstrates inheritance and polymorphism:
 * - Parent/child class relationships
 * - Method overriding
 * - Runtime polymorphism
 * - The 'super' keyword
 * - Abstract classes
 */
public class InheritanceDemo {
    
    public static void main(String[] args) {
        // Creating objects of different types
        System.out.println("INHERITANCE EXAMPLES:");
        
        // Creating a Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println("\nDog Information:");
        dog.displayInfo();
        dog.makeSound();
        dog.fetch();
        
        // Creating a Cat object
        Cat cat = new Cat("Whiskers", 2, 9);
        System.out.println("\nCat Information:");
        cat.displayInfo();
        cat.makeSound();
        cat.climb();
        
        // Demonstrating polymorphism
        System.out.println("\nPOLYMORPHISM EXAMPLES:");
        
        // Animal reference can point to any Animal subclass
        Animal animal1 = new Dog("Rex", 5, "German Shepherd");
        Animal animal2 = new Cat("Mittens", 4, 7);
        
        System.out.println("\nPolymorphic behavior with Animal references:");
        processAnimal(animal1); // Passes a Dog as an Animal
        processAnimal(animal2); // Passes a Cat as an Animal
        
        // Demonstrating abstract classes
        System.out.println("\nABSTRACT CLASS EXAMPLES:");
        
        // Cannot instantiate abstract class
        // Shape shape = new Shape(); // This would cause a compilation error
        
        // But can create objects of concrete subclasses
        Circle circle = new Circle("Red", 5.0);
        Square square = new Square("Blue", 4.0);
        
        System.out.println("\nCircle Information:");
        circle.displayInfo();
        System.out.println("Area: " + circle.calculateArea());
        
        System.out.println("\nSquare Information:");
        square.displayInfo();
        System.out.println("Area: " + square.calculateArea());
        
        // Polymorphic array of shapes
        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = square;
        
        System.out.println("\nCalculating areas polymorphically:");
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area: " + shape.calculateArea());
        }
    }
    
    // Method demonstrating polymorphism
    public static void processAnimal(Animal animal) {
        System.out.println("\nProcessing " + animal.getClass().getSimpleName() + ":");
        animal.displayInfo();
        animal.makeSound(); // This calls the overridden method in the subclass
    }
}

/**
 * Parent class for animal hierarchy
 */
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
    
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

/**
 * Dog class inherits from Animal
 */
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age); // Call parent constructor
        this.breed = breed;
    }
    
    // Override parent method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Breed: " + breed);
    }
    
    // Override parent method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    // Dog-specific method
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

/**
 * Cat class inherits from Animal
 */
class Cat extends Animal {
    private int lives;
    
    public Cat(String name, int age, int lives) {
        super(name, age); // Call parent constructor
        this.lives = lives;
    }
    
    // Override parent method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Lives remaining: " + lives);
    }
    
    // Override parent method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
    
    // Cat-specific method
    public void climb() {
        System.out.println(name + " is climbing the tree!");
    }
}

/**
 * Abstract class example
 */
abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public void displayInfo() {
        System.out.println("Color: " + color);
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract double calculateArea();
}

/**
 * Circle class extends abstract Shape class
 */
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
    }
    
    // Implementation of abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Square class extends abstract Shape class
 */
class Square extends Shape {
    private double side;
    
    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Side length: " + side);
    }
    
    // Implementation of abstract method
    @Override
    public double calculateArea() {
        return side * side;
    }
}
