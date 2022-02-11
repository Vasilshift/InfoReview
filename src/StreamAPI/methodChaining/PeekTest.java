package StreamAPI.methodChaining;

import java.util.Arrays;
import java.util.List;

public class PeekTest {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("a", "b", "c", "dd", "yyy", "eee");

        arr.stream()
                //.map(a -> a+2)
                .filter(a -> a.length()==3)
                .peek(System.out::println)
                .map(a -> a + 2)
                .forEach(System.out::println);


    }
}
