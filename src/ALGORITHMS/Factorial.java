package ALGORITHMS;

import java.util.stream.Stream;

public class Factorial {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 5, 8};

        Stream.iterate(new long[] { 0, 1 }, p -> new long[] { p[1], p[0] + p[1] })
                .limit(8)
                .map(t -> t[0])
                .mapToInt(Long::intValue)
                .forEach(System.out::println);
    }

}
