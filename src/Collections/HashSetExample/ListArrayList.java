package Collections.HashSetExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ListArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        //list.add(1, 13);

        //list.get(2);
        System.out.println(list);

        list.stream().reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer ^ integer2;
            }
        }).stream().collect(Collectors.toList()).forEach(System.out::println);






    }
}
