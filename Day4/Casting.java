class A {
    void show() {
        System.out.println("This is class A");
    }
}
class B extends A {
    void show() {
        System.out.println("This is class B");
    }
}
public class Casting {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Implicit casting (widening conversion)
        System.out.println("Value of b: " + b); // Output: Value of b: 10.0

        double c = 20.5;
        int d = (int) c; // Explicit casting (narrowing conversion)
        System.out.println("Value of d: " + d); // Output: Value of d: 20

        A obj = (A) new B(); // Upcasting: A reference variable of type A is referring to an object of type B
        obj.show(); // This will call the show() method of class B at runtime due to dynamic method dispatch (runtime polymorphism).
        A obj1 = new B(); // Upcasting: A reference variable of type A is referring to an object of type B
        B obj2 = (B) obj1; // Downcasting: Explicitly casting the A reference back to a B reference
        obj2.show(); // This will call the show() method of class B
    }
}
