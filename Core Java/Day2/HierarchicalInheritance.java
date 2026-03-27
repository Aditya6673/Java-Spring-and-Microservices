
class Vehicle1 {
    Vehicle1() {
        System.out.println("This is a Vehicle");
    }
}

class Jeep extends Vehicle1 {
    Jeep() {
        System.out.println("This Vehicle is Jeep");
    }
}

class Bus extends Vehicle1 {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Jeep obj1 = new Jeep(); 
        Bus obj2 = new Bus();
        System.out.println("This is an example of Hierarchical Inheritance in Java."+obj1+obj2); 
    }
}
