package casestudy;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Optional;

/**
 * Employee Data Processing System
 * Demonstrates Java 8 features: lambda, streams, Optional, functional interfaces.
 */
class Employee {
    String name;
    String dept;
    double salary;
    Employee(String n, String d, double s) { name = n; dept = d; salary = s; }
}
public class EmployeeDataProcessor {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 70000),
            new Employee("Carol", "IT", 80000),
            new Employee("Dave", "HR", 60000)
        );
        // Filter by department and print names
        emps.stream().filter(e -> e.dept.equals("IT")).forEach(e -> System.out.println(e.name));
        // Average salary
        double avg = emps.stream().mapToDouble(e -> e.salary).average().orElse(0);
        System.out.println("Average Salary: " + avg);
        // Top earner
        Optional<Employee> top = emps.stream().max(Comparator.comparingDouble(e -> e.salary));
        top.ifPresent(e -> System.out.println("Top Earner: " + e.name));
    }
}
