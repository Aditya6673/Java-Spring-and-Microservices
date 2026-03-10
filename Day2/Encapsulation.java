package Day2;

// Encapsulation is the concept of wrapping data (variables) and methods (functions) together as a single unit.
// It helps to protect the data from outside interference and misuse.

// Example of encapsulation using a class with private fields and public getter/setter methods
class Person {
    private String name; // Private field
    private int age; // Private field

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation to ensure age is positive
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
