// Use array list to calculate average marks, higest marks and lowest marks 
package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> marksList = new ArrayList<>();
        System.out.println("Enter the number of students\n");
        int num = s.nextInt();
        System.err.println("");
        System.out.println("Enter the marks of each student in order\n ");
        for (int i =1; i<=num; i++){
            int marks = s.nextInt();
            marksList.add(marks);
        }
        System.out.println("");
        double sum = 0;
        for (Integer mark : marksList) {
            sum =+ mark;
        }
        double average = sum/num;
        System.out.println("The average marks are : "+average);
        int highest = marksList.get(9);
        int lowest = marksList.get(0);
        System.out.println("The highest marks is : "+highest);
        System.out.println("The lowest marks is : "+lowest);
    }
}
