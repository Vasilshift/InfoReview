package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class ReduceLearn {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(9);

        int b = 6;

        Integer list2 = list.stream().reduce( (a, e) -> a * b ).get();

        System.out.println(list2);

    }
}
