package error_handling;
public class multiexcpt {
    public static void main(String[] args) {
        String a= ("BigFatCatAteMyHomework");
        try {
            char b = a.charAt(9);
            System.out.println("The character at position 9 is :"+ b);
        }
        catch (Exception e) {
            System.out.println("Error message :"+ e.getMessage());
        }
        System.out.println("Program continues ...");
    }
}
// Try catch throw finally - keywords found in java for error handling 