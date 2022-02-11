import java.util.Arrays;
import java.util.Comparator;

public class MainModificators {
    public static void main(String[] args) {

        String[] sd = {"aaa", "aaaaa", "a", "aa"};

//        System.out.println(" ");
//        Arrays.sort(sd, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o2.length() - o1.length());
//            }
//        });

        Arrays.sort(sd);

        System.out.println(Arrays.toString(sd));

    }
}
