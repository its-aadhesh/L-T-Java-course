public class NewClass {
    public static void main(String[] args) {
    String s = "Hello";
    char c = s.charAt(0);
    String rv = "";
    // s = s.substring(s.length()-1);
       for(int i=s.length()-1;i>=0;i--)
        {
            rv+= s.charAt(i);
        }
    // System.out.println(s.substring(2));
    System.out.println(s);
    System.out.println(rv);
    System.out.println(s.substring(1,3));
    System.out.println(s.toUpperCase());
    StringBuffer sb = new StringBuffer("Hello");
    System.out.println(sb);
    sb.append(" World");
    System.out.println(sb);
    sb.insert(6, "Java ");
    sb.replace(6,10,"Python");
    sb.reverse();
    System.out.println(sb);
    }
}
