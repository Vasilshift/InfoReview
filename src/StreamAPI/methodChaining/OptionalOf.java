package StreamAPI.methodChaining;

import java.util.Optional;

public class  OptionalOf {
    public static void main(String[] args) {
        Optional<Integer> a = Optional.of("   foo  2 ").map(String::hashCode);
        System.out.println(a);

        //Integer num = Optional.of("1234").flatMap(x -> toInteger(x)).orElse(-1);

        Double random = Optional.<Double>empty().orElseGet(Math::random);
        System.out.println(random);


    }

}

