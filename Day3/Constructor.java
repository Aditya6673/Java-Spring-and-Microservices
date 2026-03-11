class Student {
    String name;
    int age;
    // Default constructor
    Student(){

    }
    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Private constructor
    private Student(String name) {
        this.name = name;
    }
    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        System.out.println("Name: " + s1.name + ", Age: " + s1.age);
        Student s2 = new Student(s1);
        System.out.println("Name: " + s2.name + ", Age: " + s2.age);
    }
}
