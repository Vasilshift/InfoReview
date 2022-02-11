package MULTITRADING.threads;

//import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Thread1());
        thread1.start();
        //thread1.wait(1000);

        Thread thread2 = new Thread(new Thread2());
        thread2.start();

    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am thread 1 ...");
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am thread 2 ...");
    }
}
