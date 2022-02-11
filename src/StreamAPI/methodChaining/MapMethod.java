package StreamAPI.methodChaining;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {
        String[] arr = {"sasha", "masha", "oli"};

        Map<String, Integer> map = Arrays.stream(arr)
                .collect(Collectors.toMap(x -> x, String::length));

        System.out.println(map);




    }
}
