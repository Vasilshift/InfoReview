/**
 * @author Vasilshift
 */
package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("fgn", "dgbdsb");
        IntStream.range(0, list.size()).mapToObj(idx -> new IndexedValue<>(idx, list.get(idx))).forEach(s -> System.out.println(s));

        //System.out.println(list);

    }



    //public static <T>Stream<IndexedValue<T>> withIndices


}




class IndexedValue<T> {
    public final int index;
    public final T value;

    public IndexedValue(int index, T value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public String toString() {
        return "IndexedValue{" +
                "index=" + index +
                ", value=" + value +
                '}';
    }
}
