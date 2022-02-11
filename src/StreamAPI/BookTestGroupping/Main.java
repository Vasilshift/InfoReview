package StreamAPI.BookTestGroupping;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.minBy;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> listBook = new HashMap<>();

        listBook.put("Julianna Cosmina", 1);
        listBook.put("Sanjey Mishra", 2);
        listBook.put("Joshua Bloch", 3);

        //BookImpl<String, Integer> b;

//        Map<String, Integer> d = Stream.of(listBook)
//                .collect(Collectors
//                        .groupingBy(String::length)

        Stream
                .of("1", "2", "3")
                .map(s -> s + "-")
                .peek(System.out::println)
                .collect(Collectors.toList())
                .forEach(System.out::println);










    }
}
