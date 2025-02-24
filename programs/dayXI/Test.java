package abhyas.dayXI;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        SimpleCounter counter = new SimpleCounter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCounter());
    }
}
