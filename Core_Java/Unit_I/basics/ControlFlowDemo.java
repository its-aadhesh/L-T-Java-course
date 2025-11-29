/**
 * Control Flow Statements Demo
 * Shows if-else, switch, for, while, and do-while loops.
 */
public class ControlFlowDemo {
    public static void main(String[] args) {
        int x = 7;
        // if-else
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is 5 or less");
        }
        // switch
        switch (x) {
            case 1: System.out.println("One"); break;
            case 7: System.out.println("Seven"); break;
            default: System.out.println("Other");
        }
        // for loop
        for (int i = 0; i < 3; i++) 
        {
        System.out.println("For: " + i);
        }
        // while loop
        int w = 0;
        while (w < 2) 
        { 
            System.out.println("While: " + w); 
            w++; 
        }
        // do-while loop
        int d = 0;
        do 
        { 
            System.out.println("Do-While: " + d); 
            d++; 
        } while (d < 1);
    }
}
