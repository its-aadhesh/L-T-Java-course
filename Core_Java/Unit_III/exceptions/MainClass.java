import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    private static void main(String[] args) {
       
        // Unchecked exceptions (RuntimeException) - compiler doesn't force you to handle
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException (unchecked)
        } catch (Exception e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
        
        // // Checked exceptions - compiler forces you to handle
        // try {
        //     Thread.sleep(1000); // InterruptedException (checked)
        // } catch (InterruptedException e) {
        //     System.out.println("Caught checked exception: " + e.getMessage());
        // }
        
        // This would cause a compilation error if not handled or declared
        // FileInputStream fis = new FileInputStream("file.txt");
    }
    }
