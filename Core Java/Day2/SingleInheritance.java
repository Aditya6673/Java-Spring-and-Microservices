
//Super class
class Vehicle1 {
    Vehicle1() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass 
class Car extends Vehicle1 {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        Car obj = new Car();
        System.out.println("This is an example of Single Inheritance in Java."+obj);
    }
}
