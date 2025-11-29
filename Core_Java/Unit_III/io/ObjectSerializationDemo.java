package io;

import java.io.*;

class Student implements Serializable {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectSerializationDemo {
    public static void main(String[] args) {
        Student s = new Student("Alice", 20);
        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s);
            System.out.println("Object serialized.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("Deserialized Student: " + s2.name + ", " + s2.age);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
