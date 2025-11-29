package reversal_of_strings;
import java.util.Scanner;

public class strbffr {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner a = new Scanner(System.in);
        String name  = a.nextLine();
        System.out.println("------------------------------");
        System.out.println("The entered name is : "+name);
        System.out.println("------------------------------");
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println("The reversed name is : "+sb);
    }
}
