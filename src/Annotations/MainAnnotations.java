package Annotations;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Stack;

public class MainAnnotations {
    public static void main(String[] args) {

        Person person = new Person();
        Class aClass = person.getClass();

        System.out.println(aClass);

        Method[] methods = aClass.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName() + " ");
        }
    }
}
