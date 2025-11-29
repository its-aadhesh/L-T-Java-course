package basic_coding;
class Car{
    private int cost;
    String model;
    Car(int c, String m)
    {
        cost =c;
        model=m;
    }
    void getter()
    {
        System.out.println(cost);
    }
    void setter(int cst)
    {
        cost = cst;
    }
}
public class pract{
    public static void main(String[] args) {
        Car c= new Car(123456,"Lamborghini");
    c.getter();
    c.setter(750000);
    c.getter();
    }
}