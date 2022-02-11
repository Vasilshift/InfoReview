package MULTITRADING.Semaphore;

import java.util.concurrent.Semaphore;

public class Connection {
    private static final Connection connection = new Connection();
    private int connectionsCount;
    private final Semaphore semaphore = new Semaphore(10);
            /*У нас 200 потоков и мы хотим чтобы в один момент времени использовалось не все 200
        потоков, а например 10 */

    private Connection () { }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        }
        finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println("connectionsCount: " + connectionsCount);
        }
        Thread.sleep(4000);
        synchronized (this) {
            connectionsCount--;
            System.out.println("connectionsCount after --: " + connectionsCount);
        }
    }
}
