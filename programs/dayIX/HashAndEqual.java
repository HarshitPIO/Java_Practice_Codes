package abhyas.dayIX;

import java.util.Objects;

public class HashAndEqual {
    private String name;
    public HashAndEqual(String name) {
        this.name = name;
    }
    @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            HashAndEqual person = (HashAndEqual) o;
            return Objects.equals(name,person.name);
        }
        @Override
        public int hashCode() {
        return Objects.hash(name);
    }
    public static void main(String[] args) {
        HashAndEqual person1 = new HashAndEqual("Andrew");
        HashAndEqual person2 = new HashAndEqual("Andrew");
        HashAndEqual person3 = new HashAndEqual("Bob");
        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " +person1.equals(person3));
        System.out.println("person1 hashcode: " + person1.hashCode());
        System.out.println("person2 hashcode: " + person2.hashCode());
        System.out.println("person3 hashcode: " + person3.hashCode());
    }
}
