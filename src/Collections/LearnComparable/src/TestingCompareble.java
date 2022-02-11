package Collections.LearnComparable.src;

import java.util.Arrays;

public class TestingCompareble {
    public static void main(String[] args) {
        Students[] arr = {
                new Students(23, "evgenii"),
                new Students(34, "kirill"),
                new Students(12, "darrell"),
        };

        Arrays.sort(arr);

        for (Students stud : arr) {
            System.out.println(stud);
        }



    }
}
