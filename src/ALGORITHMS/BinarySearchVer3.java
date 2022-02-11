package ALGORITHMS;
//works at sorted array   19/12/2021

public class BinarySearchVer3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 12, 15, 16};
        int key = 8;
        int lowIndex = 0;
        int highIndex = arr.length-1;

        while (lowIndex <= highIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (key < arr[midIndex]) {
                highIndex = midIndex - 1; }
            else if (key > arr[midIndex]) {
                lowIndex = midIndex + 1;
            } else {
                System.out.println("key is founded! and it index = " + midIndex);
                break;
            }

        }
    }
}
