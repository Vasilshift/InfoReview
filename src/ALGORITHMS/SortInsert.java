package ALGORITHMS;

public class SortInsert {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 7, 7, 5, 0};
        int sortRangeIndex = 1;
        int insertIndex = 0;
        while (sortRangeIndex < arr.length) {
            if (arr[sortRangeIndex] < arr[sortRangeIndex - 1]) {
                //находим позицию в отсортированной части массива, куда надо вставить элемент
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > arr[sortRangeIndex]) {
                        insertIndex = i;
                    }

//                    if() {
//                        int insetIndexAt = insertIndex;
//                    }

                }
            }
            sortRangeIndex++;

        }
    }
}
