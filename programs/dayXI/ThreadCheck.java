package abhyas.dayXI;

public class ThreadCheck {
    public static void main(String[] args) {
        World world  = new World();
        world.run();
//        world.start();
        for(int i=1;i<10;i++) {
            System.out.println("Hello");
        }
    }
}
