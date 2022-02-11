package StreamAPI.methodChaining;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream.generate(new Random()::nextDouble).limit(8).forEach(System.out::println);
        System.out.println("----------------------------------------------------------");
        Stream.of("frt", "ghyu", "xbfsng").mapToInt(String::length).forEach(System.out::println);
        System.out.println("----------------------------------------------------------");
        Stream.of("frt", "ghyu", "xbfsng").flatMapToInt(String::chars).forEach(x -> System.out.print((char)x));
        System.out.println("----------------------------------------------------------");

        Stream.of("bar", "noki", "lepel", "anna")
                .peek(System.out::println)
                //.filter(x -> x.startsWith("l"))
                .forEach(a -> System.out.println("Result = " + a));

        System.out.println("----------------------------------------------------------");

        IntStream.iterate(2, a -> a * 3).limit(8).sorted().forEach(System.out::println);

        System.out.println("----------------------------------------------------------");

        Stream.of(1,2,5,3).peek(System.out::println);

        System.out.println("---------------- learn flatMap ---------");

        List<List<String>> listOfString = List.of(
                List.of("fooi", "bar", "baz"),
                List.of("Java", "Kotlin", "Groovy"),
                List.of("Hello", "Good by"));

        System.out.println(listOfString.stream()
                .flatMap(List::stream)
                .anyMatch("Java"::equals));







    }
}
