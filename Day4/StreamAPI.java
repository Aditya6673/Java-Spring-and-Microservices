import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        //Consumer<Integer> cons = (n) -> System.out.println(n);
        nums.forEach(n -> System.out.println(n));
        // Stream<Integer> s = nums.stream();
        // Stream<Integer> s1 = s.filter(n -> n > 20);
        // Stream<Integer> s2 = s1.map(n -> n*2);
        // int result = s2.reduce(0, (a, b) -> a+b);
        int result = nums.stream()
                        .filter(n -> n > 20)
                        .map(n -> n*2)
                        .reduce(0, (a, b) -> a+b);
        System.out.println(result);
        

    }
}
