package ALGORITHMS;

import java.util.Arrays;
//work variant
public class Sort_iInsert_3 {
    public static void main(String[] args) {
        int[] testData = {10, 4, 43, 5, 4, 67, 12,0, 99,19};
        System.out.println(Arrays.toString(insertionSort(testData)));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }
}
