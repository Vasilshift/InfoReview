/**
 * @author Vasilshift
 */
package StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test234 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 8, 4, 2, 8};
        List<Integer> list12 = Arrays.stream(arr).boxed().collect(Collectors.toList());

        System.out.println("random: " + Stream.generate(Math::random).findAny());
        Stream.iterate(1, x -> x + 5).limit(7).forEach(z -> System.out.println("z = " + z));

        String[] str = {"Java", "Kotlin", "Python"};

        Map<String, Integer> map = Arrays.stream(str)
                .collect(Collectors.toMap(x -> x, String::length));

        System.out.println(map);


        List<String> str1 = Arrays.asList("a", "bb", "c", "dd", "eee");
        Map<Integer, List<String>> str2 = str1.stream().collect(Collectors.groupingBy(String::length));








        int arr1 = (int) Arrays.stream(arr).boxed().filter(a ->  a % 2 == 0).count();
        System.out.println(arr1);

        System.out.println(list12);
        


    }
}
