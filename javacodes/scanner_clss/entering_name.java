package scanner_clss;
import java.util.Scanner;

public class entering_name{
    public static void main(String[]arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scanner.nextLine();
        System.out.println("Welcome " + name+ " !");
    }
}

