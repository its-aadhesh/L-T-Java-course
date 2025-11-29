package design;

/**
 * This class demonstrates proper class design principles:
 * - Encapsulation (private fields with public getters/setters)
 * - Access modifiers (public, private, protected)
 * - Proper constructors
 * - Method design
 * - Instance vs class members
 */
public class ClassDesignDemo {
    
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("123456789", "John Doe");
        
        // Using public methods to interact with the object
        account.deposit(1000);
        System.out.println("Current balance: $" + account.getBalance());
        
        boolean withdrawalSuccess = account.withdraw(500);
        if (withdrawalSuccess) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal failed");
        }
        
        System.out.println("Updated balance: $" + account.getBalance());
        
        // This would cause a compilation error because balance is private
        // account.balance = 1000000; // Illegal direct access
        
        // Creating a Student object and demonstrating encapsulation
        Student student = new Student("Alice", "Smith", 3.8);
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + student.getFullName());
        System.out.println("GPA: " + student.getGpa());
        
        // Update student information through proper methods
        student.setGpa(4.0);
        System.out.println("Updated GPA: " + student.getGpa());
        
        // Demonstrating validation in setters
        student.setGpa(5.2); // Should be capped at 4.0
        System.out.println("Attempted to set GPA to 5.2, actual GPA: " + student.getGpa());
    }
}

/**
 * BankAccount class with proper encapsulation
 */
class BankAccount {
    // Private instance variables (encapsulation)
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    // Public constructor
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }
    
    // Public methods to access and modify private data
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
            return false;
        }
    }
}

/**
 * Student class demonstrating proper encapsulation and validation
 */
class Student {
    // Private instance variables
    private String firstName;
    private String lastName;
    private double gpa;
    
    // Constructor
    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGpa(gpa); // Using setter for validation
    }
    
    // Getters and setters with proper validation
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName;
        }
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName;
        }
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Setter with validation
    public void setGpa(double gpa) {
        if (gpa < 0) {
            this.gpa = 0;
        } else if (gpa > 4.0) {
            this.gpa = 4.0; // Cap at maximum GPA
        } else {
            this.gpa = gpa;
        }
    }
}
