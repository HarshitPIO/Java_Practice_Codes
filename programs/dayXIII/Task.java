package abhyas.dayXIII;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
    private final String taskName;
    public Task(String taskName) {
        this.taskName = taskName;
    }
    public String call() throws Exception {
        int executionTime = (int) (Math.random()* 1000 + 500);
        Thread.sleep(executionTime);
        return taskName + " completed in "+ executionTime + " ms";
    }
}

