package TestInterfaces;

public class Main124578 implements I1, I2 {
    public static void main(String[] args) {
        Main124578 c = new Main124578();
        if( args.length == 0 ){
            c.m();
        }
    }

    @Override
    public void m() {
        System.out.println("hju");
    }
}

interface I1 {
    default void m(){
        System.out.println("hello interface 1");
    }
}

interface I2 {
    void m();
}
