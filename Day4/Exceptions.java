class R{
    public void display() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class Exceptions {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
        R obj = new R();
        try {
            obj.display();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
