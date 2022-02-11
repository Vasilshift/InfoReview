package ALGORITHMS;

//works 19/12/2021
public class BinarySearchRecursiv {
    public static void main(String[] args) {
        int[] arr = {-50, 1, 5, 6, 7, 7, 100};

        System.out.println(BinarySearchRecursiv.binarySearch(arr, 5, 0, 6));

    }

    public static int binarySearch(int[] sortedArray, int key, int low, int high) {
        // считаем индекс центрального элемента
        int middle = low + (high - low) / 2;

        // base case (условие выхода) - регион поиска пустой
        if (low > high) {
            // не нашли элемента, который равен ключу
            return -1;
        }
        if (key == sortedArray[middle]) {
            // в случае, если элемент в центре равняется ключу (нашли элемент)
            return middle;
        } else if (key < sortedArray[middle]) {
            // рекурсивный вызов для левого подмассива
            // не забывайте здесь ключевое слово return (подумайте, зачем оно нужно)
            return binarySearch(sortedArray, key, low, middle - 1);
        } else {
            // рекурсивный вызов для правого помассива
            return binarySearch(sortedArray, key, middle + 1, high);
        }
    }

}
