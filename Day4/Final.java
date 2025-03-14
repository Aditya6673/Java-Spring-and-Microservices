final class Calc{
    public final void show(){ 
        System.out.println("In Calc Show");
    }
    public void add(int a, int b){
        System.out.println("Sum: " + (a+b));
    }
}
// Final class cannot be extended, will cause a compile-time error
// Final method cannot be overridden, will cause a compile-time error
public class Final {
    public static void main(String[] args) {
        final int x = 10; // Declaring a final variable
        // x = 20; // This will cause a compile-time error because you cannot change the value of a final variable

    }
}
