import java.util.Scanner;
import java.util.ArrayList;;
public class check {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your names");
        for (int i=1;i<=n;i++)
        {
            String na = sc.nextLine();
            s.add(na);
        }
        for (String i:s)
        {
            System.out.println("Welcome "+i+" !");
        }
        sc.close();
    }
}
