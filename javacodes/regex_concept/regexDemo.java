package regex_concept;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo {
    public static void main(String[] args) {
        String text ="test@gmail.com";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found Email :"+matcher.group());
        } else{
            System.out.println("No email found");
        }
    }
}

// create read update delete
// merging sorting 
// collections framework
