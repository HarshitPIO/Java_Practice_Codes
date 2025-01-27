package abhyas;
class Example {
    static void display() {
        System.out.println("I am accessible");
        }
    static {
        System.out.println("here also");
    }
}
public class StaticExample {
    public static void main(String[] args)
    {
        Example.display();
    }
}