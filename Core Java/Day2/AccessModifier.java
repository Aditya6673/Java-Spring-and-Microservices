
// Class with different access modifiers
class MyClass {
    public int publicVar = 10; // Accessible from anywhere
    protected int protectedVar = 20; // Accessible within the same package and subclasses
    int defaultVar = 30; // Accessible within the same package (default access)
    //private int privateVar = 40; // Accessible only within this class
    MyClass() {
        System.out.println("This is a class with different access modifiers.");
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        // Creating an object of the class
        MyClass obj = new MyClass();

        // Accessing public variable
        System.out.println("Public Variable: " + obj.publicVar);

        // Accessing protected variable
        System.out.println("Protected Variable: " + obj.protectedVar);

        // Accessing default variable
        System.out.println("Default Variable: " + obj.defaultVar);

        // Accessing private variable (not possible, will cause an error)
        // System.out.println("Private Variable: " + obj.privateVar);
    }
}
