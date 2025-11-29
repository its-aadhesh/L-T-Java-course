package strings;

/**
 * This class demonstrates string handling in Java:
 * - String class and its methods
 * - String immutability
 * - StringBuilder for mutable strings
 * - StringBuffer for thread-safe mutable strings
 * - String comparison
 * - String formatting
 * - Regular expressions with String
 */
public class StringHandlingDemo {
    
    public static void main(String[] args) {
        System.out.println("STRING HANDLING IN JAVA");
        
        // Basic String creation
        demonstrateStringCreation();
        
        // String methods
        demonstrateStringMethods();
        
        // String immutability
        demonstrateStringImmutability();
        
        // StringBuilder
        demonstrateStringBuilder();
        
        // StringBuffer
        demonstrateStringBuffer();
        
        // String comparison
        demonstrateStringComparison();
        
        // String formatting
        demonstrateStringFormatting();
        
        // Regular expressions
        demonstrateRegularExpressions();
    }
    
    /**
     * Demonstrates different ways to create strings
     */
    private static void demonstrateStringCreation() {
        System.out.println("\n1. STRING CREATION:");
        
        // String literal
        String str1 = "Hello";
        
        // String object
        String str2 = new String("Hello");
        
        // String from char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        
        // String concatenation
        String str4 = "Hello" + " World";
        
        System.out.println("String literal: " + str1);
        System.out.println("String object: " + str2);
        System.out.println("String from char array: " + str3);
        System.out.println("Concatenated string: " + str4);
    }
    
