package error_handling;

public class thrw {
    public static void main(String[] args) {
        int age = 15; 
        try {
            if (age<18){
                throw new Exception("Not eligible to vote !!!");
                
            }
            System.out.println("Eligible to vote");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("The thrown message is catched");
        }
        System.out.println("Program Continues ... ");
    }
}
