package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        List<Animals> animals = getAnimals();
        //Filter
        animals.stream()
                .filter(l -> l.getTypeAnimal().equals(TypeAnimal.HERBIVORE))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("ANIMALS SORTED:");
        animals.stream()
                .sorted(Comparator.comparing(Animals::getAge))
                .forEach(System.out::println);

        //All match
        System.out.println("ALL MATCH:");
        boolean allMatch = animals.stream()
                .allMatch(a -> a.getAge()<50);
        System.out.println(allMatch);

        //Разложим коллекцию по ключу
        System.out.println("COLLECTION BY MAPPING");
        Map<TypeAnimal, List<Animals>> classificationMap =
                animals.stream()
                .collect(Collectors.groupingBy(Animals::getTypeAnimal));

        classificationMap.forEach((typeAnimal, animals1) -> {
                System.out.println(typeAnimal);
                animals1.forEach(System.out::println);
        });

        System.out.println("СДЕЛАЕМ CHAIN:");
        Optional<String> oldestAnimal =
                animals.stream()
                .filter(f -> f.getAge() < 40)
                .max(Comparator.comparing(Animals::getAge))
                .map(Animals::getName);

        oldestAnimal.ifPresent(System.out::println);

    }

    private static List<Animals> getAnimals() {
        return List.of(
                new Animals(34, "Tiger", TypeAnimal.PREDATOR),
                new Animals(45, "Elefant", TypeAnimal.HERBIVORE),
                new Animals(5, "Lynx", TypeAnimal.PREDATOR),
                new Animals(9, "Mouse", TypeAnimal.OMNIVOROUS)
        );
    }
}
