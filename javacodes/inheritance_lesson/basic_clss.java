package inheritance_lesson;
class Student{
    String name;
    String dept;
    private int regno;
    Student(String n,String d,int r)
    {
        name =n;
        dept =d;
        regno =r;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Dept : "+dept);
        System.out.println("Register number : "+regno);
    }
}
public class basic_clss{
    public static void main(String[] args) {
        Student s= new Student("Aadhesh","IT",1);
    s.display();        
    }
}