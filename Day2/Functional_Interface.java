package Day2;

// Functional Interface with a single abstract method
@FunctionalInterface
interface MyFunctionalInterface {
    int add(int a, int b); // Abstract method
}

public class Functional_Interface {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface myFunc = (a, b) -> a + b;
        
        // Calling the method of the functional interface
        int result = myFunc.add(5, 10);
        System.out.println("Result: " + result);
    }
}
