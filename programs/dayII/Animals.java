package abhyas.dayII;
interface BullDog {
    default void sleep() {
        System.out.println("I am sleeping");
    }
   static void eat() {
        System.out.println("Animal is eating");
    }
}
class Cats implements BullDog {


}
public class Animals implements BullDog {
    @Override
    public void sleep() {
        sleep();
    }

    public static void main(String[] args) {
        BullDog.eat();

//        sleep();

    }
}
