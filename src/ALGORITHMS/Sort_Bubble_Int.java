package ALGORITHMS;

import java.util.Arrays;

public class Sort_Bubble_Int {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 7, 5, 0, 7, 1};
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println(Arrays.toString(arr));

        //VARIANT 2

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Sort var 2: ");
        System.out.println(Arrays.toString(arr));
    }
}
