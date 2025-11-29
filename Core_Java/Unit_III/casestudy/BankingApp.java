package casestudy;

import java.io.*;
import java.util.*;

/**
 * Simple Banking Application\
 * 
 * 
 * Demonstrates exceptions, file I/O, regex, and date/time.
 */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) { super(msg); }
}
public class BankingApp {
    static double balance = 1000.0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (PrintWriter log = new PrintWriter(new FileWriter("transactions.txt", true))) {
            System.out.print("Enter amount to withdraw: ");
            String input = sc.nextLine();
            if (!input.matches("\\d+(\\.\\d{1,2})?")) throw new IllegalArgumentException("Invalid amount format");
            double amt = Double.parseDouble(input);
            if (amt > balance) throw new InsufficientFundsException("Insufficient funds");
            balance -= amt;
            log.println(java.time.LocalDateTime.now() + ": Withdrawn " + amt + ", Balance: " + balance);
            System.out.println("Withdrawn: " + amt + ", New Balance: " + balance);
        } catch (InsufficientFundsException | IOException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
