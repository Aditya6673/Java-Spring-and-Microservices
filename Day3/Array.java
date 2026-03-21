class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Array{
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        // 2D array
        int[][] arr2d = new int[2][3];
        for(int i=0; i<arr2d.length; i++){
            for(int j=0; j<arr2d[i].length; j++){
                arr2d[i][j] = (int)(Math.random() * 100);
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        // Jagged array
        int[][] nums = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[4];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        // Multidimensional array
        int[][][] arr3d = new int[2][2][2];
        for(int i=0; i<arr3d.length; i++){
            for(int j=0; j<arr3d[i].length; j++){
                for(int k=0; k<arr3d[i][j].length; k++){
                    arr3d[i][j][k] = (int)(Math.random() * 100);
                    System.out.print(arr3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // Array of objects
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 21);
        for(int i=0; i<students.length; i++){
            System.out.println("Name: " + students[i].name + ", Age: " + students[i].age);
        }
    }
}