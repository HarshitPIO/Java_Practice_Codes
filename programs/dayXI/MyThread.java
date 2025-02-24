package abhyas.dayXI;

public class MyThread extends Thread{
    private SimpleCounter counter;
    public MyThread(SimpleCounter counter) {
        this.counter = counter;
    }
    public synchronized void run() {
        for(int i=0;i<1000;i++) {
            counter.increment();
        }
    }
}
