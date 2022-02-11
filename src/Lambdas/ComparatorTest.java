package Lambdas;

import modificators.TestModif;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Masha");
        list.add("fag");
        list.add("ki");
        list.add("zzzzz");

        List<String> listNew = new ArrayList<>(list);

        listNew.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length()) return -1;
                else if (s1.length() > s2.length()) return 1;
                else return 0;
            }
        });

        System.out.println("listNew: " + listNew);

        Comparator<String> comp = ((s1, s2) -> {
            if (s1.length() < s2.length()) return -1;
            else if (s1.length() > s2.length()) return 1;
            else return 0;
        });
        list.sort(comp);
        System.out.println(list);
    }
}
