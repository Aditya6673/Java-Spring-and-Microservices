public class LVTI {
    //var x = 10; // Error: cannot use 'var' on class level variable
    public static void main(String[] args) {
        int x = 10;
        var y = x + 5;
        int z;
        //var w;  Error: cannot use 'var' on variable without initializer
        var nums = new int[]{1, 2, 3, 4, 5};
    }
}
