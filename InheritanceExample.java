package abhyas;

public class InheritanceExample {
     public static void main(String[] args) {
         BabyDog obj = new BabyDog();
         obj.msg();
         obj.bark();
         obj.sleep();
     }
}
class Animal {
   public void msg() {
        System.out.println("animal");
    }
}
class Dog extends Animal {
   public void bark() {
        System.out.println("barking");
    }
}
class BabyDog extends Dog {
    public void sleep() {
        System.out.println("Sleeping");
    }
}