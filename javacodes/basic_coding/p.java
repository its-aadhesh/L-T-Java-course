package basic_coding;

class Car{
    int price;
    String model;
    Car(int p, String m)
    {
        price = p;
        model= m;
    }
    void display()
    {
        System.out.println(model +" : Model, "+ price +" : Cost");
    }
}

public class p {
    public static void main(String[] args){
        Car c = new Car(500000,"Maruthi");
        c.display();
    }    
}