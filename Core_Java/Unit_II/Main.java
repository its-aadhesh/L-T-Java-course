/* 1. Class & Object

# What is a class?

A class is a blueprint (template) for creating objects.
It defines data (fields) and behavior (methods).

# What is an object?

An objectis an instance of a class.
It has its own copy of the fields and can use the methods.

# Example


BankAccount.java*/
public class BankAccount {
    // fields (state)
    String accountNumber;
    String holderName;
    double balance;

    // method (behavior)
    void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // creating objects
        BankAccount acc1 = new BankAccount();  // acc1 is an object
        acc1.accountNumber = "A123";
        acc1.holderName = "Usha";
        acc1.balance = 1000.0;

        BankAccount acc2 = new BankAccount();  // acc2 is another object
        acc2.accountNumber = "B456";
        acc2.holderName = "Rahul";
        acc2.balance = 5000.0;

        acc1.displayDetails();
        acc2.displayDetails();
    }
}




/* 2. Encapsulation

Encapsulation = hiding data + providing controlled access via methods.

We achieve this by:

* Making fields `private`
* Providing `public` getters and setters

# Why?

* To protect data from invalid changes.
* To control how data is read/modified.

# Example (improve BankAccount)

*/
// BankAccount.java
public class BankAccount {
    // fields should be private
    private String accountNumber;
    private String holderName;
    private double balance;

    // constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // getters (read-only access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // setters (controlled write access)
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    // business methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    public void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}



// Main.java
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("A123", "Usha", 1000.0);

        acc.deposit(500);       // balance = 1500
        acc.withdraw(2000);     // invalid, prints error
        acc.withdraw(300);      // balance = 1200

        acc.displayDetails();
        System.out.println("Balance via getter: " + acc.getBalance());
    }
}


// > Note: Code outside the class /*cannot/* directly do `acc.balance = -999;` because `balance` is `private`.



/* 3. Inheritance

Inheritance = one class (child) inherits properties and methods of another class (parent).

* `extends` keyword
* Reuse code and specialize behavior.

Let’s say we have different types of accounts:

* `BankAccount` (base class)
* `SavingsAccount` (child class)
* `CurrentAccount` (child class)

# Example


BankAccount.java (base class)
*/
public class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance; // protected: visible to subclasses

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}



// SavingsAccount.java (child class)
public class SavingsAccount extends BankAccount {
    private double interestRate; // in %

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance); // call parent constructor
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest; // balance is protected in parent
    }
}



// CurrentAccount.java (child class)
public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // override withdraw to allow overdraft – we'll refine this in polymorphism section
}



// Main.java
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("S001", "Usha", 2000.0, 5.0);
        sa.addInterest();
        sa.displayDetails();
    }
}




/* 4. Polymorphism

Polymorphism = same method name, different behavior.

Two main types in Java:

1. Compile-time polymorphism → Method Overloading
2. Runtime polymorphism → Method Overriding + dynamic dispatch



# 4.1 Method Overloading (same method name, different parameters)
*/


public class Calculator {
    // add two ints
    public int add(int a, int b) {
        return a + b;
    }

    // add three ints (overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two doubles (overloaded)
    public double add(double a, double b) {
        return a + b;
    }
}

class MainCalc {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));        // calls add(int, int)
        System.out.println(c.add(2, 3, 4));     // calls add(int, int, int)
        System.out.println(c.add(2.5, 3.5));    // calls add(double, double)
    }
}




/*# 4.2 Method Overriding (child changes parent’s implementation)

We’ll override `withdraw()` in `CurrentAccount` to allow overdraft.


 CurrentAccount.java
*/
public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // overriding withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}




/* 4.3 Runtime Polymorphism (dynamic method dispatch)

Parent reference → Child object.

*/
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("S001", "Usha", 3000.0, 5.0);
        BankAccount acc2 = new CurrentAccount("C001", "Rahul", 1000.0, 500.0);

        acc1.withdraw(500);  // calls BankAccount.withdraw (not overridden)
        acc2.withdraw(1300); // calls CurrentAccount.withdraw (overridden)

        acc1.displayDetails();
        acc2.displayDetails();
    }
}


// Even though both are type `BankAccount`, at runtime Java decides which `withdraw()` to call based on the /*actual object type/* (`SavingsAccount` or `CurrentAccount`).



/*5. Abstraction

Abstraction = show only essential features, hide complex details.

In Java, we use:

* `abstract` classes
* `interfaces`



# 5.1 Abstract Class

* Cannot be instantiated.
* Can have abstract methods (no body) + normal methods.

Let’s make a generic `Account` as an abstract class:

*/
public abstract class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // abstract method - must be implemented by subclasses
    public abstract void calculateYearlyCharges();

    // concrete method
    public void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}


// Now child class must implement `calculateYearlyCharges()`:


public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateYearlyCharges() {
        // Example: savings accounts have no yearly charges
        System.out.println("No yearly charges for SavingsAccount.");
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }
}



public class CurrentAccount extends Account {
    private double yearlyFee;

    public CurrentAccount(String accountNumber, String holderName, double balance, double yearlyFee) {
        super(accountNumber, holderName, balance);
        this.yearlyFee = yearlyFee;
    }

    @Override
    public void calculateYearlyCharges() {
        balance -= yearlyFee;
        System.out.println("Yearly fee deducted: " + yearlyFee);
    }
}




/*# 5.2 Interface

Interface = 100% abstraction of behavior (until Java 8+ default methods).

* Only method signatures (and constants).
* A class `implements` an interface and must provide method bodies.

Let’s define an interface for digital operations:

*/
public interface DigitalOperations {
    void enableNetBanking();
    void enableMobileBanking();
}


// Now implement in a class:


public class DigitalSavingsAccount extends SavingsAccount implements DigitalOperations {

    public DigitalSavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance, interestRate);
    }

    @Override
    public void enableNetBanking() {
        System.out.println("Net banking enabled for account " + accountNumber);
    }

    @Override
    public void enableMobileBanking() {
        System.out.println("Mobile banking enabled for account " + accountNumber);
    }
}


// Usage:


public class Main {
    public static void main(String[] args) {
        DigitalSavingsAccount dsa = new DigitalSavingsAccount("D001", "Usha", 4000.0, 5.0);
        dsa.enableNetBanking();
        dsa.enableMobileBanking();
    }
}




/*6. Other OOP-related Keywords in Java (Quickly)

# `this` keyword

Refers to current object.

*/
public class Example {
    int x;

    public Example(int x) {
        this.x = x;  // this.x = field, x = parameter
    }
}


/*# `super` keyword

Refers to parent class.

* Call parent constructor: `super(...)`
* Access parent methods/fields.
*/

public class Parent {
    int x = 10;
}

public class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(this.x);  // 20
        System.out.println(super.x); // 10
    }
}


/*# `final`

* `final class` → cannot be inherited
* `final method` → cannot be overridden
* `final variable` → constant (value cannot change)
*/

public final class Utility {
    public static final double PI = 3.14159;

    public final void show() {
        System.out.println("Cannot override me");
    }
}


/*# `static`

Belongs to class, not to each object.
*/

public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }
}

class MainStatic {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println(Counter.count); // 3
    }
}