package StreamAPI.methodChaining;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy_Method {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("a", "b", "c", "dd", "yy", "eee");

        Map<Integer, List<String>> mapGroup =
                arr.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(mapGroup);

        Map<Integer, String> mapJoin =
                arr.stream().collect(Collectors.groupingBy(String::length, Collectors.joining("+")));

        System.out.println(mapJoin);

        List<Integer> lint = Arrays.asList(2,5,7,4);

        //Integer collect = lint.stream().map(a -> a * 2).collect(Collectors.groupingBy(arr.equals(5))

        System.out.println("====================================");
        arr.stream().map(a -> a + "125")
                .peek(System.out::println)
                .forEach(System.out::println);


        //System.out.println(arr);

    }
}
