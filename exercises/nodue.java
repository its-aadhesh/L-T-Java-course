package exercises;
import java.util.Scanner;
public class nodue {
    public static void main(String[] args) {
        String  a = "No Due";
        String c= "Due";
        System.out.println(" Please enter 'Due' or 'No Due'");
        Scanner s = new Scanner(System.in);
        String b = s.nextLine();
        try {
            if (b.equals(c)){
                throw new Exception("Hall Ticket Not Permitted, Kindly Clear Your Dues");
            }
        }
        catch(Exception e){
                System.out.println(e.getMessage());
        }
        if (b.equals(a)){
            System.out.println("Hall Ticket Permitted, You Can Sit For The Exam, All The Best!");
        }
        
    }
}
