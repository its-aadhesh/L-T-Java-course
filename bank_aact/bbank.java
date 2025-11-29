package bank_aact;
class Bank{
    private int acctno;
    private int setpin;
    private String name;
    private int balance;
    private int widthdraw_amount;
    private int deposit_amount;
    private int pin;
    Bank(String n, int a, int b, int p)
    {
        name = n;
        acctno = a;
        balance =b;
        pin =p;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Account number : "+acctno);
    }
    void update_pin(int pp)
    {
        setpin = pp;
        System.out.println("The pin has been successfully updated to : "+setpin);
    }
    void display_balance()
    {
        System.out.println("Your balance amount is : "+balance);
    }
    void widthdraw_balance(int w)
    {
        widthdraw_amount = w;
        if (w > balance) {
            System.out.println("Insufficient Funds !");
        }
        else{
            balance = balance - widthdraw_amount; 
            System.out.println("The remaining balance is "+balance);
        }
    }
    void deposit_balance(int d)
    {
        deposit_amount = d;
        balance = balance + deposit_amount;
        System.out.println("The remaining balance is : "+balance);
    }
}
public class bbank{
    public static void main(String[] args) {
        Bank x = new Bank("Aadhesh", 112233, 5000, 123);
        x.display();
        x.display_balance();
        x.widthdraw_balance(6000); 
        x.deposit_balance(5000);
        x.widthdraw_balance(2000);
        x.update_pin(345);
    }
}