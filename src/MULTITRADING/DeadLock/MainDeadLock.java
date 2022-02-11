package MULTITRADING.DeadLock;

public class MainDeadLock {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();     // вызываем метод join() чтобы дождаться выполнения этих 2-х потоков
        thread2.join();

        runner.finished();


    }
}
