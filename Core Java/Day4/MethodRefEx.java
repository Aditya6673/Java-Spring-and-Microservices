import java.util.ArrayList;
import java.util.List;

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperNames);
        List<Human> humans = new ArrayList<>();
        humans = names.stream()
                .map(Human::new)
                .toList();
        System.out.println(humans);
    }
}
