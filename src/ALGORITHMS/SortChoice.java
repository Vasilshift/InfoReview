package ALGORITHMS;

import java.util.ArrayList;
import java.util.List;

public class SortChoice {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {6,4,8,2,1};
        sortNaive(array);
        for (int k:array) {
            System.out.println(array[k]);
        }
    }
// don't work correctly

    public static void sortNaive(Integer[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = array[i];
            //int min = current;
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            //array[i] = min;

        }
    }
}
