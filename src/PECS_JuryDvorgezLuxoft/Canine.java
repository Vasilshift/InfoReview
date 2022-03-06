package PECS_JuryDvorgezLuxoft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Animal {}
class Canine extends Animal{}
class Dog extends Canine {}
class Wolf extends Canine {}

class MainLuxoftPecs {
    public static void main(String[] args) {
        List<Canine> source = List.of(new Dog(), new Dog(), new Wolf());
        List<? super Animal> destination = new ArrayList<>();

        destination.add(new Dog());
        copy(source, destination);

        System.out.println(destination);

    }

    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        dest.addAll(src);
    }

}
