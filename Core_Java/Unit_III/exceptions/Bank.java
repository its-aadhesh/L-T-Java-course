import java.util.Scanner;
// Basic try–catch Example
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         try {
//             int c = a / b; // Exception occurs here (ArithmeticException)
//             System.out.println(c);
//         }
//         catch (Exception e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         }

//         System.out.println("Program continues...");
//     }
// }
// // Multiple catch blocks

// public class Main {
//     public static void main(String[] args) {
//         try {
//             int arr[] = {1,2,3};
//             System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Arithmetic error");
//         }
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array error: " + e);
//         }

//         System.out.println("After multiple catch");
//     }
// }
// finally block (always runs)
// public class Main {
//     public static void main(String[] args) {
//         try {
//             System.out.println("Inside try...");
//             int x = 5 / 0;
//         }
//         catch (Exception e) {
//             System.out.println("Catch block executed");
//         }
//         finally {
//             System.out.println("Finally block ALWAYS executes ✅");
//         }

//         System.out.println("Program ends");
//     }
// }
// // throw keyword (manual exception)
// // You can throw your own error condition.
// public class Main {
//     public static void main(String[] args) {
//         int age = 15;

//         try {
//             if (age < 18) {
//                 throw new Exception("Not eligible to vote 🚫");
//             }
//             System.out.println("Eligible to vote");
//         }
//         catch (Exception e) {
//             System.out.println("Thrown exception caught: " + e.getMessage());
//         }
//     }
// }
// // throws keyword (method level declaration)
// // Used when you don’t handle exception inside method → caller must handle it.
// public class Main {
//     static void checkFile() throws InterruptedException {
//         System.out.println("File checking...");
//         Thread.sleep(1000); // This may throw exception
//         System.out.println("File found ✅");
//     }

//     public static void main(String[] args) {
//         try {
//             checkFile();
//         }
//         catch (InterruptedException e) {
//             System.out.println("Exception handled in main");
//         }
//     }
// }
// Custom Exception Class

// You can create your own exception by extending Exception
// Custom Exception
class LowBalanceException extends Exception {
    public LowBalanceException(String msg) {
        super(msg);
    }
}

public class Bank {
    double balance = 500;

    void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Low Balance! Cannot withdraw ₹" + amount);
        }
        balance -= amount;
        System.out.println("Withdraw Successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        Bank acc = new Bank();

        try {
            acc.withdraw(800);
        }
        catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

