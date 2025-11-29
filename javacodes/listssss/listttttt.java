// List and sets comes under collection 
package listssss;

import java.util.ArrayList;
import java.util.List;


public class listttttt {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>();

        names.add("Usha");
        names.add("Amit");
        names.add("Ravi");
        System.out.println("First name: "+names.get(0));
        names.set(1,"Amit Kumar");
        names.remove(2);
        System.out.println("Size: "+names.size());


    }

}
