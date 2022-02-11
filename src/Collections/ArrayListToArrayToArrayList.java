package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrayToArrayList {
    public static void main(String[] args) {
        //Преобразование ArrayList в массив

        String[] stringArray = { "a", "b", "c", "d", "e" };

        System.out.println(Arrays.asList(stringArray));

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));

        System.out.println(arrayList);

        String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
        for (String s : stringArr)
            System.out.println(s);

    }
}
