package MULTITRADING.ReentrantLock_learn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task {
    private int counter;
    private Lock lock = new ReentrantLock();   // interface Lock, class ReentrantLock
    private void increment() {
        for (int i = 0; i < 10000; i++ ) {
            counter++;
        }
    }
    public void firstThread() {
        lock.lock();             // работает также как synchronized, то есть вызывая метод lock()
        increment();
        lock.unlock();           // только 1 поток может вызвать метод lock(), если какой-то поток
                                 // вырывется вперед и вызывает метод lock(), то остальные потоки ждут
    }
    public void secondThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void showCounter() {
        System.out.println("counter = " + counter);
    }
}
