package Day2;

class Calculator {
    int num = 42; // Instance variable (field)
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    // Method overloading: same method name but different parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method overloading: same method name but different parameters
    double add(double a, double b) {
        return a + b;
    }
}
public class Objects {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calc = new Calculator();
        Calculator calc2 = new Calculator(); // Another object of the Calculator class
        
        // Call the add method
        int result = calc.add(5, 10);
        System.out.println("Result: " + result);

        calc.num = 100; // Modifying the instance variable of calc

        System.out.println(calc.num); // Accessing the instance variable
        System.out.println(calc2.num); // Accessing the instance variable of another object
    }
}