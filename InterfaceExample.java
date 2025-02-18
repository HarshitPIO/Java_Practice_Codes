package abhyas;
interface Printable {
   default  void print() {
       System.out.println("I am in !st ");
   };
   void greet();
}
interface Showable {
    default void print() {
        System.out.println("I am in 2nd");
    };
}
class InterfaceExample implements  Showable, Printable {
    public void greet() {
        System.out.println("Hello");
    }

    @Override
    public void print() {
        Printable.super.print();
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample() ;
        obj.print();
        obj.greet();
    }
}