    /**
     * Demonstrates common String methods
     */
    private static void demonstrateStringMethods() {
        System.out.println("\n2. STRING METHODS:");
        
        String text = "Java Programming";
        
        // Length
        System.out.println("Length: " + text.length());
        
        // Character access
        System.out.println("First character: " + text.charAt(0));
        
        // Substring
        System.out.println("Substring (0,4): " + text.substring(0, 4));
        System.out.println("Substring (5): " + text.substring(5));
        
        // Case conversion
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        
        // Trim
        String paddedText = "   Padded Text   ";
        System.out.println("Original: '" + paddedText + "'");
        System.out.println("Trimmed: '" + paddedText.trim() + "'");
        
        // Replace
        System.out.println("Replace 'a' with 'o': " + text.replace('a', 'o'));
        System.out.println("Replace \"Java\" with \"Python\": " + text.replace("Java", "Python"));
        
        // Contains, startsWith, endsWith
        System.out.println("Contains \"Program\": " + text.contains("Program"));
        System.out.println("Starts with \"Java\": " + text.startsWith("Java"));
        System.out.println("Ends with \"ing\": " + text.endsWith("ing"));
        
        // indexOf, lastIndexOf
        System.out.println("Index of 'a': " + text.indexOf('a'));
        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));
        
        // Split
        String csvText = "apple,banana,orange,grape";
        String[] fruits = csvText.split(",");
        System.out.println("Split result:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
    
    /**
     * Demonstrates String immutability
     */
    private static void demonstrateStringImmutability() {
        System.out.println("\n3. STRING IMMUTABILITY:");
        
        String original = "Hello";
        System.out.println("Original string: " + original);
        
        // This doesn't modify the original string
        original.concat(" World");
        System.out.println("After concat() without assignment: " + original);
        
        // This creates a new string
        original = original.concat(" World");
        System.out.println("After concat() with assignment: " + original);
    }
    
    /**
     * Demonstrates StringBuilder for mutable strings
     */
    private static void demonstrateStringBuilder() {
        System.out.println("\n4. STRINGBUILDER (MUTABLE):");
        
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder: " + builder);
        
        // Append
        builder.append(" World");
        System.out.println("After append(): " + builder);
        
        // Insert
        builder.insert(5, " Beautiful");
        System.out.println("After insert(): " + builder);
        
        // Replace
        builder.replace(6, 15, "Amazing");
        System.out.println("After replace(): " + builder);
        
        // Delete
        builder.delete(5, 13);
        System.out.println("After delete(): " + builder);
        
        // Reverse
        builder.reverse();
        System.out.println("After reverse(): " + builder);
        builder.reverse(); // Reverse back
        
        // Convert to String
        String result = builder.toString();
        System.out.println("Converted to String: " + result);
        
        // Performance comparison
        System.out.println("\nPerformance comparison:");
        
        long startTime = System.nanoTime();
        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += "a";
        }
        long endTime = System.nanoTime();
        System.out.println("String concatenation time: " + (endTime - startTime) / 1000000 + " ms");
        
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1000000 + " ms");
    }
    
    /**
     * Demonstrates StringBuffer for thread-safe mutable strings
     */
    private static void demonstrateStringBuffer() {
        System.out.println("\n5. STRINGBUFFER (THREAD-SAFE):");
        
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer: " + buffer);
        
        // Append
        buffer.append(" World");
        System.out.println("After append(): " + buffer);
        
        // Capacity
        System.out.println("Capacity: " + buffer.capacity());
        
        // Set length
        buffer.setLength(5);
        System.out.println("After setLength(5): " + buffer);
        
        // Note: StringBuffer has the same methods as StringBuilder
        // but is synchronized (thread-safe) and generally slower
    }
    
    /**
     * Demonstrates string comparison
     */
    private static void demonstrateStringComparison() {
        System.out.println("\n6. STRING COMPARISON:");
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "HELLO";
        
        // Using == (compares references)
        System.out.println("str1 == str2: " + (str1 == str2)); // true (string pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
        
        // Using equals() (compares content)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false (case sensitive)
        
        // Using equalsIgnoreCase()
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true
        
        // Using compareTo() (lexicographical comparison)
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0 (equal)
        System.out.println("\"Apple\".compareTo(\"Banana\"): " + "Apple".compareTo("Banana")); // negative (A before B)
        System.out.println("\"Banana\".compareTo(\"Apple\"): " + "Banana".compareTo("Apple")); // positive (B after A)
    }
    
    /**
     * Demonstrates string formatting
     */
    private static void demonstrateStringFormatting() {
        System.out.println("\n7. STRING FORMATTING:");
        
        String name = "John";
        int age = 30;
        double height = 1.85;
        
        // Using String.format()
        String formatted = String.format("Name: %s, Age: %d, Height: %.2f meters", name, age, height);
        System.out.println("Formatted string: " + formatted);
        
        // Using printf() (same format specifiers)
        System.out.printf("Name: %s, Age: %d, Height: %.2f meters%n", name, age, height);
        
        // Common format specifiers
        System.out.println("\nCommon format specifiers:");
        System.out.printf("Integer: %d%n", 42);
        System.out.printf("Float with 2 decimals: %.2f%n", 3.14159);
        System.out.printf("Character: %c%n", 'A');
        System.out.printf("Boolean: %b%n", true);
        System.out.printf("Scientific notation: %e%n", 1234.5678);
        System.out.printf("Hexadecimal: %x%n", 255);
        
        // Width and alignment
        System.out.println("\nWidth and alignment:");
        System.out.printf("Right-aligned (10): '%10s'%n", "Hello");
        System.out.printf("Left-aligned (10): '%-10s'%n", "Hello");
        System.out.printf("Zero-padded number: %05d%n", 42);
    }
    
    /**
     * Demonstrates regular expressions with String
     */
    private static void demonstrateRegularExpressions() {
        System.out.println("\n8. REGULAR EXPRESSIONS:");
        
        // matches() - checks if the entire string matches the pattern
        String email = "user@example.com";
        boolean isValidEmail = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        System.out.println("Is valid email: " + isValidEmail);
        
        // replaceAll() - replaces all occurrences matching the pattern
        String text = "The year is 2023, and the code is ABC-123-XYZ";
        
        // Replace all digits with '#'
        String noDigits = text.replaceAll("\\d", "#");
        System.out.println("Replace digits: " + noDigits);
        
        // Replace all sequences of digits
        String noNumbers = text.replaceAll("\\d+", "NUMBER");
        System.out.println("Replace numbers: " + noNumbers);
        
        // split() with regex
        String data = "John:30:New York";
        String[] parts = data.split(":");
        System.out.println("Split by colon:");
        for (String part : parts) {
            System.out.println("- " + part);
        }
        
        // More complex example - extracting parts of a string
        String code = "Product: ABC-123-XYZ";
        String productCode = code.replaceAll("Product: ([A-Z]+-\\d+-[A-Z]+)", "$1");
        System.out.println("Extracted product code: " + productCode);
    }
}
