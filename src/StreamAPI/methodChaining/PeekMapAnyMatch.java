package StreamAPI.methodChaining;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekMapAnyMatch {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 1, 8, 9};
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(7);
        list1.add(2);
        list1.add(1);

        int array1 = Arrays.stream(array).filter(e -> e%2 == 1)
                .map(a -> {if (a%3==0) {a = a/3;} return a;})
                .reduce( (s,d) -> (s+d) )
                .getAsInt();

        System.out.println(array1);
        System.out.println("-----------------------------");

        Arrays.stream(array).filter(a -> a%2==0)
                .forEach(System.out::println);
        System.out.println("------------------------");


        // Задача на понимание стримов
        System.out.println(Stream.of("a", "b", "c")
                .peek(System.out::print)
//                .collect(Collectors.toList()));

                .map(String::toUpperCase)
                .peek(System.out::println)
                .anyMatch("C"::equals)
//                .collect(Collectors.toList())
                );

        Stream<String> ch = Stream.of("a", "h", "k");
        System.out.println(ch.map(String::toUpperCase).collect(Collectors.toList()));


    }
}
