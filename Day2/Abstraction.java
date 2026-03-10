package Day2;

interface InnerAbstraction {
    abstract void area(); // Abstract method
    void display(); // Concrete method (default implementation)
    // Interfaces cannot have constructors, but we can have static methods
    static void staticMethod() {    
        System.out.println("This is a static method in the interface.");
    }
    
}
abstract class Shape {
    abstract double area(); // Abstract method
    void display() { // Concrete method
        System.out.println("This is a shape.");
    }
    Shape() { // Constructor
        System.out.println("Shape constructor called.");
    }
} 
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() { // Implementing the abstract method
        return Math.PI * radius * radius;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        // Abstraction is achieved through abstract classes and interfaces in Java.
        // It allows us to hide the implementation details and show only the functionality to the user.
        // For example, we can have an abstract class 'Shape' with an abstract method 'area()'.
        // The subclasses like 'Circle' and 'Rectangle' will provide the implementation for the 'area()' method.
        // We cannot create an instance of an abstract class, but we can create a reference of the abstract class type.
        // Shape shape = new Shape(); // This will give an error because we cannot instantiate an abstract class.
        // However, we can create an instance of a subclass that extends the abstract class.
        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.area());
        // We can also use an interface to achieve abstraction. An interface can have abstract methods that must be implemented by the classes that implement the interface.
        InnerAbstraction.staticMethod(); // Calling the static method in the interface
        InnerAbstraction innerAbstraction = new InnerAbstraction() {
            @Override
            public void area() {
                System.out.println("Area method implemented in anonymous class.");
            }
            @Override
            public void display() {
                System.out.println("Display method implemented in anonymous class.");
            }
        };
        innerAbstraction.area();
        innerAbstraction.display();

    }
}
