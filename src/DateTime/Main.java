package DateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTimeNow1 = LocalDateTime.now();
        System.out.println("Current date time is: " + localDateTimeNow1);
        long m1 = System.currentTimeMillis();
        System.out.println("m1: " + m1);


        List<Integer> integers = new ArrayList<>();
        integers.add(15);
        integers.add(20);
        integers.add(26);



        Instant timeStamp = Instant.now();
        System.out.println(timeStamp.getNano());

        System.out.println("Current date time is 2: " + localDateTimeNow1);
        long m2 = System.currentTimeMillis();
        System.out.println("m2: " + m2);
        System.out.println("m2 - m1 " + (m2 - m1));

    }
}
