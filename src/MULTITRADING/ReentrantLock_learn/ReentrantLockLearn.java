package MULTITRADING.ReentrantLock_learn;

//learn class ReentrantLock
// for syncronisation flows
//делаем код потокобезопасным, чтобы 2 потока могли писать в одну и ту же переменную
//с помощью ReentrantLock

public class ReentrantLockLearn {
    public static void main(String[] args) throws InterruptedException {

        Task task = new Task();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override public void run() {
                task.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();    // call join() for in flow main wait run first and second flows.
        thread2.join();

        task.showCounter();

    }
}
