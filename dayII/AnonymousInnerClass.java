package abhyas.dayII;
import java.util.*;
 class Demo {
    void show() {
        System.out.println("I am in show method of super class");
    }
}
public class AnonymousInnerClass  {
     // An anonymous class is created using demo as base class
        static Demo d = new Demo() {
            void show() {
                super.show();
                System.out.println("I am in AnotherDemo");
            }
};

    public static void main(String[] args) {
        d.show();
    }
}
