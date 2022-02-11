package Collections.HashSetExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Misha");
        set.add("Masha");
        set.add("Mara");
        set.add("Egor");

        set.stream().forEach(System.out::println);
        System.out.println("======================================");
        System.out.println(set);
        System.out.println("======================================");


    }
}
