package test;
class Frank{
    protected double account_number;
    protected String accountholder_name;
    protected  double balance;

    public Frank(double account_number, String accountholder_name, double initial_balance){
        this.account_number=account_number;
        this.accountholder_name=accountholder_name;
        this.balance=initial_balance;
    }
    public void deposit(double amount){
        if (amount>0)
            balance+=amount;
            System.out.println(accountholder_name+" has deposited $"+amount+" successfully");
            System.out.println("Remaining balance amount $"+balance );

    }
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println(accountholder_name+" has withdrawn $"+amount+" successfully");
            System.out.println("Remaining balance amount $"+balance );
        }
    }
    public void displayDetails(){
        System.out.println("---------Account Details---------");
        System.out.println("Name : "+accountholder_name);
        System.out.println("Account Number : "+account_number);
        System.out.println("Current Balance : "+ balance);
        System.out.println("---------------------------------");
    }
}
class SavingsAccount extends Frank {
    private double intrest_rate;

    public SavingsAccount(double acc_num, String name, double balance, double intrest_rate){
    super(acc_num, name, balance);
    this.intrest_rate=intrest_rate;
    }
}

