package error_handling;
import java.util.Scanner;
public class exepthand {
    public static void main(String[] args) {
        System.out.println("WE ARE PERFORMING INTEGER DIVISION");
        System.out.println();
        System.out.println("Enter the first Integer : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Enter the second Integer : ");
        System.out.println();
        int b = s.nextInt();
        System.out.println("------------------------------------");
        int c;
        try {
            c=a/b;
            System.out.println("The result (a/b) = "+ c);
        }
        catch(Exception e) {
            System.out.println("Exception caught"+e.getMessage());

        }
        System.out.println("------------------------------------");
        System.out.println("Program Continues ...");
        }
    }
