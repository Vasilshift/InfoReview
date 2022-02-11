package ALGORITHMS;

public class Logarifms {
    public static void main(String[] args) {
        // вычисляем log2(target)
        System.out.println(Count(16, 2));

    }

    static double Count(double target, int osnova) {
        return Math.log(target) / Math.log(osnova);
    }
}
