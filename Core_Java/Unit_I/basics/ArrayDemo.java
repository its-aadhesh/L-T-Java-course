// package basics;

/**
 * Array and Its Practical Application Demo
 * Shows array declaration, initialization, and finding max value.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 7};
        int max = arr[0];
        int min = arr[0];
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println("Max value in array: " + arr[i]);
        }
        
    }
}
