package Day2;

class demo {
    // Method to print a greeting message
    static void greet() {
        System.out.println("Hello, welcome to Java programming!");
    }
    
    // Method to add two integers and return the result
    int add(int a, int b) {
        return a + b;
    }
}
public class Methods {
    public static void main(String[] args) {
        // Calling the method
        demo.greet(); // Calling the static method directly using the class name
        demo d = new demo();
        int sum = d.add(5, 10); // Calling the instance method using an object of the class
        System.out.println("Sum: " + sum);
    }
}
