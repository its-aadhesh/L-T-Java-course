package intro;

/**
 * Programming Paradigms and OOP Mastery Demo
 * Shows procedural vs. OOP approach in Java.
 */
class Car {
    String model;
    Car(String model) { this.model = model; }
    void drive() { System.out.println(model + " is driving."); }
}

public class ProgrammingParadigmsDemo {
    public static void main(String[] args) {
        // Procedural
        String carModel = "Honda";
        System.out.println(carModel + " is driving. (Procedural)");
        // OOP
        Car car = new Car("Toyota");
        car.drive();
    }
}
