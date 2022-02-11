package Lambdas;

import java.util.ArrayList;

public class PredicateTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("we");
        al.add("learn");
        al.add("java");
        al.add("Collections");

        al.removeIf(a -> a.length() < 4);
        System.out.println(al);


    }
}
