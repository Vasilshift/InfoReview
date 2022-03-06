package ALGORITHMS;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 8};
        int[] arr2 = {3, 4, 6, 10};

        int size = arr1.length + arr2.length;
        int[] result = new int[size];
        int arr1Index = 0;
        int arr2Index = 0;

        for (int i = 1; i < result.length; i++) {
            if (arr1[arr1Index] <= arr2[arr2Index]) {


                arr1Index++;
                arr2Index++;
            } else {
                result[i] = arr2[arr2Index];


                arr1Index++;
                arr2Index++;

            }

        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }
}
