package abhyas.dayXIII;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Executing periodic task at " + System.currentTimeMillis());
        scheduledExecutorService.scheduleAtFixedRate(task,1,3, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(() -> {
            scheduledExecutorService.shutdown();
            System.out.println("ScheduledExecutor is shut down..");
        },15,TimeUnit.SECONDS);

    }
}
