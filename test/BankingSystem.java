package test;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bbbbank {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;

    public Bbbbank(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolderName + " deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew: $" + amount);
            System.out.println("Remaining Balance: $" + balance);
        } else {
            
            throw new InsufficientBalanceException("Transaction failed: Insufficient funds in Base Account.");
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Account #: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("-----------------------");
    }
}

class SavingsAccount extends Bbbbank {
    private double interestRate;

    public SavingsAccount(String name, String accNum, double balance, double interestRate) {
        super(name, accNum, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " added to " + accountHolderName + "'s account.");
        System.out.println("New Balance: $" + balance);
    }
}

class CurrentAccount extends Bbbbank {
    private double overdraftLimit;

    public CurrentAccount(String name, String accNum, double balance, double overdraftLimit) {
        super(name, accNum, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew: $" + amount + " (Current Account)");
            
            if (balance < 0) {
                System.out.println("Notice: You are using your overdraft limit.");
            }
            System.out.println("Remaining Balance: $" + balance);
        } else {

            throw new InsufficientBalanceException("Transaction failed: Exceeds overdraft limit for Current Account.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("=== INITIALIZING BBBBANK SYSTEM ===\n");

        SavingsAccount aliceAccount = new SavingsAccount("Alice", "SAV001", 1000.00, 5.0);
        aliceAccount.displayDetails();
        aliceAccount.deposit(500);
        aliceAccount.addInterest();

        CurrentAccount bobAccount = new CurrentAccount("Bob", "CUR002", 500.00, 1000.00);
        bobAccount.displayDetails();
        

        System.out.println("\n--- Testing Withdrawal for Bob ---");
        try {
            bobAccount.withdraw(200);   
            System.out.println("Bob's first withdrawal successful.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Testing Overdraft Fail for Bob ---");
        try {

            bobAccount.withdraw(5000); 
        } catch (InsufficientBalanceException e) {

            System.out.println("EXCEPTION CAUGHT: " + e.getMessage());
        }
    }
}
