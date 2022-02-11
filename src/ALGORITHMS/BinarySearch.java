package ALGORITHMS;
/** This
 * is javadoc test
 * */
public class BinarySearch {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 4, 1, 10, 5};
        int valueToFind = 10;

        System.out.printf("Index = %d%n", binarySearch(values, valueToFind, 0, values.length - 1));
    }

    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
