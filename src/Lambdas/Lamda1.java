package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArr(arr);
        fillList(list);
        System.out.println("Initial array: " + Arrays.toString(arr));
        System.out.println("Initial list: " + list);
        System.out.println("-------------------------------------------------");
        //умножим каждый элемент массива и листа на 2 с использов цикла
        for (int i = 0; i < 10; i++) {
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) * 2);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println("--------------------block 2 method map------------------------------");
        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
        //list = list.stream().map(a -> a * 2).toList();
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println("---------------end of method map ------------------------------------");
        System.out.println("--------------- begin reduce  ---------------------------------------");
        int sum1 = Arrays.stream(arr).reduce((acc, b) -> acc + b).getAsInt();
        int sum2 = list.stream().reduce(1, (acc, b) -> acc + b);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println("--------------- end reduce  -----------------------------------------");

    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
    }

}

