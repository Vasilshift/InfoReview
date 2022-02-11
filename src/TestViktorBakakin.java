import DynamicProxyTest.Main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestViktorBakakin {

    int a, b;

    public TestViktorBakakin(int a, int b) {
        this.a = 2;
        this.b = 4;
    }

    public TestViktorBakakin() {
    }

    @Override
    public String toString() {
        return "TestViktorBakakin{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TestViktorBakakin a = new TestViktorBakakin();
        TestViktorBakakin b = new TestViktorBakakin(3, 5);

        TestViktorBakakin c[] = {a, b};

        Arrays.stream(c)
                .peek(s -> {s.a = 1; s.b = 1;})
                //.findAny();
                .forEach(System.out::println);

        for (TestViktorBakakin v : c) {
            System.out.println(Arrays.stream(new String[]{v.toString()}));
        }

        System.out.println(a);
        System.out.println(b);


    }
}
