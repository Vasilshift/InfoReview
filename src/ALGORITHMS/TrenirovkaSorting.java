package ALGORITHMS;

public class TrenirovkaSorting {
    public static void main(String[] args) {
        int[] arr = {0, 1, 5, 6, 7, 7, 7, 7, 100};
        int key = 7;
        int lowIndex = 0;
        int highIndex = arr.length - 1;


        while (lowIndex <= highIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
                if (key < arr[midIndex]) {
                    highIndex = midIndex - 1;
                } else if (key > arr[midIndex]) {
                    lowIndex = midIndex + 1;
                } else {
                    System.out.println(midIndex);
                    break;
                }



        }



    }
}
