package ALGORITHMS;

public class ReverseNumber {
    public static void main(String[] args) {
        // реверс числа без использования строк
        System.out.println(reverse(2438));
    }

    public static int reverse(int num) {
        int temp = 0;
        while (num > 0) {
            temp *= 10;
            temp += num % 10;
            num /= 10;
        }
        return temp;
    }
}
