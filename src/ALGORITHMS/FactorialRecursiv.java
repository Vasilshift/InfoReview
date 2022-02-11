package ALGORITHMS;

public class FactorialRecursiv {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    public static double fac(double f) {
        return f == 0 ? 1 : f * fac(f - 1);
    }


}
