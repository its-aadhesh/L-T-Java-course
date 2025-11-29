package exercises;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class pan_aadhar {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter PAN number:");
        String pan = a.nextLine();
        Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
        Matcher matcher = pattern.matcher(pan);
        if (matcher.matches()) {
            System.out.println("Valid PAN number");
        } else {
            System.out.println("Invalid PAN number");
        }
        
        System.out.println("Enter Aadhar number:");
        String aadhar = a.nextLine();
        Pattern patternAadhar = Pattern.compile("[2-9]{1}[0-9]{3}\\s?[0-9]{4}\\s?[0-9]{4}");
        Matcher matcherAadhar = patternAadhar.matcher(aadhar);
        if (matcherAadhar.matches()) {
            System.out.println("Valid Aadhar number");
        } else {
            System.out.println("Invalid Aadhar number");
        }
    }
}
