import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDrive {
    public static void main(String[] args) {
        Set<Integer> set = Stream.generate(TestDrive::rand)
                .filter(n -> n > 0)
                .filter(n -> n % 2 == 1)
                .map(x -> x * 2)
                .limit(15)
                .peek(System.out::println)
                .collect(Collectors.toSet());

        int res = set.stream().reduce(0, (x, y) -> x + y);
        System.out.println(res);

    }

    public static int rand(){
        int x = (int)(Math.random() * 100 -50);
        return x;
    }
}
