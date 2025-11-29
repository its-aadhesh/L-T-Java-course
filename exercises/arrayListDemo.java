package exercises;
// Input ur frinds name in an array list and the get each of their name and welcome them 

import java.util.ArrayList;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> friendsList = new ArrayList<>();
        friendsList.add("Alice");
        friendsList.add("Bob");
        friendsList.add("Sam");
        for (String name: friendsList) {
            System.out.println("Welcome " + name);
        }
    } 
}
