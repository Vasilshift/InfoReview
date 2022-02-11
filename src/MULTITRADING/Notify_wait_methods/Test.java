package MULTITRADING.Notify_wait_methods;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {
     public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started ... ");
            this.wait();   // 1. отдаем intrinsic lock, 2. ждем плка будет вызван notify()
            System.out.println("Producer threds resumed ... ");
        }
     }

     public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for return pressed ");
            scanner.nextLine();
            this.notify();
            //мы вызвали notify(), но мы не отдали монитор объекта this другому потоку

            Thread.sleep(3000);
        }
     }
}
