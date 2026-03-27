public class Operators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        // Arithmetic operators
        int res = num1 + num2; // addition
        System.out.println("The result of addition is: " + res);
        res = num1 - num2; // subtraction
        System.out.println("The result of subtraction is: " + res);
        res = num1 * num2; // multiplication
        System.out.println("The result of multiplication is: " + res);
        res = num1 / num2; // division
        System.out.println("The result of division is: " + res);
        res = num1 % num2; // modulus
        System.out.println("The result of modulus is: " + res);
        num1++; // increment
        System.out.println("The value of num1 after increment is: " + num1);
        num2--; // decrement
        System.out.println("The value of num2 after decrement is: " + num2);
        // Relational operators
        boolean b = num1 > num2; // greater than
        System.out.println("Is num1 greater than num2? " + b);
        b = num1 < num2; // less than
        System.out.println("Is num1 less than num2? " + b);
        b = num1 >= num2; // greater than or equal to
        System.out.println("Is num1 greater than or equal to num2? " + b);
        b = num1 <= num2; // less than or equal to
        System.out.println("Is num1 less than or equal to num2? " + b);
        b = num1 == num2; // equal to
        System.out.println("Is num1 equal to num2? " + b);
        b = num1 != num2; // not equal to
        System.out.println("Is num1 not equal to num2? " + b);
        // Logical operators
        boolean b1 = true;
        boolean b2 = false;
        b = b1 && b2; // logical AND
        System.out.println("The result of logical AND is: " + b);
        b = b1 || b2; // logical OR
        System.out.println("The result of logical OR is: " + b);
        b = !b1; // logical NOT
        System.out.println("The result of logical NOT is: " + b);
        // Bitwise operators
        int x = 5; // 0101 in binary
        int y = 3; // 0011 in binary
        res = x & y; // bitwise AND
        System.out.println("The result of bitwise AND is: " + res);
        res = x | y; // bitwise OR
        System.out.println("The result of bitwise OR is: " + res);
        res = x ^ y; // bitwise XOR
        System.out.println("The result of bitwise XOR is: " + res);
        res = ~x; // bitwise NOT
        System.out.println("The result of bitwise NOT is: " + res);
        res = x << 1; // left shift
        System.out.println("The result of left shift is: " + res);
        res = x >> 1; // right shift
        System.out.println("The result of right shift is: " + res);
        
    } 
}
