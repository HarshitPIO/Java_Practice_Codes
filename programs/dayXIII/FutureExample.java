package abhyas.dayXIII;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        List<Callable<String>> tasks = new ArrayList<>();
        for(int i=1;i<6;i++) {
            tasks.add(new Task("Task" + i));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            List<Future<String>> futures = executorService.invokeAll(tasks);
            for(Future<String> future : futures) {
                try {
                    String result = future.get();
                    System.out.println(result);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
