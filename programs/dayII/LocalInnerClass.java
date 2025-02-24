package abhyas.dayII;

class Outers {
    void outerMethod() {
        final int x = 12;
        System.out.println("In outer class");

        class Inner {
            void innerMethod() {
                System.out.println("x= " + x);
            }
        }
        Inner obj = new Inner();
        obj.innerMethod();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        Outers myObj = new Outers();
        myObj.outerMethod();
    }
}
