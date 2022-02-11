package TestGazpromBank;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        doRemove(list);

        System.out.println(list);
    }

    public static void doRemove(ArrayList<Integer> list) {

        Integer a = 100;
        Integer b = 500;

        for (Integer item = 0; item < list.size(); item++)
            if (list.get(item).equals(a) || list.get(item).equals(b) )
                list.remove(list.get(item));


        //list.removeIf(item -> item.equals(a) || item.equals(b));


    }
}
