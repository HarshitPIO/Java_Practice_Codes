package abhyas.dayXI;

public class World extends Thread{
    public void run() {
        for(int i=1;i<10;i++) {
            System.out.println("world");
        }
    }
}
