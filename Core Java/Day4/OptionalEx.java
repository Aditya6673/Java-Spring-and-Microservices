import java.util.List;
//import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        String name = names.stream()
                .filter(n -> n.startsWith("A"))
                .findFirst()
                .orElse("No name found");
        System.out.println(name);
    }
}
