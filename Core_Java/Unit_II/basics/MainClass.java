// package basics;

class Car{
    private int price;
    String model;
    Car(int p, String m)
    {
        price = p;
        model = m;
    }
    void getter()
    {
        System.out.println(price);
    }
    void setter(int pr)
    {
        price = pr;
    }

}

public class MainClass {
    public static void main(String[] args) {
      Car c = new Car(5000000,"Maruti");
      Car c2 = new Car(750000,"Tata");
    //   c.display();
    //   c2.display();
    c.getter();
    c.setter(7500000);
    c.getter();
    // int n = 5;
    // for (int i=0;i<n;i++){
    //     Car c = new Car(5000000, "maruti");
    //     c.getter();
    // }
    }
}
