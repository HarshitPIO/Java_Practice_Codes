package abhyas.dayII;
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat is Meowing");
    }
}
public class TypeCastingExample {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        //Downcasting
        Cat cat  = (Cat) animal;
        cat.meow();
    }
}
