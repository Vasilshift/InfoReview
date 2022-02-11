import java.util.Arrays;

public class TestingCompareble {
    public static void main(String[] args) {
        Student[] arr = {
                new Student(23, "a"),
                new Student(34, "z"),
                new Student(12, "t"),
        };

        Arrays.sort(arr);

        for (Student stud : arr) {
            System.out.println(stud);
        }



    }
}
