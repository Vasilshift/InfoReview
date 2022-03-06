package PECS_principles.java;

import java.util.ArrayList;
import java.util.*;

public class Prod {
    public static void main(String[] args) {

        List<? super Mercedes> list2 = new ArrayList<>();

        list2.add(new Mercedes());
        list2.add(new SmartCar());
        list2.add(new MicroCar());
        //list2.add(new CarPPP());

        list2.get(0);


        CarPPP carPPP = new MicroCar();
        Object o = new CarPPP();

        Object o1 = new Object();


    }
}
