package Regex;

import java.util.Arrays;

public class RegexMain {
    public static void main(String[] args) {
        String a = "1234";
        System.out.println(a.matches("12341"));

        //     \\d - single number

        String b = "256";
        System.out.println(b.matches("-?\\d*"));

        String c = "+156";
        System.out.println(c.matches( "(\\-|\\+)?\\d*"));

        String f = "yxvb45654";
        System.out.println( f.matches("[a-zA-Z]+\\d*"));
        String f1 = "2yxvb535654";
        System.out.println( f1.matches("[12a-zA-Z5]+\\d*"));

        String f2 = "svdcf";
        System.out.println(f2.matches( "[^abc]*" ));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

        String e = "4643646";
        System.out.println(e.matches("\\d{2,}"));

        String r = "Hello5466there";
        String[] words = r.split("54");
        System.out.println(Arrays.toString(words));

        String i = "Hello there";
        String ry = i.replace(" ", ".");
        System.out.println(ry);

        String string1 = "Hello3653564there";
        String stringEnd = string1.replaceAll("\\d+", "-");
        System.out.println(stringEnd);

        String string2 = "Hello3653564there3634654";
        String stringEnd2 = string2.replaceFirst("\\d+", "-");
        System.out.println(stringEnd2);



    }
}
