package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test22 {
    public static void main(String[] args) {

        // Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4",
                "1", "2.3");

        // Creating a List of Strings
        List<String> list1 = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg", "ojo");

        // Using Stream flatMap(Function mapper)
        list1.stream().flatMap(str ->
                Stream.of(str.charAt(0))).
                forEach(System.out::println);

        List<Integer> listInt = Arrays.asList(15, 41, 10, 2);

        int sum = IntStream.iterate(1, s -> s*2)
                .filter(f -> f % 2 == 0)
                .limit(10)
                .sum();

        System.out.println("sum = " + sum);


    }
}
