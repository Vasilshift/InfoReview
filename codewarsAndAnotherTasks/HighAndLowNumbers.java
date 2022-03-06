//In this little assignment you are given a string of space separated numbers, and have to
//        return the highest and lowest number.
//        Examples
//        highAndLow("1 2 3 4 5")  // return "5 1"
//        highAndLow("1 2 -3 4 5") // return "5 -3"
//        highAndLow("1 9 3 4 -5") // return "9 -5"
//        Notes
//        All numbers are valid Int32, no need to validate them.
//        There will always be at least one number in the input string.
//        Output string must be two numbers separated by a single space, and highest number is first.

import java.util.Arrays;
import java.util.Comparator;

public class HighAndLowNumbers {
    public static void main(String[] args) {
        String a = "-111 2 -3 4 5";

        String[] b = a.split(" ");

        String maxElem = Arrays.asList(b).stream().max(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }).get();

        String minElem = Arrays.asList(b).stream().max(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }).get();

        System.out.println(maxElem + " " + minElem);

    }
}
