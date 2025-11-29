package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String text = "test@example.com";
        Pattern pattern = Pattern.compile
        ("[\\w\\d._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println
            ("Found email: " + matcher.group());
        } else {
            System.out.println("No email found.");
        }
    }
}
