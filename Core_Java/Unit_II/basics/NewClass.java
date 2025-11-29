package basics;

class Car {
    public int a;
    public Car(int a) 
    {
        this.a = a;
    }
}

public class NewClass
{
    public static void main(String[] arg)
    {
       Car obj1 = new Car(10);
       Car obj2 = new Car(20);
       System.out.println(obj1.a);
    }
}