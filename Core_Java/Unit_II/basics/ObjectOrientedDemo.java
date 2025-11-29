package basics;

/**
 * This class demonstrates the fundamental concepts of Object-Oriented Programming:
 * - Classes and Objects
 * - Attributes (instance variables)
 * - Methods
 * - Encapsulation basics
 */
public class ObjectOrientedDemo {
    
    public static void main(String[] args) {
        // Creating objects (instances of the Car class)
        Car myCar = new Car("Toyota", "Corolla", 2020);
        Car friendsCar = new Car("Honda", "Civic", 2019);
        
        // Accessing object attributes and methods
        System.out.println("My car details:");
        myCar.displayDetails();
        
        System.out.println("\nFriend's car details:");
        friendsCar.displayDetails();
        
        // Modifying object state
        System.out.println("\nAfter driving my car:");
        myCar.drive(100);
        myCar.displayDetails();
        
        // Creating a Person object
        Person person = new Person("John", 25);
        System.out.println("\nPerson details:");
        person.introduce();
        person.celebrateBirthday();
        person.introduce();
    }
}

/**
 * Car class - represents a car with attributes and behaviors
 */
class Car {
    // Attributes (instance variables)
    private String make;
    private String model;
    private int year;
    private int mileage;
    
    // Constructor - initializes the object
    public Car(String m, String mo, int y) {
        this.make = m;
        this.model = mo;
        this.year = y;
        this.mileage = 0;
    }
    
    // Methods - define behaviors
    public void drive(int distance) {
        mileage += distance;
        System.out.println("Driving " + distance + " miles. Total mileage: " + mileage);
    }
    
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}

/**
 * Person class - another example of a class with attributes and behaviors
 */
class Person {
    // Attributes
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    
    public void celebrateBirthday() {
        age++;
        System.out.println(name + " is celebrating a birthday! Now " + age + " years old.");
    }
}
