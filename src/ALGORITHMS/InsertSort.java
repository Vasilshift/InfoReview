package ALGORITHMS;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 6, 7, 4, 7, 88};
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
}


//https://proglib.io/p/java-sorting-algorithms