package abhyas;
public class ConstructorExample {
    int x;
    ConstructorExample() {
        x=5;
    }
    ConstructorExample(int y) {
        x=y;
    }
    public static void main(String[] args) {
        ConstructorExample myObj = new ConstructorExample() ;
        System.out.println(myObj.x);

        myObj = new ConstructorExample(6);
        System.out.println(myObj.x);
    }
}