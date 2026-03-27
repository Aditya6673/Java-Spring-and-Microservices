public class Conversion {
    public static void main(String[] args) {
        byte b = 100;
        int i = b; // implicit conversion from byte to int
        System.out.println("The value of i is: " + i);

        int j = 257;
        byte c = (byte) j; // explicit conversion from int to byte
        System.out.println("The value of c is: " + c); // will print 1 due to overflow

        float f = 5.6f;
        int k = (int) f; // explicit conversion from float to int
        System.out.println("The value of k is: " + k); // will print 5, truncating the decimal part
        
    }
}
