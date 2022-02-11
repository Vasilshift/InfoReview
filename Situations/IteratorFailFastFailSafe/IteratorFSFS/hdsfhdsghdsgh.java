import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class hdsfhdsghdsgh {
    public static void main(String[] args) {
        //List<Integer> l = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        //List<Integer> l1 = new CopyOnWriteArrayList<>(Arrays.asList(1, 10, 3, 4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        ListIterator<Integer> it = l2.listIterator();
        ListIterator<Integer> it1 = l2.listIterator();

            while (it1.hasNext()) {
                int el = it1.next();
                if (el == 1) {
                    //l1.add(56);
                    it1.add(12);
                    it1.add(16);
                    //it1.remove();
                }
            }

        System.out.println(Arrays.asList(l2));
    }
}

