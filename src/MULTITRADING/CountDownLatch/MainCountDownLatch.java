package MULTITRADING.CountDownLatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;
// here we do automatic syncronisation with class CountDownLatch
//without call method wait(), notify()

public class MainCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(countDownLatch));
        }
        executorService.shutdown();
        countDownLatch.await();
        System.out.println("Latch has been opened, main thread is procrssing!");



    }
}
