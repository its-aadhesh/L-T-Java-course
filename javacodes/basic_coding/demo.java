package basic_coding;
class Car {
    int price;
    String model;
    Car(String m, int p)
    {
        model = m;
        price = p;
    }    
    void display()
    {
        System.out.println("Model : "+model+" ,Price : "+price);
    }
}
public class demo{
    public static void main(String[] args) {
        Car c = new Car("Maruthi",501234);
        c.display();
    }
}