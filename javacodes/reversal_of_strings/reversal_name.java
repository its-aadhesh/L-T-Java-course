package reversal_of_strings;

import java.util.Scanner;
public class reversal_name {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter you name ");
        String name = a.nextLine();
        System.out.println("------------------------------");
        System.out.println("The name you entered is: " + name);
        System.out.println("------------------------------");
        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString = reversedString + name.charAt(i);

        }
        System.out.println("The reversed string is : "+ reversedString);

    }    
}
