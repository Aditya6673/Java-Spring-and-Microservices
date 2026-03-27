import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10000);
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            nums.add(random.nextInt(100));
        }
        int sum = nums.stream()
                .map(i -> i * 2)
                .reduce(0,(c,e) -> c+e);
        long start = System.currentTimeMillis();
        int sum1 = nums.stream()
                    .map(i -> {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        return i*2;
                    })
                    .mapToInt(i -> i)
                    .sum();
        long end = System.currentTimeMillis();
        long l = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                    .map(i -> {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        return i*2;
                    })
                    .mapToInt(i -> i)
                    .sum();
        long r = System.currentTimeMillis();
        System.out.println(sum + " " + sum1 + " " + sum2);
        System.out.println("Seq: " + (end - start));
        System.out.println("Parallel: " + (r - l));
    }
}