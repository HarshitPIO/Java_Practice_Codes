package abhyas.dayXII;

public class Task implements Runnable{
    private String threadNo;
    public Task(String no) {
        this.threadNo = no;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "start execution. Threaad no = " + threadNo);
        processThread();
        System.out.println(Thread.currentThread().getName()+ "stop execution");
    }
    private void processThread() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String toString() {
        return this.threadNo;
    }
}
