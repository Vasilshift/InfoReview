package PATTERNS.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightMain {
    public static void main(String[] args) {
        FlyWeightBank flyWeightBank = new FlyWeightBank();
        Person person = flyWeightBank.getPerson("Vasya");
        Person person1 = flyWeightBank.getPerson("Vasya");
        System.out.println(person.name);
        System.out.println(person1.name);
    }
}

class Person {
    String name;
}

class FlyWeightBank {
    Map<String, Person> map = new HashMap<>();
    Person getPerson(String name) {
        Person person = map.get(name);
        if (person == null) {
            person = new Person();
            person.name = name;
            map.put(name, person);
        }
        return person;
    }
}
