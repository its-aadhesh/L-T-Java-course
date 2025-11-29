package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class demonstrates exception handling in Java:
 * - try-catch blocks
 * - Multiple catch blocks
 * - try-catch-finally
 * - try-with-resources (Java 7+)
 * - Checked vs. unchecked exceptions
 * - Exception propagation
 * - throw and throws keywords
 */
public class ExceptionHandlingDemo {
    
    public static void main(String[] args) {
        System.out.println("EXCEPTION HANDLING IN JAVA");
        
        // Basic try-catch
        // demonstrateBasicTryCatch();
        
        // Multiple catch blocks
        demonstrateMultipleCatch();
        
        // // try-catch-finally
        // demonstrateTryCatchFinally();
        
        // // try-with-resources
        // demonstrateTryWithResources();
        
        // // Checked vs. unchecked exceptions
        // demonstrateCheckedVsUnchecked();
        
        // Exception propagation
        // try {
        //     demonstrateExceptionPropagation();
        // } catch (Exception e) {
        //     System.out.println("Caught propagated exception: " + e.getMessage());
        // }
        
        // // throw and throws
        // try {
        //     demonstrateThrowAndThrows(0);
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Caught thrown exception: " + e.getMessage());
        // }
    }
    
    /**
     * Demonstrates basic try-catch block
     */
    private static void demonstrateBasicTryCatch() {
        System.out.println("\n1. BASIC TRY-CATCH:");
        
        try {
            // Code that might throw an exception
            int result = 10 / 0; // ArithmeticException
            System.out.println("Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
            // e.printStackTrace(); // Uncomment to see the stack trace
        }
        
        System.out.println("Program continues after exception handling");
    }
    
    /**
     * Demonstrates multiple catch blocks
     */
    private static void demonstrateMultipleCatch() {
        System.out.println("\n2. MULTIPLE CATCH BLOCKS:");
        
        try {
            // This array has only 3 elements
            int[] numbers = {1, 2, 3};
            
            // Choose which exception to trigger (change the value to test different exceptions)
            int testCase = 2;
            
            if (testCase == 1) {
                // This will cause ArithmeticException
                int result = numbers[0] / 0;
                System.out.println(result);
            } else if (testCase == 2) {
                // This will cause ArrayIndexOutOfBoundsException
                System.out.println(numbers[5]);
            } else {
                // This will cause NullPointerException
                String str = null;
                System.out.println(str.length());
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (Exception e) {
            // Catch-all for any other exceptions
            System.out.println("Some other exception: " + e.getMessage());
        }
        
        // Multi-catch (Java 7+)
        try {
            // Code that might throw multiple exceptions
            String input = "abc";
            int value = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.out.println("Input error: " + e.getMessage());
        }
    }
    
    /**
     * Demonstrates try-catch-finally
     */
    private static void demonstrateTryCatchFinally() {
        System.out.println("\n3. TRY-CATCH-FINALLY:");
        
        FileInputStream fileInputStream = null;
        
        try {
            // Attempt to open a file that doesn't exist
            fileInputStream = new FileInputStream("nonexistent.txt");
            // Read from the file...
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            // This block always executes, whether an exception occurred or not
            System.out.println("Executing finally block");
            
            // Clean up resources
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
        
        System.out.println("After try-catch-finally");
    }
    
    /**
     * Demonstrates try-with-resources (Java 7+)
     */
    private static void demonstrateTryWithResources() {
        System.out.println("\n4. TRY-WITH-RESOURCES:");
        
        // Resources declared in the try statement are automatically closed
        try (FileInputStream fileInputStream = new FileInputStream("nonexistent.txt")) {
            // Read from the file...
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
        
        // Multiple resources
        try (
            Scanner scanner = new Scanner(new File("nonexistent.txt"));
            FileInputStream fileStream = new FileInputStream("nonexistent.txt")
        ) {
            // Use the resources...
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
    
    /**
     * Demonstrates checked vs. unchecked exceptions
     */
    private static void demonstrateCheckedVsUnchecked() {
        System.out.println("\n5. CHECKED VS. UNCHECKED EXCEPTIONS:");
        
        // Unchecked exceptions (RuntimeException) - compiler doesn't force you to handle
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException (unchecked)
        } catch (RuntimeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
        
        // Checked exceptions - compiler forces you to handle
        try {
            Thread.sleep(1000); // InterruptedException (checked)
        } catch (InterruptedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        
        // This would cause a compilation error if not handled or declared
        // FileInputStream fis = new FileInputStream("file.txt");
    }
    
    /**
     * Demonstrates exception propagation
     */
    private static void demonstrateExceptionPropagation() throws Exception {
        System.out.println("\n6. EXCEPTION PROPAGATION:");
        
        // This method throws an exception that will be propagated up the call stack
        methodA();
    }
    
    private static void methodA() throws Exception {
        methodB();
    }
    
    private static void methodB() throws Exception {
        methodC();
    }
    
    private static void methodC() throws Exception {
        throw new Exception("Exception from methodC");
    }
    
    /**
     * Demonstrates throw and throws keywords
     */
    private static void demonstrateThrowAndThrows(int value) throws IllegalArgumentException {
        System.out.println("\n7. THROW AND THROWS KEYWORDS:");
        
        if (value <= 0) {
            // Explicitly throw an exception
            throw new IllegalArgumentException("Value must be positive");
        }
        
        System.out.println("Value is: " + value);
    }
}
