package abhyas;
 final class Test {
    void display() {
        System.out.println("Accessed");
    }
}
//class Exam extends Test {
//    void Print() {
//        System.out.println("Inherited");
//    }
//}
public class FinalExample {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}