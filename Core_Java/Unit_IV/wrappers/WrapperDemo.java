package wrappers;

/**
 * Wrapper Classes and Autoboxing/Unboxing Demo
 * Shows Integer, Double, Boolean, Character wrappers and autoboxing/unboxing.
 */
public class WrapperDemo {
    public static void main(String[] args) {
        // Primitive to Wrapper (Autoboxing)
        int i = 10;
        Integer intObj = i;
        double d = 5.5;
        Double doubleObj = d;
        boolean b = true;
        Boolean boolObj = b;
        char c = 'A';
        Character charObj = c;
        System.out.println("Integer: " + intObj + ", Double: " + doubleObj + ", Boolean: " + boolObj + ", Character: " + charObj);

        // Wrapper to Primitive (Unboxing)
        int i2 = intObj;
        double d2 = doubleObj;
        boolean b2 = boolObj;
        char c2 = charObj;
        System.out.println("Unboxed int: " + i2 + ", double: " + d2 + ", boolean: " + b2 + ", char: " + c2);
    }
}
