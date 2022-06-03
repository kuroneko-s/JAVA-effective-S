import executorService.SingleThread;

public class App {
    public static void main(String[] args) {
        SingleThread singleThread = new SingleThread();
        singleThread.run();
        System.out.println(Thread.currentThread() + " Run!");
    }
}
