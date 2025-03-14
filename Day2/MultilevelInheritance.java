package Day2;

class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car1 extends FourWheeler {
    Car1() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Car1 obj = new Car1(); // Triggers all constructors in order
        System.out.println("This is an example of Multilevel Inheritance in Java."+obj);
    }
}
