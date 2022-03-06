package ALGORITHMS;

public class Sort_Selection {
    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 1, 56};
        for (int i = 0; i < arr.length; i++) {
            int j = lowIndex(arr, i);
            swapArr(arr, i, j);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swapArr(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int lowIndex(int[] array, int start) {
        int lowestIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
}
