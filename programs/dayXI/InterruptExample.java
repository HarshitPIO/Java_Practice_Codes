package abhyas.dayXI;

public class InterruptExample extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        InterruptExample t1 = new InterruptExample();
        t1.start();
        try {
            t1.interrupt();
        } catch( Exception e) {
            System.out.println("Exception handled");
        }
    }
}
