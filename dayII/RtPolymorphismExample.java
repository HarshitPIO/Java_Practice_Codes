package abhyas.dayII;
class Father {
    void role() {
        System.out.println("I am a Father");
    }
}
class Husband extends Father {
    void role() {
        System.out.println("I am a Husband");
    }
}
public class RtPolymorphismExample {
    public static void main (String[] args) {
        Father obj = new Husband();
        obj.role();
    }
}