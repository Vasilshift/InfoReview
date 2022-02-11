import java.util.*;

public class MainYYYYY {
    public static void main(String[] args) {

        Deque deque = new ArrayDeque();

        final byte[] byteAr = new byte[] {15,12,15};
        System.out.println(byteAr.hashCode());
        byteAr[0] = 3;
        System.out.println(byteAr);
        System.out.println(byteAr.hashCode());


        final String gh = new String("abcd");

        deque.stream().forEach(System.out::println);




        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");

        Iterator iterator = cityCode.keySet().iterator();


        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));

            // adding an element to Map
            // exception will be thrown on next call
            // of next() method.
            cityCode.put("Istanbul", "Turkey");
        }


    }
}
