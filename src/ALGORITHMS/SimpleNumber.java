package ALGORITHMS;
//проверить является ли число простым
public class SimpleNumber {
    public static void main(String[] args) {
        int num = 6;
        int tmp = 0;
        int counter = 1;
        while (counter <= num) {
            if (num % counter == 0) {
                tmp++;
            }
            counter++;
        }
        if (tmp == 2) System.out.println("number is simple!");
        else System.out.println("no simple");
    }
}
