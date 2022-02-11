package ALGORITHMS;
import java.util.*;

public class SortingBubble {
    public static void main(String[] args) {
        int[] ints = {30, 30, 5, 8, 1, 100, 3, 2, 5};
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < ints[i]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
