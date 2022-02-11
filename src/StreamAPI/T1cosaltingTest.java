package StreamAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class T1cosaltingTest {


    public static void main(String[] args) throws IOException {
        List<Integer> integers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        integers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        List<Integer> list = Arrays.asList(6, 1, 3, 2, 6, 1, 3, 8, 9, 1, 4, 5, 7, 9);
        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        List<String> list1 = Arrays.asList("a", "b", "aa", "dd", "cc", "fff");

        System.out.println(" --------------- Output with charAt");
        System.out.println(list1
                .stream()
                .collect(Collectors.
                        groupingBy(String::length, Collectors.groupingBy(s -> s.charAt(s.length()-1)))));

    }
}
