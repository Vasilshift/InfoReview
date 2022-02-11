package Collections.HashSetExample;

import java.util.*;

public class HashMapFromHashSet {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        //List<Integer> list = new ArrayList<>();
        m.put("a", "Masha");
        m.put("b", "Roma");


            m.remove("a");
            for (Map.Entry<String, String> entry : m.entrySet()) {

                System.out.println("ID = " + entry.getKey() + ", Name = " + entry.getValue());
            }








    }
}
