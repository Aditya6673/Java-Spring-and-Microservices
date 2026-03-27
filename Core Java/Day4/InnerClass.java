class AnonymousClass
{
    int age;
    void show()
    {
        System.out.println("In A Show");
    }
    class B
    {
        void show()
        {
            System.out.println("In B Show");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        AnonymousClass obj = new AnonymousClass(); // Creating an object of class AnonymousClass
        obj.show(); // This will call the show() method of class AnonymousClass
        // B obj1 = new B(); // This will cause a compile-time error because B is an inner class of A and cannot be accessed directly without an instance of A
        // To create an instance of the inner class B, we need to first create an instance of the outer class A and then use that instance to create an instance of the inner class B.
        AnonymousClass.B obj2 = obj.new B(); // Creating an instance of the inner class B using the instance of the outer class A
        obj2.show(); // This will call the show() method of class B

        AnonymousClass obj3 = new AnonymousClass()
        {
            void show()
            {
                System.out.println("In Anonymous Class Show");
            }
        }; // This is an anonymous class that extends class A and overrides the show() method
        obj3.show(); // This will call the overridden show() method of the anonymous class

    }
}
