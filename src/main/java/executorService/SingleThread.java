package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThread {

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    static class SingleRunnable implements Runnable {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + " Run!");
        }
    }

    public void run() {
        System.out.println(Thread.currentThread() + " Run!");

        Thread thread = new Thread(new SingleRunnable());

        for (var i = 0; i < 10; i++) {
            executorService.submit(thread);
        }

        executorService.shutdown();
    }

    public void runWithReturnValue() {

    }
}
