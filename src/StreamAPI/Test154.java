/**
 * @author Vasilshift
 */
package StreamAPI;

import java.util.stream.Stream;

public class Test154 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3);




        stream
                .distinct()
                .peek(i -> System.out.println(i+ " "))
                .filter(element -> element > 2)
                .peek(i -> System.out.println(i + ""))
                //.map(element -> element * 10)
                //.peek(i->System.out.println(i + ""))
                .count();
    }
}
