package ALGORITHMS;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {4, 45, 7, 41, 561};
        Optional<Integer> firstFounded = findDuplicated(arr);
        //System.out.println(firstFounded.get());
        firstFounded.ifPresent(System.out::println);
    }

    public static Optional<Integer> findDuplicated(int[] a) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (!set.add(a[i])) {
                //return a[i];
                return Optional.of(a[i]);
            }
        }

        return Optional.empty();
    }
}
