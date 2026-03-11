public class Strings {
    public static void main(String[] args) {
        String name = new String("Aditya");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.hashCode()); 
        String name2 = "Aditya";
        System.out.println(name==name2); // false
        System.out.println(name.equals(name2)); // true
        name2 = name2 + " Dubey"; // name2 is now a new string object
        // String is immutable, so name2 is now a new string object
        // Mutable string - StringBuffer
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16
        
    }
}
