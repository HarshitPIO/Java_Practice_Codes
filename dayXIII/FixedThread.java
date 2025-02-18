package abhyas.dayXIII;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=1;i<6;i++) {
            Runnable task = new WebRequestHandler("Request "+ i);
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}
class WebRequestHandler implements Runnable {
    private final String requestName;
    public WebRequestHandler(String requestName) {
        this.requestName = requestName;
    }
    public void run() {
        System.out.println(requestName + " is being processed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(requestName + " has been processed by " + Thread.currentThread().getName());
    }
}
