package newclassess;
interface College{
    public void sports();
    public void workshop();
}

interface Job{
    public void itJobs();
    public void nonitJobs();
}

abstract class Department{
    public abstract void displayD();
    public void departmentDetails(){
        System.out.println("Department Details");
    }
}


class Student extends Department implements College, Job {
    private int rollno;
    private String name;
    public Student(int rn, String sn){
        this.rollno = rn;
        this.name = sn;
    }
    public void displayD()
    {
        super.departmentDetails();
        System.out.println("Roll No: " + rollno + " Name: " + name);
    }
    public void sports(){
        System.out.println("Sports");
    }
    public void workshop(){
        System.out.println("Workshop");
    }
    public void itJobs()
    {
        System.out.println("Java Developer");
    }
    public void nonitJobs()
    {
        System.out.println("Civil Engineer");
    }
}

public class MainClass{
    public static void main(String[] args){
        Student s1 = new Student(1, "John");
        s1.sports();
        s1.workshop();
        s1.displayD();
       
    }
}