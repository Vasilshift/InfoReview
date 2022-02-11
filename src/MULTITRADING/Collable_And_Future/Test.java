package MULTITRADING.Collable_And_Future;

import java.util.Random;
import java.util.concurrent.*;

//  классы Collable and Future позволяют возвращать значение из потоков
// + выбрасывать исключение из потоков
// в интерфейсе Collable можно возвращать что-либо из метода

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
           @Override
           public Integer call() throws Exception {
               System.out.println("Starting ... ");               // possibile transfer to lambda,
               try {                                              // but it seems to method interface Runnable
                   Thread.sleep(500);                      // JAVA anderstandd what here use Callable
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("Finished! ");
               Random random = new Random();
               int valueRandom = random.nextInt();
               if (valueRandom < 5) throw new Exception("Somthing wet wrong ");
               return random.nextInt(10);
           }
       });
       executorService.shutdown();

        try {
            int result = future.get();
            System.out.println("result " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
