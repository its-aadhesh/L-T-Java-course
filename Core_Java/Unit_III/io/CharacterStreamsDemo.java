package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamsDemo {
    public static void main(String[] args) {
        String data = "Character Stream Example";
        try (FileWriter writer = new FileWriter("charstream.txt")) {
            writer.write(data);
            System.out.println("Data written to charstream.txt");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        try (FileReader reader = new FileReader("charstream.txt")) {
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
