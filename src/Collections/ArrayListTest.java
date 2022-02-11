package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list .add(15);
        list .add(25);
        list .add(9);
        list .add(1);
        list .add(12);
//        list.add(null);
//        list.add(null);

        list.add(1, 14);

        System.out.println(list);
        System.out.println("----------------------------------------");
        System.out.println(list.contains(1));
        System.out.println("-----------------------------------------------");

        list.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("--------------------------");
        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }
}
