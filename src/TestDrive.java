import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDrive {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, x -> x + 1);
        Set<Integer> set = stream.filter(n -> n > 0)
                .filter(n -> n % 2 == 1)
                .map(x -> x * 2)
                .limit(15)
                .peek(System.out::println)
                .collect(Collectors.toSet());

        int res = set.stream().reduce(0, (x, y) -> x + y);
        System.out.println(res);
    }
}
