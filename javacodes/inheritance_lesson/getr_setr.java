package inheritance_lesson;

class Student{
    private int regno;
    Student(String n,String d,int r)
    {
        regno =r;
    }
    void getter()
    {
        System.out.println(regno);
    }
    void setter(int reg)
    {
        regno = reg;
    }
}
public class getr_setr{
    public static void main(String[] args) {
        Student s= new Student("Aadhesh","IT",1);
        s.getter();
        s.setter(15);
        s.getter();
    }
}