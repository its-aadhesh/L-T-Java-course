package casestudy;

import java.util.*;

/**
 * Library Management System
 * Demonstrates OOP, inheritance, interfaces, and collections.
 */
interface Searchable {
    boolean matches(String keyword);
}
class Book implements Searchable {
    String title, author;
    boolean issued = false;
    Book(String t, String a) 
    { 
        title = t; 
        author = a; 
    }
    public boolean matches(String keyword) 
    {
        return title.contains(keyword) || author.contains(keyword);
    }
}
class Member {
    String name;
    Member(String n) 
    { 
        name = n; 
    }
}
class StudentMember extends Member {
    StudentMember(String n) 
    { 
        super(n); 
    }
}
class FacultyMember extends Member {
    FacultyMember(String n) 
    { 
        super(n); 
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) 
    {
        Book book1 = new Book("Java Basics", "Alice");
        Book book2 = new Book("OOP in Depth", "Bob");
        // Demonstrate OOP and inheritance (no collections)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword to search books: ");
        String kw = sc.nextLine();
        if (book1.matches(kw)) System.out.println("Found: " + book1.title + " by " + book1.author);
        if (book2.matches(kw)) System.out.println("Found: " + book2.title + " by " + book2.author);
        sc.close();
    }
}