package Collections.HashMapIncorrectHashCode;

import java.util.HashMap;
import java.util.Map;

public class MainHash {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        Person p1 = new Person(2, "Vasia", "Pupkin");
        Person p2 = new Person(34, "Kolia", "Kadach");
        Person p3 = new Person(125, "Olia", "Leleva");
        Person p4 = new Person(156, "Sasha", "Iurin");
        Person p5 = new Person(228, "Sasha", null);
        Person p6 = new Person(229, "Sasha", null);

        map.put(1, p1);
        map.put(2, p1);
        map.put(null, p3);
        map.put(null, p4);
        map.put(5, null);
        map.put(6, null);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println("Value: " + entry.getValue() + "Hashcode: " + entry.hashCode() + "Key " + entry.getKey());
        }
        System.out.println("-----------------------------------------");
        System.out.println(map);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "sgvfa");
        map1.put(2, "sgvbdzb");
        map1.put(null, "sgvbdzb");
        map1.put(null, "sgvbdzbnsjhncf");
        //map1.put(null, null);
        map1.put(3, null);
        map1.put(4, null);

        System.out.println("--------------------------------");
        System.out.println(map1);




    }
}
