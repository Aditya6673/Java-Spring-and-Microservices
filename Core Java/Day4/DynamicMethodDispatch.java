class Ant
{
    public void show(){
        System.out.println("In A Show");
    }
}
class Bat extends Ant
{
    public void show(){
        System.out.println("In Bat Show");
    }
}
class C extends Ant
{
    public void show(){
        System.out.println("In C Show");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Ant obj = new Ant(); // Creating an object of class Ant and assigning it to a reference variable of type Ant
        obj.show(); // This will call the show() method of class Ant
        obj = new Bat(); // Upcasting: An reference variable of type Ant is referring to an object of type Bat
        obj.show(); // This will call the show() method of class Bat at runtime due to dynamic method dispatch (runtime polymorphism).
        obj = new C(); // Upcasting: An reference variable of type Ant is referring to an object of type C
        obj.show(); // This will call the show() method of class C at runtime due to dynamic method dispatch (runtime polymorphism).
        // B obj1 = new A();  This will cause a compile-time error because you cannot assign a superclass reference to a subclass variable without explicit casting.

    }
}