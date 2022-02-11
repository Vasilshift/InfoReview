import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterBooks {
    public static void main(String[] args) {

        //Book<String> book = new Book<>("dsfs");
        //ISBN isbn = new ISBN("0-201-63361-2");
        List<Book> found = new ArrayList<Book>();
        found.add(new Book(new ISBN("0-201-63361-2")));
        found.add(new Book(new ISBN("0-201-63361-3")));
        found.add(new Book(new ISBN("0-201-63361-4")));





        System.out.println(found);

        ListIterator<Book> iter = found.listIterator();
        while(iter.hasNext()){
            iter.remove();
        }

        System.out.println(found);


    }
    private static class ISBN {
        public ISBN(String s) {
        }
    }
}
