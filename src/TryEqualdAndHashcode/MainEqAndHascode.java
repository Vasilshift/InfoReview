package TryEqualdAndHashcode;

import java.util.HashMap;
import java.util.HashSet;

public class MainEqAndHascode {
    public static void main(String[] args) {

        HashSet<Person> personHashSet = new HashSet<>();
        Person person1 = new Person("Sveta", 33);
        Person person2 = new PersonNum("Sveta", 33, 45_000);

        Person person3 = new PersonNum("Sveta", 33, 45_000);
        personHashSet.add(person1);
        personHashSet.add(person2);

        System.out.println(person1.equals(person3));


    }
}
