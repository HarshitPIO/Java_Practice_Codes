package abhyas.dayII;
class Outer {
    class Inner {
        public void show() {
            System.out.println("In a nested class");
        }
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.show();
    }
}