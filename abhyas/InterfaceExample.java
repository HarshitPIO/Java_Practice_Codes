package abhyas;
interface Printable {
    void print();
}
interface Showable {
    void print();
}
class InterfaceExample implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample() ;
        obj.print();
    }
}