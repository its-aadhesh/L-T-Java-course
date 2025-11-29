package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamsDemo {
    public static void main(String[] args) {
        String data = "Hello, IO Streams!";
        try (FileOutputStream fos = new FileOutputStream("sample.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("sample.txt")) {
            int ch;
            System.out.print("File content: ");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
