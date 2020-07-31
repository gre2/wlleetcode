
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Egg {
    static Integer sum=0;
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(10);
        Object lock=new Object();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                for(int j = 1; j <= 100; j++) {
                    synchronized (lock) {
                        sum += j;
                        System.out.println(sum);
                    }
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println("执行完毕");
        executorService.shutdown();
        executorService.awaitTermination(10000, TimeUnit.MILLISECONDS);
    }
}